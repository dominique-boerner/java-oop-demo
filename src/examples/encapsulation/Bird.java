package examples.encapsulation;

/**
 * Bird class, which contains properties and
 * methods which all birds can do.
 */
public class Bird {
    public String name;
    public int size;
    public String sizeUnit;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSizeUnit() {
        return sizeUnit;
    }

    public void setSizeUnit(String sizeUnit) {
        this.sizeUnit = sizeUnit;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return String.format("Hello! I'am %s, a %s%s tall bird! Cheep cheep!",
                this.getName(), this.getSize(), this.getSizeUnit());
    }
}
