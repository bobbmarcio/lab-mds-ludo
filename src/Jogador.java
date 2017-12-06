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

    public void jogarDado(int quantidadeCasas) {
        validaSaida(quantidadeCasas);

        if (peca.posicao == 1 && quantidadeCasas == 6) {
            jogarDado(quantidadeCasas);
        }
    }

    public void moverPeca(int quantidadeCasas) {
        peca.mover(quantidadeCasas);

        jogarDado(quantidadeCasas);
    }

    public void validaSaida(int quantidadeCasas) {
        peca.posicao = 55;
        if (peca.posicao == 0) {
            if (quantidadeCasas == 6) {
                peca.posicao = 1;
                moverPeca(quantidadeCasas);
            } else {
                System.out.println("O jogador não saiu da base");
            }
        } else {
            moverPeca(quantidadeCasas);
        }
    }
}