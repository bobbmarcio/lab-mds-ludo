import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
    ArrayList<Peca> pecas;
    int posicaoAzul;
    int posicaoVerde;
    int posicaoAmarelo;
    int posicaoVermelho;


    public Tabuleiro(){

        Peca pecaVazia= new Peca("", 0);
        this.pecas = new ArrayList<>(52);
        for (int i=0;i<52;i++){
            pecas.add(pecaVazia);
        }
        posicaoAzul = 0;
        posicaoVerde = 13;
        posicaoAmarelo = 26;
        posicaoVermelho = 39;
    }

    void moverPeca(Peca peca, int valorDado) {
        int posicao = 0;
        Peca pecaVazia= new Peca("", 0);
        if (peca.getCor()=="Azul"){
            posicao = posicaoAzul;
        }
        if (peca.getCor()=="Vermelho"){
            posicao = posicaoVermelho;
        }
        if (peca.getCor()=="Amarelo"){
            posicao = posicaoAmarelo;
        }
        if (peca.getCor()=="Verde"){
            posicao = posicaoVerde;
        }
        if (posicao+valorDado > 52){
            posicao = posicao - 52;
        }
        if (this.pecas.get(posicao+valorDado).getCor() != ""){
            this.comerPeca(peca,posicao+valorDado);
        }
        peca.mover(valorDado);
        this.pecas.set(posicao+valorDado, peca);
        this.pecas.set(posicao,pecaVazia);
        System.out.println("A peça de cor " + peca.getCor() + " andou " + valorDado + " casas\n");
    }

    void comerPeca(Peca peca, int casa){
        peca.setPosicao(0);
        Peca pecaVazia= new Peca("", 0);
        if (peca.getCor() == "Azul"){
            this.pecas.set(0,peca);
        }
        if (peca.getCor() == "Amarelo"){
            this.pecas.set(13,peca);
        }
        if (peca.getCor() == "Verde"){
            this.pecas.set(26,peca);
        }
        if (peca.getCor() == "Vermelho"){
            this.pecas.set(39,peca);
        }
        System.out.println("A peça de cor" + peca.getCor() + "foi comida \n");
        this.pecas.set(casa,pecaVazia);
    }
}
