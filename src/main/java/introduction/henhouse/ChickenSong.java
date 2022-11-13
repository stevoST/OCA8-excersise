package introduction.henhouse;

import java.util.ArrayList;
import java.util.List;

public class ChickenSong {
public static void main(String[] args) {
    List<Chicken> chickens = new ArrayList<>();
        HenHouse house =  new Hen();
        Chicken chicken = house.getChickens().get(0);
        for(int i=0; i<house.getChickens().size();
               chicken = house.getChickens().get(i++)) {
            System.out.println("Cluck");
             } } }
