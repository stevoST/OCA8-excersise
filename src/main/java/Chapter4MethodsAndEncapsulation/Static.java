package Chapter4MethodsAndEncapsulation;

public class Static {
    private String name = "Static class";
    public static void first() { }
    public static void second() { }
//    public static void third() { System.out.println(name); }
    public static void main(String args[]) {
        first();
        second();
//        third(); // DOES NOT COMPILE
    } }
