package Chapter4MethodsAndEncapsulation;

public class VarArg {
    public void howMany(boolean b, boolean... b2){
        System.out.println(b2.length);
    }

    public static void main(String[] args) {
        VarArg var = new VarArg();
        var.howMany(true);
        var.howMany(true,true);
        var.howMany(true,true,true);
        var.howMany(true,new boolean[2]);
    }
}
