public class Cerveja extends Bebida {
    private double teorAlcoolico;

    public Cerveja(int qtEstoque) {
        super(qtEstoque);
    }

    public double getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public void setTeorAlcoolico(double teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }

    public Cerveja(int qtEstoque, double teorAlcoolico) {
        super(qtEstoque);
        this.teorAlcoolico = teorAlcoolico;
    }
    public void mostrarDados(){
        System.out.println( "\nCerveja: "+"\nTeor alcoolico: " + getTeorAlcoolico() + "\nquantidade em estoque: " + getTeorAlcoolico());
    }
}
