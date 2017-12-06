public class Peca {
    public String cor;
    public int posicao;

    public Peca() {
        this.cor = cor;
        this.posicao = posicao;
    }

    public String getCor() {
        return cor;
    }

    public void mover(int posicoes){
        System.out.println("O jogador andou "+posicoes+" casas");
        this.posicao = posicao + posicoes;
        System.out.println("A posição do jogador é: "+posicao);
    }

    public void comer(){

    }

    public void formarTorre(){

    }
}
