import java.util.List;

public class Jogo {
    private List<Jogador> jogadores;

    public Jogo(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void iniciarjogo(){
        Jogador jogador = jogadores.get(0);
        jogador.getNome();
        System.out.println(""+jogador.getNome());
    }
}
