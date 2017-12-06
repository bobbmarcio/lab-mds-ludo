public class Jogador {

    private String nome;
    private Peca peca;
    private Jogador() {
    }

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

    public void jogarDado(int quantidadeCasas) {
        validaSaida(quantidadeCasas);

        if (peca.posicao == 1 && quantidadeCasas == 6) {
            jogarDado(quantidadeCasas);
        }
    }

    public void moverPeca(int quantidadeCasas) {
        peca.mover(quantidadeCasas);
        }

    public void validaSaida(int quantidadeCasas) {
        if (peca.situacao == Util.DENTRO_DA_BASE) {
            if (quantidadeCasas == 6) {
                peca.situacao = Util.FORA_DA_BASE;
                moverPeca(quantidadeCasas);
            } else {
                System.out.println("O jogador não saiu da base");
            }
        } else {
            moverPeca(quantidadeCasas);
        }
    }
}