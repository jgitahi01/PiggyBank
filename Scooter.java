/***************************Scooter.java**********************/


/**
* The Class Scooter.
*/
public class Scooter {

   /**
   * The main method.
   *
   * @param args the arguments
   */
   public static void main(String[] args) {

       // declare base variables
       int time = 2;
       double uberCost = 0.50, birdCost = 1.30;
       System.out.printf("%10s%20s%20s\n", "Duration", "Uber", "Bird");// print headers
       while (time <= 30) {

           System.out.printf("%10d%20.2f$%20.2f$\n", time, uberCost, birdCost);// print values
           time += 2;
           uberCost += .50;
           birdCost += .30;
       }
   }
}