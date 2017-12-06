import java.util.List;

public class Util {

    public static final int DENTRO_DA_BASE = 0;
    public static final int FORA_DA_BASE = 1;

    public void valida(List<Jogador> jogadores, int i){
        jogadores.get(i).getPeca().getPosicao();
    }
}
