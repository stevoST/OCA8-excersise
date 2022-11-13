package introduction.henhouse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hen implements HenHouse{
    @Override
    public List<Chicken> getChickens() {
        List<Chicken> chickens = new ArrayList<>();
        chickens.add(new Chicken());
        return chickens;
    }
}
