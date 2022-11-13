package Chapter3CoreJavaApis;


import java.util.ArrayList;
import java.util.List;

public class TestListMethods {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>(); // list of animals
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));
        System.out.println(animals);
        System.out.println("remove from list based on index returns object: " + animals.remove(3));
        System.out.println(animals);

        final Animal turtleAnimal = new Animal("turtle", false, true);
        animals.add(turtleAnimal);
        System.out.println(animals);

        final Animal turtleAnimalNew = new Animal("turtle", false, true);
        System.out.println("remove from list based on new object returns boolean: " + animals.remove(turtleAnimalNew));
        System.out.println(animals);

        System.out.println("remove from list based on reference object returns boolean: " + animals.remove(turtleAnimal));
        System.out.println(animals);


        Animal animal = animals.set(1, new Animal("doggo", true, true));
        System.out.println("animal replaced in list: " + animal);
        System.out.println(animals);

    }

}
