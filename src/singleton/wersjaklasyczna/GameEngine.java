package singleton.wersjaklasyczna;

import java.io.Serializable;

public class GameEngine implements Serializable {

    private int hp = 100;
    private String characterName = "Ton";

    private static GameEngine instance;

    private GameEngine() {

    }

    public void run() {
        while (true) {
            //czekamy na input gracza
            //zmieniamy stan gry
            //renderujemy grafike
        }
    }

    public static GameEngine getInstance() {
        if (instance == null) {

            synchronized (GameEngine.class) {
                if (instance == null) {
                    instance = new GameEngine();
                }
            }

            instance = new GameEngine();
        }

        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
