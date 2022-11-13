package Chapter5ClassDesign;

public class Animal {
    public Animal() {
        System.out.println("empty constructor");
    }

    public Animal(String name) {
        this();

    }

    public static void main(String[] args) {
        Animal animal = new Animal("name");

    }

    public void eat(){
        System.out.println("parent");
    }
}
