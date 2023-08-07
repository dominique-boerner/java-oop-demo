package examples.inheritance;

/**
 * This basic example covers the core concept of inheritance.
 * Inheritance is one of the four primary principles of Object-Oriented Programming (OOP), the others being encapsulation,
 * abstraction, and polymorphism. Inheritance allows for the creation of a new class that is based on an existing class.
 * The new class inherits attributes and behavior (methods) from the existing class. This promotes the concept of
 * reusability and establishes a relationship between the parent (superclass) and the child (subclass).
 */
public class InheritanceExample {
    public static void main(String []args) {
        var bird = new Bird();

        // because the class »Bird« extends the »WingedAnimal«, it can fly...
        bird.fly();

        // because the class »WingedAnimal« extends »Animal«, it can also breathe!
        bird.breathe();
    }
}
