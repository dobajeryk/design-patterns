package singleton.przyklad;

public class GameEngine {

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
            instance = new GameEngine();
        }

        return instance;
    }
}
