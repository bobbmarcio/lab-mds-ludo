import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Jogador> jogadores = new ArrayList<>(4);

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o nome do jogador Azul");
        String nome = scanner.nextLine();
        jogadores.add(Builder.build_jogador(nome, "Azul"));

        System.out.println("Entre com o nome do jogador Vermelho");
        nome = scanner.nextLine();
        jogadores.add(Builder.build_jogador(nome, "Vermelho"));

        System.out.println("Entre com o nome do jogador Amarelo");
        nome = scanner.nextLine();
        jogadores.add(Builder.build_jogador(nome, "Amarelo"));

        System.out.println("Entre com o nome do jogador Verde");
        nome = scanner.nextLine();
        jogadores.add(Builder.build_jogador(nome, "Verde"));

        tabuleiro.pecas.set(tabuleiro.posicaoAzul, jogadores.get(1).getPeca());
        tabuleiro.pecas.set(tabuleiro.posicaoVermelho, jogadores.get(1).getPeca());
        tabuleiro.pecas.set(tabuleiro.posicaoAmarelo, jogadores.get(2).getPeca());
        tabuleiro.pecas.set(tabuleiro.posicaoVerde, jogadores.get(3).getPeca());

        Jogo jogo = Builder.build_jogo(jogadores, tabuleiro);
        jogo.iniciarjogo();
        }
}