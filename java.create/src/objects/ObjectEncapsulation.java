package objects;

public class ObjectEncapsulation {

  private double length;
  private double width;
  private int sides = 4;

  // Constructor - Constructor is a special method that is called when an object is created
  // Constructors have the same name as the class and no return type
  // Constructors setup state of the object


  // Default constructor
  public ObjectEncapsulation() {
    length = 0;
    width = 0;
  }
  
  public ObjectEncapsulation(double length, double width) {
    this.length = length;
    this.width = width;
  }


  public double calculateArea() {
    return length * width;
  }

  public double calculatePerimeter() {
    return 2 * (length + width);
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public int getSides() {
    return sides;
  }

  public static void main(String[] args) {
    Rectangle rect = new Rectangle();
    rect.setLength(5);
    rect.setWidth(10);

    double area = rect.calculateArea();
    double perimeter = rect.calculatePerimeter();

    System.out.println("Area: " + area);
    System.out.println("Perimeter: " + perimeter);
  }
  
}
