package Chapter5ClassDesign;

import java.util.Arrays;

public class Dog extends Animal {
//    public Dog(){
//
//    }
//    public Dog(String name) {
//        super(name);
//    }

    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.eat();
        int[] array = {2, 4, 6, 8, 10, 12, 14};
        for(int i = 0 ; i<=15; i++){
        System.out.println(i +": " + Arrays.binarySearch(array, i));
        }
    }

    @Override
    public void eat() {
        System.out.println("child");
    }

    public void bark() {
        System.out.println("only dog barks");
    }
}
