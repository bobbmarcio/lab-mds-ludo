import java.util.List;

public class Jogo {

    public void iniciarjogo(List<Jogador> jogadores){
        Jogador jogador = jogadores.get(0);
        jogador.getNome();
        System.out.println(""+jogador.getNome());
    }
}
