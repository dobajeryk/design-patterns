package strategy.example.chef;

public class Chef {
    private String name;

    public Chef(String name) {
        this.name = name;
    }

    public void cook() {
        System.out.println("Im cooking hard-boiled eggs");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
