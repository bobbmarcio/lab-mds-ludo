public class Jogador {
    public String nome;
    public Dado dado = new Dado();
    public Peca peca = new Peca();
    public int situacao = 0; //0 = base; 1 = fora da base;

    public Jogador() {
        this.nome = nome;
        this.peca = peca;
    }

    public String getNome() {
        return nome;
    }

    public void jogarDado(){
        dado.setLado();
        validaSaida();

        if (situacao == 1 && dado.getLado() == 6){
            jogarDado();
        }
    }

    public void moverPeca(){
        peca.mover(dado.getLado());
    }

    public void validaSaida(){
        if (peca.posicao == 0){
            if (dado.getLado() == 6){
                situacao = 1;
                moverPeca();
            }else{
                System.out.println("O jogador não saiu da base");
            }
        }else{
            moverPeca();
        }
    }

}
