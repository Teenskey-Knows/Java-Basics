

// Static Variables:

// In Java, a static variable is a variable that belongs to the class itself, rather than to individual instances (objects) of the class. When you declare a variable as static, there is only one copy of that variable shared across all instances of the class.

// Here's an example to demonstrate this concept:


class Car {
    static int numberOfWheels = 4; // This is a static variable

    String color; // This is an instance variable

    // Constructor to set the color of the car
    Car(String color) {
        this.color = color;
    }
}

class MathUtils {
    static int add(int a, int b) { // This is a static method
        return a + b;
    }
}


//Static Methods:

// Similarly, static methods belong to the class rather than to individual instances. You can call a static method using the class name directly, without creating an object.

// Here's an example to demonstrate static methods:

/* 

public class Main {
    public static void main(String[] args) {
        int result = MathUtils.add(10, 20);
        System.out.println("Result of addition: " + result);
    }

    Result of addition: 30

 }

 */



public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Red");
        Car car2 = new Car("Blue");

        System.out.println("Car 1 color: " + car1.color);
        System.out.println("Car 2 color: " + car2.color);

        System.out.println("Number of wheels: " + Car.numberOfWheels);


        int result = MathUtils.add(10, 20);
        System.out.println("Result of addition: " + result);

        // Result of addition: 30

        // In the example above, add() is a static method of the MathUtils class. We can call it directly using the class name (MathUtils.add(...)) without creating an instance of MathUtils.
    }

    //Car 1 color: Red
    // Car 2 color: Blue
    // Number of wheels: 4


    // In the example above, numberOfWheels is a static variable of the Car class. It is shared among all instances of the Car class. When we access Car.numberOfWheels, we get the same value for all car objects because there is only one copy of the variable numberOfWheels for the entire Car class.
    
}



// ADVANCED CONCEPTS

// Static vs. Instance:

// Static variables and methods are associated with the class itself and not with any particular instance of the class. 

// They are loaded into memory when the class is loaded, and their values persist across all instances of the class.


// Instance variables and methods, on the other hand, are specific to each object (instance) of the class. Each instance has its copy of instance variables, and they can have different values.


// Static Block:

// In addition to static variables and methods, Java also allows you to define a static block in a class. A static block is a block of code enclosed in curly braces and preceded by the static keyword. It gets executed when the class is loaded into memory, even before the main method is executed.
// Here's an example of a static block:


/* 

class MyClass {
    static int x;

    // Static block
    static {
        x = 10;
        System.out.println("Static block executed.");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Value of x: " + MyClass.x);
    }

    // Static block executed.
     Value of x: 10


     // The static block is executed only once when the class is loaded, and it allows you to perform some initialization tasks or execute code that should be run before the program starts.

}

*/