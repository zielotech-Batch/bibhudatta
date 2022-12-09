import java.util.Scanner;

public class Helloworld {

    public static void main(String[] args ) {

        //Create a reader instance which takes
       // input from standard input - keyboard
       Scanner reader = new Scanner(System.in);
       System.out.print ("enter a number: ");

      //nestInt() reads the next integer from the keyboard
      int number = reader.nextInt ();

     //println() prints the following line to the output screen
     System.out.println("You entered: " + number);
  }
}
