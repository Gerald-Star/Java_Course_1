// you don't need to use switch statement for this problem.

package decisionStructure;

import java.util.Scanner;

public class grade_expression {
 public static void main(String[] args) {
   // Initialize known value 
    
   System.out.println("Enter your grade");

   Scanner scanner = new Scanner(System.in);
   String grade = scanner.next();
   scanner.close();

   String message = switch(grade) {
      case "A" -> "Excellent work!";
      case "B" -> "Good job!";
      case "C" -> "You passed!";
      case "D" -> "You failed!";
      default -> "Invalid grade entered.";
    };

    System.out.println(message);
   }


   /*  
   int grade = 85;
    String message;
    
    message = (grade >= 90) ? "Excellent work!" : (grade >= 80) ? "Good job!" : (grade >= 70) ? "You passed!" : "You failed!";
    System.out.println(message);
    */
 }
 
  

