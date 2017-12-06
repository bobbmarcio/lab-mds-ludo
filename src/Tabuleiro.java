public class Tabuleiro {
    Peca[][] casas = new Peca[52][2];
    int inicioAzul = 0;
    int inicioVerde = 13;
    int inicioAmarelo = 26;
    int inicioVermelho = 39;
    
    void colocarPecas(){
    
    }
    
    void moverPeca(Peca peca, int valorDado){
        peca.mover(2);
    }
}
