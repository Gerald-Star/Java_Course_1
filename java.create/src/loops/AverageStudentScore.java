package loops;

public class AverageStudentScore {

  public static void main(String[] args) {
    // Initialize known variables
    int numberOfStudents = 24;
    int numberOfTests = 4;
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    
    // Process each student
    for (int i = 0; i < numberOfStudents; i++) {
      double total = 0;
      for (int j = 0; j < numberOfTests; j++) {
        System.out.println("Enter the score for test " + (j + 1) + ": ");
        total += scanner.nextDouble();
      }
      double average = total / numberOfTests;
      System.out.println("The average score for student " + (i + 1) + " is: " + average);
    }
    scanner.close();
  }
  
}
