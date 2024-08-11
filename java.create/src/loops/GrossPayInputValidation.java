//? While loops Input Validation

// This program calculates the gross pay for an employee based on the number of hours worked and the hourly rate.
/*  Why using a while loop for input validation is a good idea because it allows the program to keep asking for input until the user enters a valid value. 
This is especially useful when the user is likely to make mistakes, such as entering a negative number or a number that is too large. By using a while loop, the program can keep asking for input until the user enters a valid value, which helps prevent errors and makes the program more user-friendly.
package loops;
*/
package loops;

public class GrossPayInputValidation {
  public static void main(String[] args) {
    // Initialize known variables
    int rate = 15;
    int maxHours = 40;

    // Get input from user
    System.out.println("Enter the number of hours worked this week: ");
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int hoursWorked = scanner.nextInt();

    // Validate input
    while (hoursWorked > maxHours || hoursWorked < 1) {
      System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
      hoursWorked = scanner.nextInt();
    }
    scanner.close();

    // Calculate gross pay
    int gross = rate * hoursWorked;
    System.out.println("Gross pay: $" + gross);

    
  }
  
}


/*While Loops
Condition is checked before the loop body is executed. 
If the condition is false, the loop body will not be executed at all.
If the condition is true, the loop body will be executed.
The condition is checked again after the loop body is executed.
If the condition is still true, the loop body will be executed again.
If the condition is false, the loop will terminate.

Pre-test - condition is checked before the loop body is executed.
Execution - use when loop may or may not need to be executed.
 * 
 * 
 * 
 * Do while loop
 * Condition is checked after the loop body is executed.
 * The loop body will be executed at least once.
 * The condition is checked again after the loop body is executed.
 * If the condition is true, the loop body will be executed again.
 * 
 * Post-test - condition is checked after the loop body is executed.
 * 
 * 
 */