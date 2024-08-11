
/* In this example, we have a program that calculates an employee's salary based 
on their sales performance. The program prompts the user to enter the number of sales
 made by the employee. If the number of sales is greater than a certain quota, 
     the employee receives a bonus. The program then calculates the employee's 
     salary based on the bonus and outputs the result.
*/     
// If statements are used to check if a condition is true or false, and execute 

package decisionStructure;

import java.util.Scanner;

public class salaryCalculator {

  public static void main(String[] args) {
    // Initialize known values
    int salary = 1000;
    int bonus = 200;
    int quota = 10;
    //int sales = 20;

    // Check if sales are greater than quota
    /* 
    if(sales > quota) {
      salary = salary + bonus;
    }

    // Output
    System.out.println("Salary: $" + salary);
     */ 
    System.out.println("How many sales did the employee make?");
  
    Scanner scanner = new Scanner(System.in);
    int sales = scanner.nextInt();
  
    if (sales > quota) {
      salary = salary + bonus;
    }

    System.out.println("Salary: $" + salary);
  
  }
  
}
