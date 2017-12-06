public class Dado {
    public int lado;

    public Dado() {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado() {
        int min = 1;
        int max = 6;
        int lado = (int )(Math.random() * max + min);
        this.lado = lado;
        System.out.println("O lado do dado é: "+getLado());
    }
}
