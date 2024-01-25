import java.util.ArrayList;
import java.util.Collections;

public class Time {
    private String pais;
    private int qtTitulos;

    public Time(String pais, int qtTitulos, ArrayList<Jogador> jogadores) {
        this.pais = pais;
        this.qtTitulos = qtTitulos;
        this.jogadores = jogadores;
    }
    public void adicionarJogador(Jogador jogador){
        Collections.addAll(jogadores,jogador);
    }
    private ArrayList<Jogador>jogadores = new ArrayList<>();

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getQtTitulos() {
        return qtTitulos;
    }

    public void setQtTitulos(int qtTitulos) {
        this.qtTitulos = qtTitulos;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
}
