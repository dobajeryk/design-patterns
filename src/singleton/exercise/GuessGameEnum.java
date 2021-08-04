package singleton.exercise;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public enum GuessGameEnum {

    INSTANCE;

    private int score;
    private static final int ILOSC_RUND = 10;

    private GuessGameEnum() {

    }

    public void play() {
        System.out.println("START!");
        for (int i = 0; i < ILOSC_RUND; i++) {
            int random = ThreadLocalRandom.current().nextInt(0, 10);
            System.out.println("Zgadnij cyfre!");
            int guessed = new Scanner(System.in).nextInt();
            if (random == guessed) {
                System.out.println("Odgadles wylosowana liczbe!");
                score++;
            } else {
                System.out.println("Nie odgadles wylosowanej liczby! - " + random);
            }
        }
        System.out.println("Twoj wynik to: " + score);
    }

    public int getScore() {
        return score;
    }

    public static GuessGameEnum getInstance() {
        return INSTANCE;
    }
}
