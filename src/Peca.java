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
        this.posicao = posicao + posicoes;
    }

    public void comer(){

    }

    public void formarTorre(){

    }
}
