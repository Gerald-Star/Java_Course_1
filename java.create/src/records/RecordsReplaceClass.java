package records;

// records are a new feature in Java 14
// records are a special kind of class that are meant to be simple data carriers
// records are immutable
// records does not have a default constructor
public record RecordsReplaceClass(
    String name,
    int age,
    String email,
    String phoneNumber
        
) {       
    // records can have methods
    public void printDetails() {
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Email: " + email);
      System.out.println("Phone Number: " + phoneNumber);
    }
    
    // records can have static methods
    public static void printStaticDetails() {
      System.out.println("This is a static method in a record");
    }
    
    
    // records can have constructors
    public RecordsReplaceClass {
      if (age < 0) {
        throw new IllegalArgumentException("Age cannot be negative");
      }
    }
    
    // records can have static blocks
    static {
      System.out.println("This is a static block in a record");
    }
    
    // records can have instance blocks
    
    
    
  
}
