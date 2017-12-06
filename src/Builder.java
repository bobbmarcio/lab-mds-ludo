import java.util.List;

public class Builder {

    public static Jogador build_jogador(String nome, String corDaPeca) {
        Peca peca = new Peca(corDaPeca, Util.DENTRO_DA_BASE);
        return new Jogador(nome, peca);
    }

    public static Jogo build_jogo(List<Jogador> jogadores){
        return new Jogo();
    }
}