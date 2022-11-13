package Chapter3CoreJavaApis;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {

    public static void main(String[] args) {
        final List<Integer> numbers = new ArrayList<>();
        numbers.add(null);
        System.out.println(numbers.get(0));
        numbers.remove(0);
        numbers.add(1);
        numbers.add(2);
        System.out.println(numbers);
        numbers.remove(new Integer(2));
        System.out.println(numbers);
    }
}
