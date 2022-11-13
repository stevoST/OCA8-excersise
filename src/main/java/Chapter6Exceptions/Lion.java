package Chapter6Exceptions;

public class Lion implements Roar {

    public static void main(String[] args) {
//        Chapter6Exceptions.Lion lion = new Chapter6Exceptions.Lion();
//        lion.roar();
//        System.out.println("test");
        String cislo = "3a";
        Integer.parseInt(cislo);
        System.out.println("text");
    }

    @Override
    public void roar() throws NumberFormatException {
        System.out.println("roar metoda");
    }
}