// if else statement

// A company has determined that an employee needs to sell $1000 in a month to meet their quota.
// If an employee sells more or equal to 10, they are congratulated.
// if the employee sells less than 10, they are informed of how many sales they were short of meeting the quota.

package decisionStructure;

import java.util.Scanner;

public class quotaCalculator {

  public static void main(String[] args) {
    // Initialize known value 

    int quota = 10;


    System.out.println("How many sales did the employee make?");
    Scanner scanner = new Scanner(System.in);
    int sales = scanner.nextInt();

    scanner.close();

    if (sales > quota) {
      System.out.println("Congratulations! You have met the quota.");
    } else {

      // state how short the employee is from meeting the quota

      int salesShort = quota - sales;
      System.out.println("You are " + salesShort + " sales short of meeting the quota.");
      System.out.println("Sorry, you did not meet the quota.");
    }
  }
  
}
