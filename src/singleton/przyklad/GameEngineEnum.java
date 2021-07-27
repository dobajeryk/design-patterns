package singleton.przyklad;

public enum GameEngineEnum {

    INSTANCE;

    private int hp = 100;
    private String characterName = "Ton";

    private GameEngineEnum() {

    }

    public void run() {
        while (true) {
            //czekamy na input gracza
            //zmieniamy stan gry
            //renderujemy grafike
        }
    }
}
