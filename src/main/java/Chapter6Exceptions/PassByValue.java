package Chapter6Exceptions;

public class PassByValue {
    private final int cislo = 3;

    public static void main(String[] args) {
        PassByValue passByValue = new PassByValue();
        System.out.println("global variable: " + passByValue.cislo);
        passByValue.changePrimitive(passByValue.cislo);
        System.out.println("global variable: " + passByValue.cislo);

        final VariableObject variableObject = new VariableObject();
        variableObject.variableObjectCislo = 3;
        System.out.println("before change: " + variableObject.variableObjectCislo);
        variableObject.change(variableObject);
        System.out.println("after change: " + variableObject.variableObjectCislo);
        System.out.println(variableObject);

    }

    public void changePrimitive(int cislo) {
        cislo = 11;
    }
}

class VariableObject {
    public int variableObjectCislo;

    public void change(VariableObject variableObject) {
        variableObject.variableObjectCislo = 10;
    }
}
