package singleton.wersjaklasyczna;

import singleton.wersjaklasyczna.GameEngine;

public class Main {
    public static void main(String[] args) {
//        GameEngine gameEngine = new GameEngine();
        GameEngine engine1 = GameEngine.getInstance();
        GameEngine engine2 = GameEngine.getInstance();

        System.out.println(engine1 == engine2);
    }
}
