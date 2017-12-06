public class Jogador {
    public String nome;
    public Dado dado = new Dado();
    public Peca peca = new Peca();

    public Jogador() {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void jogarDado(){
        dado.setLado();
    }

    public void moverPeca(){
        peca.mover(dado.getLado());
    }
}
