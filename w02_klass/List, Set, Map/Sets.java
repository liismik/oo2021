/* 

*) Setile on omane, et elemendid ei kordu

 *) HashSet - elemendid ei ole sorteeritud ega 
    järjestatud, kiirem kui TreeSet; implementatsioon Setist

 *) TreeSet - elemendid on sorteeritud või 
    järjestatud

*/

//näide HashSetist
import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Audi A5");
        cars.add("Ford Mustang");
        cars.add("Toyota GT86");
        cars.add("Dodge Challenger");
        cars.add("Lamborghini Aventador");
        cars.add("Nissan Skyline");

        //prindib välja terve seti
        System.out.println(cars);

        //kontrollib, las set sisaldab kindlat elementi
        System.out.println(cars.contains("BMW i8"));

        //eemaldab nõutud elemendi
        cars.remove("Lamborghini Aventador");

        //prindib seti suuruse
        System.out.println(cars.size());

        //prindib setis olevad elemendid for-each loopiga
        for (String i : cars) {
            System.out.println(i);
        }

        //teeb seti tühjaks
        cars.clear();
        System.out.println(cars);


    }
}
