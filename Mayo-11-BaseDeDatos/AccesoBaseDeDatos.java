import java.sql.*;

public class AccesoBaseDeDatos {

    private Connection conexion;
    private final String nombreBaseDeDatos;
    private final String nombreTabla;

    public AccesoBaseDeDatos(String nombreBaseDeDatos, String nombreTabla) {
        this.nombreBaseDeDatos = nombreBaseDeDatos;
        this.nombreTabla = nombreTabla;
    }

    public void conectar(String user, String password) {
        String url = "jdbc:mysql://localhost:3306/" + this.nombreBaseDeDatos;

        try {
            conexion = DriverManager.getConnection(url, user, password);

            if (conexion != null) {
                System.out.println("Se ha conectado exitosamente con la base de datos");
            } else {
                System.out.println("No se ha podido conectar con la base de datos");
            }

        } catch (SQLException excepcion) {
            excepcion.printStackTrace();
        }

    }

    public void modificarTabla(String consulta) {
        /* INSERT, UPDATE, DELETE */
        try {
            Statement sentencia = this.conexion.createStatement();
            sentencia.executeUpdate(consulta);
            sentencia.close();

        } catch (SQLException excepcion) {
            excepcion.printStackTrace();
        }
    }

    public ResultSet obtenerResultado(String consulta){
        ResultSet resultado = null;

        try {
            Statement sentencia = this.conexion.createStatement();
            resultado = sentencia.executeQuery(consulta);

        } catch (SQLException excepcion) {
            excepcion.printStackTrace();
        }

        return resultado;
    }

    public ResultSet seleccionarTodo(){
        String consulta = "SELECT * FROM " + this.nombreTabla;
        ResultSet resultado = this.obtenerResultado(consulta);
        return resultado;
    }

    public void imprimirDatos() {

        ResultSet resultado = this.seleccionarTodo();

        try {
            while (resultado.next()) {

                int id = resultado.getInt("id");
                String nombre = resultado.getString("pkname");
                int tipo1 = resultado.getInt("type1");
                int tipo2 = resultado.getInt("type2");

                System.out.printf("ID: %s - Nombre: %s - Type1: %s - Type2: %s%n", id, nombre, tipo1, tipo2);
            }

            resultado.close();

        } catch (SQLException excepcion) {
            excepcion.printStackTrace();
        }
    }
}
