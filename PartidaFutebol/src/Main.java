import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pedro","zagueiro",10);
        Jogador jogador2 = new Jogador("João","atacante",11);
        Jogador jogador3 = new Jogador("antonio","meio-campo",5);
        Jogador jogador4 = new Jogador("zé","zagueiro",10);
        Jogador jogador5 = new Jogador("vitor","atacante",11);
        Jogador jogador6 = new Jogador("Lucas","meio-campo",5);

        ArrayList<Jogador>jogadores1 = new ArrayList<>();
        jogadores1.add(jogador1);
        jogadores1.add(jogador2);
        jogadores1.add(jogador3);

        ArrayList<Jogador>jogadores2 = new ArrayList<>();
        jogadores2.add(jogador4);
        jogadores2.add(jogador5);
        jogadores2.add(jogador6);

        Time time1 = new Time("Brasil",10,jogadores1);
        Time time2 = new Time("França",8,jogadores2);

        Estadio estadio1 = new Estadio("Morumbi","São Paulo");

        Partida partida1 = new Partida("21/12/2002","10:30",3,2,time1,time2,estadio1);
        partida1.mostrarDados();
        partida1.atualizarResultado(1,1);
        partida1.mostrarDados();
        time1.adicionarJogador(jogador4);

    }
}