// Write a program that calculates a credit score based on the following rules:
// Approves anyone that makes more than $25,000 and has a credit score of 700 or higher.
// Approves anyone that makes more than $50,000 and has a credit score of 600 or higher.
//Rejects anyone that makes less than $25,000 and has a credit score of less than 700.


package variableScope;

public class CreditCheck {

  public static void main(String[] args) {
    // Initialize known variables
    int salary = 50000;
    int creditScore = 700;

    // Check if the salary is greater than $25,000 and the credit score is 700 or higher
    if (salary > 25000 && creditScore >= 700) {
      System.out.println("Approved");
    } else if (salary > 50000 && creditScore >= 600) {
      System.out.println("Approved");
    } else {
      System.out.println("Rejected");
    }
  }
  
}
