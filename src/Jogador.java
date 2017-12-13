public class Jogador {

    private String nome;
    private Peca peca;

    public Jogador(String nome, Peca peca) {
        this.nome = nome;
        this.peca = peca;
    }

    public String getNome() {
        return nome;
    }

    public Peca getPeca() {
        return peca;
    }


}