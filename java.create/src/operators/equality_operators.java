// == is used to compare two values
// != is used to compare two values are not equal
// = is used to assign value to a variable


package operators;

public class equality_operators {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int c = 10;

    System.out.println(a == b); // false
    System.out.println(a == c); // true
    System.out.println(a != b); // true
    System.out.println(a != c); // false
    System.out.println(a > b); // false
    System.out.println(a <= b); // true
    System.out.println(a < b); // true
    System.out.println(a >= b); // false
    System.out.println(a == b && a == c); // false

  }
  
}
