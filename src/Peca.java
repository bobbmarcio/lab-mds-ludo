public class Peca {
    private String cor;
    private int posicao;
    private int situacao;
    private boolean fora;
    private boolean ceu;

    public Peca(String cor, int posicao) {
        this.cor = cor;
        this.posicao = posicao;
    }

    public String getCor() {
        return cor;
    }


    public void mover(int valor){
            this.posicao = this.posicao + valor;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao){
        this.posicao = posicao;
    }

    public int getSituacao(){
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
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
