package loops;

import java.util.Scanner;


/*
Cashier Cost of Items
Write a program that allows a cashier to input the cost of multiple items
 and then calculates the total cost of the items.
 * 
 * */
public class CashierCostofItems {
  public static void main(String[] args) {
    System.out.println("Enter the number of items you would like to scan: "); // prompt the user to enter the number of items
    Scanner scanner = new Scanner(System.in);

    // Store the quantity in integer variable
    int quantity = scanner.nextInt();

    double total = 0;

    // Loop through the quantity of items - for loop
    // taking 3 more statements

    for (int i = 0; i < quantity; i++) { // this runs the loop until the quantity is reached
      System.out.println("Enter the cost of the item: ");
      double price = scanner.nextDouble();
      total = total + price;
      
    }
    scanner.close();
    System.out.println("Total cost of item " + total);


  }
  
}
  
// for loop is used to iterate through a block of code multiple times.
// for loop is used when you know in advance how many times the loop should run. specific number of items
// for loops are commonly used when you know how many times you want to iterate through a loop.
// The for loop has three parts: initialization, condition, and increment/decrement.
// The initialization part is executed only once at the beginning of the loop.
// The condition is checked before each iteration of the loop. If the condition is true, the loop body is executed. If the condition is false, the loop terminates.
// The increment/decrement part is executed after each iteration of the loop.
// The for loop is a pre-test loop, meaning the condition is checked before the loop body is executed.
// The for loop is useful when you know the number of iterations in advance.
// The for loop is commonly used when you want to iterate through a block of code a specific number of times.

// you can nest loops inside other loops to create more complex patterns or iterate through multi-dimensional arrays.