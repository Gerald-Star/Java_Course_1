package operators;

public class logical_operators2 {
  public static void main(String[] args) {

    int salary = 40000;
    int years = 3;
    
     if (salary >= 30000 && years >= 2) {
      System.out.println("You are eligible for a loan");
    } else {
      System.out.println("You are not eligible for a loan");
    }
  }
  
}
