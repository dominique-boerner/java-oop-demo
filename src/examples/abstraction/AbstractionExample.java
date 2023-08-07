package examples.abstraction;

/**
 * This basic example covers the core concept of abstraction.
 * Abstraction is one of the four fundamental principles of object-oriented programming (OOP), alongside encapsulation,
 * inheritance, and polymorphism. Abstraction is the process of simplifying complex real-world entities into their
 * essential characteristics, representing only the relevant attributes and behaviors while hiding the unnecessary
 * details. In OOP, abstraction is achieved through abstract classes and interfaces.
 */
public class AbstractionExample {
    public static void main(String[] args) {
        var bird = new Bird();

        // because the class »Bird« extends the »WingedAnimal«, it can fly...
        bird.fly();

        // because the class »WingedAnimal« extends »Animal«, it can also breathe!
        bird.breathe();

        // Because Animal is now abstract, it can't be initiated.
        /* new Animal(); */
    }
}
