package Homework;
import java.util.ArrayList;

public class Warehouse {
    ArrayList<Fridge> list = new ArrayList<>();

    public void add(Fridge fridge) {
        list.add(fridge);
    }

    public void remove(Fridge fridge) {
        list.remove(fridge);
    }
}
