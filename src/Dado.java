package ludo;


import java.util.Random;

public class Dado {
    public int lado;

    public int getLado() {
        return lado;
    }

    public int setLado() {
        this.lado = new Random().nextInt(6) + 1;
        return this.lado;
    }
}