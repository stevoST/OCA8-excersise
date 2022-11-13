package Chapter5ClassDesign.staticMethodHide.nonStaticMethod;

import java.util.ArrayList;
import java.util.List;

public class Kangaroo extends Marsupial {
    public boolean isBiped() {
        return true;
    }
    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: "+isBiped());
    }
    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();
        Marsupial parent = new Kangaroo();
        System.out.println(parent.isBiped());
    }
}
