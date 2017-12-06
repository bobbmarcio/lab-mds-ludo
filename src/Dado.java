public class Dado {

    public int getValor() {
        int min = 1;
        int max = 6;
        return (int) (Math.random() * max + min);
    }
}