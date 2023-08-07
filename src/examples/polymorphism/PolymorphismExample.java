package examples.polymorphism;

/**
 * This basic example covers the core concept of polymorphism.
 * Polymorphism is a fundamental concept in object-oriented programming (OOP) that allows objects of different classes to
 * be treated as objects of a common superclass or interface. It enables a single interface to represent multiple types of
 * objects, providing a way to create flexible and reusable code.
 */
public class PolymorphismExample {
    public static void main(String[] args) {
        var penguin = new Penguin();

        // because the class »Bird« extends the »WingedAnimal«, it can fly...
        // ...but actual, penguins can't fly.
        // Learning: We can override methods to change the previous logic.
        penguin.fly();

        // because the class »WingedAnimal« extends »Animal«, it can also breathe!
        penguin.breathe();
    }
}
