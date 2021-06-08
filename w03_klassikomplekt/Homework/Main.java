package Homework;

public class Main {
    public static void main (String[] args){
        Fridge fridge = new Fridge("I'm a fridge");
        System.out.println(fridge.name);

        Warehouse warehouse = new Warehouse();
        warehouse.add(fridge);
        System.out.println(warehouse.list);

        var count = warehouse.list.size();
        System.out.println(count);

        warehouse.remove(fridge);
        System.out.println(warehouse.list);
        
        count = warehouse.list.size();
        System.out.println(count);
    }
}
