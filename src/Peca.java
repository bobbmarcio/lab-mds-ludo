package ludo;

public class Peca {
    public String cor;
    public int posicao;
    public boolean fora;
    public boolean ceu;

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
    
    public int getPosicao() {
        return posicao;
    }

    public boolean isFora() {
        return fora;
    }

    public boolean isCeu() {
        return ceu;
    }

    public void setFora(boolean fora) {
        this.fora = fora;
    }

    public void setCeu(boolean ceu) {
        this.ceu = ceu;
    }
    
    
}
