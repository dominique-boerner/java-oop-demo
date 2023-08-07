package examples.polymorphism;

/**
 * Penguin class, which contains properties and
 * methods which all penguins can do.
 */
public class Penguin extends WingedAnimal {

    /**
     * Penguins can't fly. Poor penguins...
     */
    @Override
    public void fly() {
        System.out.println("Oops, i have wings, but i cannot fly.");
    }
}
