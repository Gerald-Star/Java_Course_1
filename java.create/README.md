

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.## Getting Started

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## JAVA BASIC CONCEPTS

1. Package
2. Class
3. Main method
   
## What is a package in Java

In Java, a package is a namespace that organizes a set of related classes and interfaces. 

Packages are used to group classes that belong together, which helps in organizing code in a structured manner and avoiding name conflicts. They also provide access control, meaning you can specify which classes are accessible to other classes in different packages.

Key Points About Packages in Java:
Namespace Organization:

Packages prevent naming conflicts by grouping classes that might have the same name but serve different purposes. For example, you could have a class named Date in both java.util and java.sql packages, but they would be distinguished by their package names.
Access Control:

Packages help define the access level for classes and their members. Java provides four levels of access: public, protected, default (package-private), and private. For example, a class with default access can only be accessed by other classes within the same package.
Reusability and Modularity:

By grouping related classes into packages, Java promotes modular programming, making it easier to manage and reuse code.
Standard Library Packages:

Java has a rich set of standard library packages like java.util, java.io, java.net, etc., which provide a variety of pre-built classes and interfaces for common tasks.


## Creating Packages:

To create a package in Java, you use the package keyword at the beginning of your source file. For example:


package com.example.myapp;

public class MyClass {
    // class content
}
The directory structure of your project should match the package name, so com.example.myapp.MyClass would be stored in a directory path like com/example/myapp/MyClass.java.
Importing Packages:

If you want to use a class from another package, you need to import it using the import statement:

import java.util.List;

public class MyApp {
    List<String> myList;
    // other code
}


You can also import all classes from a package using the wildcard *:
java
Copy code
import java.util.*;
Example:
If you have a package named com.mycompany.utils, the classes in this package are defined as follows:

java
Copy code
package com.mycompany.utils;

public class StringUtils {
    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
To use StringUtils in another class, you would import it:

java
Copy code
import com.mycompany.utils.StringUtils;

public class MainApp {
    public static void main(String[] args) {
        String reversed = StringUtils.reverse("Hello");
        System.out.println(reversed); // Output: olleH
    }
}
Packages are fundamental to Java programming, aiding in organization, modularity, and security within your codebase.

## How to set a comment in Java
// single line comment

/* double line comment */


## What is a Class in Java

A class is a blueprint for an object. An object is an instance of a class. A class is a template for creating objects. An object is a concrete instance of a class. A class defines the properties and behaviors of objects. 

## What is a main method in Java

The main() method is the entry point into the application. The main() method is the first method that is called when the program is executed. The main() method is the starting point for the program

## What is the difference between a class and an object in Java?

An object is a specific instance of a class. A class is a user-defined data type. An object is a variable of a class type. A

A class is a collection of data members and methods. An object is a collection of data members and methods. 

A class is a template for creating objects. An object is a concrete instance of a class. 

A class is a blueprint for creating objects. An object is a concrete instance of a class. 

A class is a template for creating objects. An object is a concrete instance of a class. 

A class is a blueprint for creating objects. An object is a concrete instance of a class. 

A class is a template for creating objects. An object is a concrete instance of a class. 

A class is a blueprint for creating objects. An object is a concrete instance of a class. 

A class is a template for creating objects. An object is a concrete instance of a class. 

A class is a blueprint for creating objects. An object is a concrete instance of a class. 

A class is a template for creating objects. An object is a concrete instance of a class. 

A class is a blueprint for creating objects. An object is a concrete instance of a class. 

A class is a template for creating objects. An object is a concrete instance of a class. 

A class is a blueprint for creating objects. An object is a concrete instance of a class. 

A class is a template for creating objects. An object is a concrete instance of a class. 

A class is a blueprint for creating objects. An object is a concrete instance of a class. 

A class is a template for creating objects. An object is a concrete instance of a class. 

A class is a blueprint for creating objects. An object is a concrete instance of a class. 

A class is a template for creating objects. An object is a concrete instance of a class. 

A class is a blueprint for creating objects. An object is a concrete instance of a class. 

A class is a template for creating objects. An object is a concrete instance of a class. 

A class is a blueprint for creating objects. An object is a concrete instance of a class. 

A class is a template for creating objects. An object is a concrete instance of a class. A class


## Methods in Java Used

To use methods in Java you have to import them

### Scanner
Scanner creates a new scanner object to read from the input - scanner is a class in java.util package used for obtaining the input of the primitive types like int, double, etc. and strings



double hoursWorked = 40; // hours worked
    double payRate = 25.0; // pay rate
    double grossPay; // gross pay

    grossPay = hoursWorked * payRate; // calculate gross pay
    System.out.println("Your gross pay is: $" + grossPay); // print gross pay

## Wrapper Classes

### Primitive Date Types

int, double, long, float, boolean, char, byte

### Wrapper Class

Integer, Double, Long, Boolean, Char, Byte

### String is an object and not a data type
