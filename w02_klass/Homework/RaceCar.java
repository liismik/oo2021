import java.util.Random;

public class RaceCar {
    private int x;
    private int y;

    public String brand = "";
    public String modelName = "";

    public RaceCar(String brand, String modelName, CarBodyType carBodyType) {
        this.brand = brand;
        this.modelName = modelName;
        
        this.x = (int)Math.random();
        this.y = (int)Math.random();
    }

    public int[] getXY(){
        return new int[]{ x, y };
    }

    @Override 
    public String toString(){
        return "My brand is " + brand + ", my model is " + modelName + ". My position is (" + x + ";" + y + ")";
    }
}
