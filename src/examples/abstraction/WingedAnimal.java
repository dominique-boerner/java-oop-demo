package examples.abstraction;

public class WingedAnimal extends Animal implements Wings {
    public void fly() {
        System.out.println("I believe i can fly.");
    }
}