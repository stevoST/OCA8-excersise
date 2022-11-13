package Chapter3CoreJavaApis;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
    public static void main(String[] args) {

        //question 24
        String[] names = {"Tom", "Dick", "Harry"};
        //List<String> list = names.asList(); // as list does not exists
        List<String> list = Arrays.asList(names);
        list.set(0, "Sue");
        System.out.println(names[0]);
    }
}
