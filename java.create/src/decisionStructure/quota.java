// if else if statement - multiples branches of execution based on the value of an expression more than 2.
// Same as switch statement but more flexible.

// In this example, we have a program that calculates a student's grade based on their test score.

package decisionStructure;

import java.util.Scanner;

public class quota {

  public static void main(String[] args) {
    // Initialize known value 
    

    System.out.println("Enter your test score");
    Scanner scanner = new Scanner(System.in);
    double score = scanner.nextDouble();
    scanner.close();

    char grade;

    if (score < 60) {
      grade = 'F';
    } else if (score < 70) {
      grade = 'D';
    } else if (score < 80) {
      grade = 'C';
    } else if (score < 90) {
      grade = 'B';
    } else {
      grade = 'A';
    }

    System.out.println("Your grade is: " + grade);
  }
  
}
