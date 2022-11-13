package Chapter4MethodsAndEncapsulation;

public class CallStaticMethodAfterNull {
    public static String textName = "name";
    public static void methodText(){
        System.out.println(textName);
    }

    public static void main(String[] args) throws StackOverflowError{
        CallStaticMethodAfterNull call = new CallStaticMethodAfterNull();
        call.methodText();
        System.out.println(call.textName);
//        call.fly()
        call = null;
        call.methodText();
        System.out.println(call.textName);
    }
}
