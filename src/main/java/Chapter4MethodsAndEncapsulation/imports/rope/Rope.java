package Chapter4MethodsAndEncapsulation.imports.rope;

public class Rope {
    public static int LENGTH = 5;

    static {
        LENGTH = 10;
    }

    public static void swing() {
        System.out.print("swing ");
    }
}