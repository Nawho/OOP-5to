public class Cliente extends Persona{
    private int CBU;

    public Cliente(String nombre, int DNI, int CBU) {
        super(nombre, DNI);
        this.CBU = CBU;
    }

    public Cliente(){
        super();
        this.CBU = 1010100101;
    }

    public int getCBU() {
        return CBU;
    }

    public void setCBU(int CBU) {
        this.CBU = CBU;
    }
}
