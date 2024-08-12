package objects;

public class Rectangle {
  public static void main(String[] args) {
    // Create a new Rectangle object
    Rectangle rect = new Rectangle(5, 10);

    // Calculate the area and perimeter of the rectangle
    double area = rect.calculateArea();
    double perimeter = rect.calculatePerimeter();

    // Print the area and perimeter of the rectangle
    System.out.println("Area: " + area);
    System.out.println("Perimeter: " + perimeter);
  }

  // Instance variables
  private double length;
  private double width;

  // Constructor
  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  // Calculate the area of the rectangle
  public double calculateArea() {
    return length * width;
  }

  // Calculate the perimeter of the rectangle
  public double calculatePerimeter() {
    return 2 * (length + width);
  }

}

/* ! Object Encapsulation
 * public class Rectangle {
 * 
 * private double length; // doesn't need to be public and can't be accessed from outside the class
 * private double width;
 * private int sides = 4;
 *
 * public double calculateArea() { //can be accessed from outside the class because it's public
 * return length * width;
 * }
 * 
 * public double calculatePerimeter() {
 * return 2 * (length + width);
 * }
 * 
 * public double getLength(){
 *   return length;
 * 
 * }
 *  public double setlength(double length){ {
 *   this.length = length; 
 * }
 * 
 * public double getWidth(){
 * 
 * return width;
 * 
 * }
 * 
 * public void setWidth(double width){
 *  this.width = width;
 * }
 * 
 * public int getSides() {
 *  return sides;
 * }
 * 
 * public void setSides (int sides) {
 *  this.sides = sides;
 * }
 * }
 */