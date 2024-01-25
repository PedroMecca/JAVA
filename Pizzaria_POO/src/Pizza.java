import java.util.ArrayList;
import java.util.List;

public class Pizza extends Produto {
    public String bordaRecheada;

    public Pizza(String bordaRecheada, List<Ingrediente> ingredientes) {
        this.setBordaRecheada(bordaRecheada);
        this.setIngredientes(ingredientes);
    }

    private List<Ingrediente> ingredientes = new ArrayList<>();

    public String getBordaRecheada() {
        return bordaRecheada;
    }

    public void setBordaRecheada(String bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
    public void mostrarDados(){
        for (Ingrediente i: ingredientes){
            System.out.println("ingredientes: \n" + i.getNome());
        }
        System.out.println("Borda Recheada: " +getBordaRecheada());
    }
}
