package Chapter2JavaStatements;

import Chapter4MethodsAndEncapsulation.Panda;

public class NonReachableElse {
    public static void main(String[] args) {
        int x = 10;
        if(x<15){
            System.out.println("less than 15");
        } else if(x<11){
            System.out.println("less than 11");
        } else {
            System.out.println("equals or more than 15");
        }
    }
}
