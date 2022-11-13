package Chapter3CoreJavaApis;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[] array = {"hawk", "robin"};
        List<String> list = Arrays.asList(array);
        System.out.println(list.size());
        list.set(1,"test");
        array[0] = "new";
        System.out.println(list);
        for(String b : array){
            System.out.println(b+ " ");
            list.remove(1);
        }
    }
}
