import java.util.*; 

public class proovikt {
    
    public static Double aritkesk(Double x, Double y, Double z){

        Double tulemus = (x+y+z)/3.0;

        return tulemus;
    }

    public static String libisevkesk(java.util.List<Double> list){

        java.util.List<Double> list2 = new ArrayList<>();

        for (int i = 0; i < (list.size())-2; i++){

            Double a=list.get(i);
            Double b=list.get(i+1);
            Double c=list.get(i+2);

            Double keskmine = (aritkesk(a, b, c));
            list2.add(keskmine);
        }
        return list2.toString();
    }

    public static void main(String[] args){

        System.out.println("Keskmise leidmine");
        System.out.println(aritkesk(5.0, 7.0, 3.0));

        java.util.List<Double> list = new ArrayList<>();
        list.add(2.0);
        list.add(4.0);
        list.add(6.0);
        list.add(8.0);
        list.add(10.0);
        list.add(12.0);

        System.out.println("Libiseva keskmise list");
        System.out.println(libisevkesk(list));;
    }

}
