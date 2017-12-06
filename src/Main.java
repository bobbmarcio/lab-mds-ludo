import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final List<Jogador> jogadores = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println("Entre com o nome do jogador " + (i + 1));
            Scanner scanner = new Scanner(System.in);
            String nome = scanner.nextLine();

            System.out.println("Entre com a cor do jogador " + (i + 1));
            String cor = scanner.nextLine();

            jogadores.add(Builder.build_jogador(nome, cor));
        }

        Jogo jogo = Builder.build_jogo(jogadores);
        jogo.iniciarjogo();
        }
}