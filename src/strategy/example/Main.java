package strategy.example;

import strategy.example.chef.Chef;

public class Main {
    public static void main(String[] args) {
        // new order - hard-boiled eggs
        Chef chef = new Chef("Gordon Gesler");
        chef.cook();

        // new order - soft-boiled eggs
        chef.cook();
    }
}
