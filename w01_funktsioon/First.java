public class First {
    public static void main(String[] args){
        //System.out.println(args.length);
        int[] numberArray = new int[5];
        int numberArray2[] = new int[5];

        String[] stringArray = new String[5];
        String[] greetingsArray = new String[]{ "Hello", "world", "!"}; //algväärtustamisega

        String name = "Liisa";
        int year = 2021;

        //primitiivtüübid
        int myInt = Integer.MAX_VALUE;
        long myLong = Long.MAX_VALUE;
        byte bait = Byte.MAX_VALUE-1;
        short myShort = Short.MAX_VALUE;
        double doubleNumber = 3.4;
        float floatNumber = 3.4f;
        boolean flag = true; //false
        char character = 'F';

         // fori tsükkel
        for (int i = 0; i < greetingsArray.length; i++){ // for (int i = 0; i < args.length; i++){
            System.out.println(greetingsArray[i]); // System.out.println(args[i]);
        }

        // foreach tsükkel
        for (String text : greetingsArray){ // for (String text : args)
            System.out.println(text);
        }

        // while tsükkel
        int length = greetingsArray.length; // args.length
        while (length > 0){
            length--;
            System.out.println("Inside while");
        }

        if (year == 2021){
            System.out.println(year + " is equal to 2021");
        } else if (year > 2021){
            System.out.println(year + " is larger than 2021");
        } else {
            System.out.println(year + " is not equal or larger to 2021");
        }

        System.out.println("Hello world");
        System.out.print("Test one");
        // println tuleb koos reavahetusega, print ei tule
        System.out.print("\n");
        System.out.print("Test two");

        String hello = "Hello world!";
    }
}

// cls clearib terminali, F5 jooksutab koodi
// ALT+SHIFT A kommenteerib välja suuremal hulgal koodi

//javac First.java
//java First
//java First 1 2 3 4 5 6 7