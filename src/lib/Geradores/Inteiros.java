package lib.Geradores;

import java.util.Random;

public class Inteiros {
    public static int gerar(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
