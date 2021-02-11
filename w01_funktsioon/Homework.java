public class Homework {
    public static String stepGen(int max, int min){
        System.out.println("Upon running, this program will tell you whether you must step forward or move back a certain amount of times. Think of it as a die with a twist.");

        double doubleRandomNumber = ((Math.random() * (max - min)) + min);
        int randomNumber = (int)doubleRandomNumber;

        /* even numbers allow the user to move forward a certain amount of steps, 
        the amount being [1-6], uneven numbers doing the opposite */

        if (randomNumber % 2 == 0) {
            int moveForward = randomNumber / 2;
            return "You must move " + moveForward + " steps forward.";
        } else {
            double doubleMoveBackward = (randomNumber * 0.5) + 0.5;
            int moveBackward = (int)doubleMoveBackward;
            return "You must move " + moveBackward + " steps backward.";
        }
      }
      public static void main(String[] arg) {
        int max = 13;
        int min = 1;
        System.out.println(stepGen(max, min));
      }
}
