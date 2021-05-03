/*

 *) HashMap - lubab ühte null-võtit ning mitmeid null väärtuseid;
    lubab heterogeenseid väärtuseid sest ei vii läbi võtmete sorteerimist;
    kiirem, kui TreeMap;

 *) TreeMap - ei luba ühtegi null-võtit kuid võib olla mitmeid null väärtuseid;
    lubab homogeenseid väärtuseid võtmetena sest viib läbi sorteerimist;
    aeglasem, kui HashMap;

*/

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, String> carModels = new HashMap<String, String>();

        carModels.put("Audi", "A5");
        carModels.put("Ford", "Mustang");
        carModels.put("Toyota", "GT86");
        carModels.put("Dodge", "Challenger");
        carModels.put("Lamborghini", "Aventador");
        carModels.put("Nissan", "Skyline");

        //prindib terve mapi
        System.out.println(carModels);

        //prindib kindla mapist kindlale võtmele vastava väärtuse
        System.out.println(carModels.get("Audi"));

        //eemaldab mapist kindla võtme ja temale vastava väärtuse
        carModels.remove("Lamborghini");

        //prindib mapi suuruse
        System.out.println(carModels.size());

        //prindib mapi kõik (võtmed ja) väärtused for-each loopiga kahel erineval viisil
        for (String i : carModels.keySet()) {
            System.out.println("Võti: " + i +" | Väärtus: " + carModels.get(i));
        }

        for (String i : carModels.values()) {
            System.out.println(i);
        }

        //eemaldab mapist kõik võtmed ja nende väärtused
        carModels.clear();
        System.out.println(carModels);
    }
    
}
