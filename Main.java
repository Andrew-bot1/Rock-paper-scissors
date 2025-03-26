import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        //ask for price of the item
      System.out.println("What is the price of the item?");
      //get input for item price
      Double price = myObj.nextDouble();

      //ask for sales tax
      System.out.println("What is the sales tax of the item?");
      //get input for tax
      Double tax = myObj.nextDouble();

      //ask for discount of the item
      System.out.println("What is the promotion discount of the item?");
      //get input for item discount
      Double discount = myObj.nextDouble();

      //calculate total
      double total = (price * discount) * (tax+1);
      
      //display total cost
      System.out.println("The total cost of the item is " +total);
    }
  }