public class Vinho extends Bebida{
    private String uva;
    private String paisOrigem;

    public Vinho(int qtEstoque,String uva,String paisOrigem) {
        super(qtEstoque);
        this.uva = uva;
        this.paisOrigem = paisOrigem;
    }


    public String getUva() {
        return uva;
    }

    public void setUva(String uva) {
        this.uva = uva;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
    public void mostrarDados(){
        System.out.println("\nVinho: " + "\nUva: " +getUva()+ "\nPais de Origem: " + getPaisOrigem() + "\nquantidade em estoque: " + getQtEstoque());
    }
}
