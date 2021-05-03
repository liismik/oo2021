import java.util.ArrayList;

public class Main {
  public static void main(String[] args){
    RaceCar racer1 = new RaceCar("Audi", "A5", CarBodyType.SPORTBACK);
    RaceCar racer2 = new RaceCar("Audi", "A6", CarBodyType.STATION_WAGON);

    System.out.println(racer1 + " WROOOOOOOM");
    System.out.println(racer2 + " wroooOOOOM");
  }
}