// switch statement

package decisionStructure;

import java.util.Scanner;
import javax.naming.ldap.SortControl;

public class grade_message {
  public static void main(String[] args) {
    

    System.out.println("Enter your test grade");

    Scanner scanner = new Scanner(System.in);
    String grade = scanner.next();
    scanner.close();

    String message;

    switch(grade) {
      case "A":
        message = "Excellent work!";
      break;

      case "B":
      message = "Good job!";
      break;

      case "C":
      message = "You passed!";
      break;

      case "D":
      message = "You failed!";

      default:
      message = "Invalid grade entered.";
      break;

    }
    System.out.println(message);

   

    /* 
    int grade = 85;
    String message;

    if (grade >= 90) {
      message = "Excellent work!";
    } else if (grade >= 80) {
      message = "Good job!";
    } else if (grade >= 70) {
      message = "You passed!";
    } else {
      message = "You failed!";
    }

    System.out.println(message);
    */
  }
  
}
