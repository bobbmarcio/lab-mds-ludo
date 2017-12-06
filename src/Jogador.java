public class Jogador {
    public String nome;
    public Dado dado = new Dado();
    public Peca peca = new Peca();

    public Jogador() {
        this.nome = nome;
        this.peca = peca;
    }

    public String getNome() {
        return nome;
    }

    public void jogarDado(){
        dado.setLado();
        moverPeca();
    }

    public void moverPeca(){
        peca.mover(dado.getLado());
        System.out.println("O jogador andou "+dado.getLado()+" casas");
        System.out.println("O jogador está na casa "+peca.posicao);

        if (dado.getLado() == 6){
            System.out.println("O jogador tirou o número 6 e deve jogar novamente.");
            jogarDado();
        }
    }
}
