import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ingrediente ingrediente1 = new Ingrediente("tomate");
        Ingrediente ingrediente2 = new Ingrediente("Calabresa");
        Ingrediente ingrediente3 = new Ingrediente("oregano");

        List<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(ingrediente1);
        ingredientes.add(ingrediente2);
        ingredientes.add(ingrediente3);

        Pizza pizza1 = new Pizza("catupiry",ingredientes);
        pizza1.mostrarDados();

        Cerveja cerveja1 = new Cerveja(10,5);
        Vinho vinho1 = new Vinho(10,"verde","frança");
        cerveja1.mostrarDados();
        vinho1.mostrarDados();
    }
}