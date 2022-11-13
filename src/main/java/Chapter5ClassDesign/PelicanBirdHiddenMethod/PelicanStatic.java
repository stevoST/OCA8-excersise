package Chapter5ClassDesign.PelicanBirdHiddenMethod;

public class PelicanStatic extends BirdStatic{

    public static void method1(){
        System.out.println("Pelican method");
    }

    public static void main(String[] args) {
        PelicanStatic.method1();
        BirdStatic.method1();
        PelicanStatic pelicanStatic = new PelicanStatic();
        BirdStatic birdStatic = new BirdStatic();
    }
}
