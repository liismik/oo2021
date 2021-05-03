/* 

*) Listile on omane, et elemendid võivad korduda
 
 *) LinkedList - mitte-sünkroniseeritud;
    kiirem add ja remove operatsioonide tegemises, kui ArrayList;

 *) ArrayList - ei ole legacy class; mitte-sünkroniseeritud; kiirem get ja set 
    operatsioonide tegemises, kui LinkedList;

 *) Vector - legacy class; sünkroniseeritud, mille tõttu on aeglasem, kui ArrayList; 
    kasvav või dünaamiline array objektidest; Arrayle sarnaselt 
    sisaldab vektor elemente, millele saab ligi arvulist indeksit kasutades; 

*/

// Näide ArrayListist
import java.util.ArrayList;
import java.util.Collections; 

public class Lists {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        //add funktsioon
        cars.add("Audi A5");
        cars.add("Ford Mustang");
        cars.add("Toyota GT86");
        cars.add("Dodge Challenger");
        cars.add("Lamborghini Aventador");
        cars.add("Nissan Skyline");

        //prindib terve listi
        System.out.println(cars);

        //määrab esimese elemendi
        cars.set(0, "Audi A7");
        //printib esimese elemendi
        System.out.println(cars.get(0));

        //eemaldab viienda elemendi
        cars.remove(4);

        //prindib listi suuruse
        System.out.println(cars.size());

        //prindib listis olevad elemendid for loopiga
        //(ja lisab listi ette ning lõppu eraldavad jooned)
        for (int i = 0; i < cars.size(); i++) {
            if (i == 0) {
                System.out.println("---------------");
            } 

            System.out.println(cars.get(i));

            if (i == cars.size()-1) {
                System.out.println("---------------");
            } 
        }

        System.out.println("---------------");
        //prindib listis olevad elemendid for-each loopiga
        for (String i : cars) {
            System.out.println(i);
        }

        System.out.println("---------------");
        
        Collections.sort(cars);
        for (String i : cars) {
            System.out.println(i);
        }

        //teeb terve listi tühjaks
        cars.clear();
        System.out.println(cars);
    }
}
