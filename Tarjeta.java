public class Tarjeta {
    private int numero;
    private String banco;
    private char tipo;

    public Tarjeta(int numero, String banco, char tipo) {
        this.numero = numero;
        this.banco = banco;
        this.tipo = tipo;
    }

    public Tarjeta() {
        this.numero = 102;
        this.banco = "Santander";
        this.tipo = 'd';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
}
