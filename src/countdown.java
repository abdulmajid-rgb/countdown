import java.util.Scanner;

public class countdown {
    public static void main (String [] args)
    {
      int userInput ;
        Scanner keybd = new Scanner(System.in);
        System.out.println("Enter a number");
        userInput=keybd.nextInt();
      while (userInput >= 10) {
          System.out.println("p " + userInput);
          userInput--;
      }

    }
}
