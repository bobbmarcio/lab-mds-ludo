import java.util.List;

public class Jogo {
    private List<Jogador> jogadores;
    Dado dado = new Dado();
    int posicao;

    public Jogo(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void iniciarjogo(){
        System.out.println("============================================\n"+"O jogo irá começar\n"+"============================================\n");
        while (posicao < 20){
        for (int i = 0; i < 4; i++) {
            System.out.println("É a vez do jogador " + (i + 1));
            Jogador jogador = jogadores.get(i);
            jogador.jogarDado(dado.getValor());
            System.out.println("\n");
            posicao = jogadores.get(i).getPeca().getPosicao();
            if (posicao >= 20){
                System.out.println("O jogador "+jogadores.get(i).getNome()+" venceu");
                break;
            }
        }
        }
    }
}
