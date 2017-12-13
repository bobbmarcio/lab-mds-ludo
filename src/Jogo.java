import java.util.List;
import java.util.Scanner;

public class Jogo {
    private Tabuleiro tabuleiro ;
    private List<Jogador> jogadores;
    Dado dado = new Dado();
    boolean partida = true;

    public Jogo(List<Jogador> jogadores, Tabuleiro tabuleiro) {
        this.jogadores = jogadores;
        this.tabuleiro = tabuleiro;
    }

    public void iniciarjogo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("============================================\n"+"O jogo irá começar\n"+"============================================\n");
        while (partida == true){
        for (int i = 0; i < 4; i++) {
            Jogador jogador = jogadores.get(i);
            System.out.println("É a vez do jogador " + jogador.getPeca().getCor() + " de nome : " + jogador.getNome()+"\n" );
            System.out.println("Digite algo para jogar o dado");
            scanner.nextLine();
            tabuleiro.moverPeca(jogador.getPeca(),dado.getValor());
            System.out.println("\n");
            if (jogador.getPeca().getPosicao()>= 52){
                System.out.println("Jogador" + jogador.getPeca().getCor() + " de nome : " + jogador.getNome() + " ganhou!!!!!!!!\n");
            }
        }
        }
    }
}
