package methods;

import java.util.Scanner;

public class GreetUser {
  public static void main(String[] args) {
    String name = getUserName();
    greetUser(name);

  }

  public static String getUserName() { // method to get user name

    System.out.println("Hello, what is your name?");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();
    scanner.close();
    return name;
  }

  public static void greetUser(String name) {
    System.out.println("Hello, " + name + "! Nice to meet you.");

  }
}

/*
 * You can have multiple methods in a class, and each method can perform a specific task.
 * Methods can take input parameters and return output values.
 * Methods can be called from other methods or from the main method.
 * Methods can be reused in different parts of the program.
 * Methods can improve code readability and maintainability.
 * Methods can be used to break down complex tasks into smaller, more manageable parts.
 * Methods can be used to encapsulate functionality and hide implementation details.
 * 
 * Methods are identified by their name and the parameters they take.
 * Methods can have a return type, which specifies the type of value the method returns.
 * Methods can have parameters, which are values passed to the method when it is called.
 * Methods can have a body, which contains the code that performs the task of the method.
 * 
 * Method Signature
 * The method signature consists of the method name and the parameter list.
 * The method signature does not include the return type.
 * The method signature is used to uniquely identify a method in a class.
 * 
 * 
 * Method Overloading
 * 
 * Method overloading allows you to define multiple methods with the same name but different parameter lists.
 * Method overloading is useful when you want to provide multiple ways to call a method with different parameters.
 * Method overloading is determined by the number and types of parameters in the method signature.
 * 
 * Method Overriding
 *  Method overriding allows you to define a method in a subclass with the same name and parameter list as a method in the superclass.
 * Method overriding is used to provide a specific implementation of a method in a subclass.
 * Method overriding is determined by the method signature in the superclass and subclass.
 * 
 * public class Animal {
 *  public void makeSound() {
 *   System.out.println("Animal makes a sound");
 * }
 * 
 * public class Dog extends Animal {
 * @Override
 * public void makeSound() {
 * System.out.println("Dog barks");
 * }
 * }
 * 
 */