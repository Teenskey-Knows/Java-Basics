/*
 


//  REFERENCE OBJECT


In Java, a reference object is a variable that holds a memory address, pointing to an object in the computer's memory. When you create an object using the new keyword, Java allocates memory for that object, and the variable holds the memory address where the object is stored. Think of the reference as a "pointer" to the actual object.

Let's see an example:

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Person john = new Person("John"); // Here, 'john' is a reference object
        Person mary = new Person("Mary"); // Here, 'mary' is another reference object

        // Both 'john' and 'mary' are references to separate Person objects in memory.
    }
}


In this example, john and mary are reference objects. They don't hold the actual data of the Person objects, but they store the memory address of the Person objects created using new Person(...). They act as handles or access points to interact with the real objects.

 */


 /*
  * 
// ANONYMOUS OBJECTS


An anonymous object is an object that is created without assigning it to a variable. It is used for one-time use, where you don't need to refer to the object later in the code. Instead of assigning it to a variable, you create and use the object directly.

Here's an example:


class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        // Anonymous object created and used directly without assigning to a variable
        System.out.println(new Person("Alice").name); 
        // Output: Alice

        // Another anonymous object created and used directly
        System.out.println(new Person("Bob").name); 
        // Output: Bob

        // Since we didn't store these objects in variables, they are anonymous.
        // They are used only once for their immediate purpose.
    }
}





In this example, we created anonymous objects when calling the constructor of Person directly inside System.out.println(...). These objects are used to print the names of "Alice" and "Bob" without being stored in any variables.

In summary:

A reference object is a variable that holds the memory address of an object, allowing you to access and manipulate the object's data later in the code.
An anonymous object is an object created and used directly without being assigned to a variable. It is typically used for one-time operations without the need to refer to the object later.
  */