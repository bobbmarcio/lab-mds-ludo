import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
    List<Peca> pecas = new ArrayList<>(52);
    int lugarAzul;
    int lugarVerde;
    int lugarAmarelo;
    int lugarVermelho ;




    public Tabuleiro(){
        for(int i=0;i<52;i++){
            this.pecas.set(i,null);
        }
        lugarAzul = 0;
        lugarVerde = 13;
        lugarAmarelo = 26;
        lugarVermelho = 39;
    }

    void moverPeca(Peca peca, int valorDado){
        for (int i=0;i<valorDado;i++){
            if (peca.cor == "Azul"){
                peca.mover(1);
                this.pecas.set(lugarAzul+1,peca);
                this.pecas.set(lugarAzul,null);
                lugarAzul++;
            };
            if (peca.cor == "Vermelha"){
                peca.mover(1);
                this.pecas.set(lugarVermelho+1,peca);
                this.pecas.set(lugarVermelho,null);
                lugarVermelho++;
            }
            if (peca.cor == "Verde"){
                peca.mover(1);
                this.pecas.set(lugarVerde+1,peca);
                this.pecas.set(lugarVerde,null);
                lugarVerde++;
            }
            if (peca.cor == "Amarela"){
                peca.mover(1);
                this.pecas.set(lugarAmarelo+1,peca);
                this.pecas.set(lugarAmarelo,null);
                lugarAmarelo++;
            }
        }
    }
}
