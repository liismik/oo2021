package My_homework;

public class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();

        System.out.println("\n");

        Horse myHorse = new Horse();
        myHorse.animalSound();
        myHorse.sleep();
    }
}
