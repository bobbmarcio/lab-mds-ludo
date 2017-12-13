import java.util.List;

public class Jogo {
    private Tabuleiro tabuleiro ;
    private List<Jogador> jogadores;
    Dado dado = new Dado();
    boolean partida = true;
    int posicao;

    public Jogo(List<Jogador> jogadores, Tabuleiro tabuleiro) {
        this.jogadores = jogadores;
        this.tabuleiro = tabuleiro;
    }

    public void iniciarjogo(){
        System.out.println("============================================\n"+"O jogo irá começar\n"+"============================================\n");
        while (partida == true){
        for (int i = 0; i < 4; i++) {
            System.out.println("É a vez do jogador " + (i + 1));
            Jogador jogador = jogadores.get(i);
            tabuleiro.moverPeca(jogador.getPeca(),dado.getValor());
            System.out.println("\n");
            posicao = jogadores.get(i).getPeca().getPosicao();
            if (posicao >= 52){
                System.out.println("O jogador "+jogadores.get(i).getNome()+" venceu");
                break;
            }
        }
        }
    }
}
