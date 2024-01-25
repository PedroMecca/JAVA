public class Bebida extends Produto {
    private int qtEstoque;

    public Bebida(int qtEstoque) {
        this.qtEstoque = qtEstoque;
    }

    public int getQtEstoque() {
        return qtEstoque;
    }

    public void setQtEstoque(int qtEstoque) {
        this.qtEstoque = qtEstoque;
    }
}
