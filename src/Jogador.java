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
        System.out.println("Entrou na jogarDado");
        dado.setLado();
        System.out.println("Jogou o dado");
        System.out.println("Lado jogarDado:"+dado.getLado());
    }

    public void moverPeca(){
        System.out.println("Entrou na moverPeca. Lado: "+dado.getLado());
        peca.mover(dado.getLado());
    }
}
