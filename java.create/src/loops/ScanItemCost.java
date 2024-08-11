package loops;

public class ScanItemCost {
  public static void main(String[] args) {
    // Initialize known variables
    double tax = 0.06;
    double total = 0;
    boolean keepShopping = true;
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    
    // Get input from user
    while (keepShopping) {
      System.out.println("Enter the cost of the item: ");
      double itemCost = scanner.nextDouble();
      total += itemCost;
      
      System.out.println("Do you want to continue shopping? (Y/N)");
      String response = scanner.next();
      if (!response.equalsIgnoreCase("Y")) {
        keepShopping = false;
      }
    }
    scanner.close();
    
    // Calculate total cost
    double taxAmount = total * tax;
    double grandTotal = total + taxAmount;
    System.out.println("Total: $" + total);
    System.out.println("Tax: $" + taxAmount);
    System.out.println("Grand Total: $" + grandTotal);
  }
  
}
