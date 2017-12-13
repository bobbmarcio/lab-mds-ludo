import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Jogador> jogadores = new ArrayList<>();

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o nome do jogador 1");
        String nome = scanner.nextLine();
        jogadores.add(Builder.build_jogador(nome, "Azul"));

        System.out.println("Entre com o nome do jogador 2");
        nome = scanner.nextLine();
        jogadores.add(Builder.build_jogador(nome, "Vermelho"));

        System.out.println("Entre com o nome do jogador 3");
        nome = scanner.nextLine();
        jogadores.add(Builder.build_jogador(nome, "Amarelo"));

        System.out.println("Entre com o nome do jogador 4");
        nome = scanner.nextLine();
        jogadores.add(Builder.build_jogador(nome, "Verde"));

        tabuleiro.pecas.set(tabuleiro.lugarAzul, jogadores.get(0).getPeca());
        tabuleiro.pecas.set(tabuleiro.lugarVermelho, jogadores.get(1).getPeca());
        tabuleiro.pecas.set(tabuleiro.lugarAmarelo, jogadores.get(2).getPeca());
        tabuleiro.pecas.set(tabuleiro.lugarVerde, jogadores.get(3).getPeca());

        Jogo jogo = Builder.build_jogo(jogadores, tabuleiro);
        jogo.iniciarjogo();
        }
}