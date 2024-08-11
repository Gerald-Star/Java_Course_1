// && - and both conditions should be true
// || - or either of the conditions should be true
// ! - not operator - negates the condition

package operators;

public class logical_operators {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int c = 10;

   
    System.out.println(a == b && a == c); // false
    System.out.println(a == b || a == c); // true
    System.out.println(!(a == b)); // true
    System.out.println(!(a == c)); // false NOT operator
    System.out.println(a > b && a == c); // false
    System.out.println(a > b || a == c); // true



  }
  
}
