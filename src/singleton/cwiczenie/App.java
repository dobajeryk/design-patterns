package singleton.cwiczenie;

public class App {
    public static void main(String[] args) {
        GuessGameEnum game = GuessGameEnum.getInstance();

        game.play();

        int score = game.getScore();

        GuessGameEnum anotherGameReference = GuessGameEnum.getInstance();

        if (game == anotherGameReference) {
            System.out.println("Singleton!");
            if (score == anotherGameReference.getScore()) {
                System.out.println("I punkty się zgadzają!");
            }
        }
    }
}
