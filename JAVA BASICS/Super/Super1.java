

class A extends Object  {

    public A(){
        super();
        System.out.println("In A");
    }

    public A(int n){
        System.out.println("In A int");
    }

}

class B extends A {
    // To create a constructor of B, we say:

    
    public B(){
        super(5); 

        System.out.println("In B"); 
    }

    public B (int n){
    this();
    //  super(n);

        System.out.println("In B int");
    }


}
public class Super1 {
    

    public static void main(String[] args) {
        B obj = new B(5 );
        // B obj = new B();


        // Whenever you create an object it calls the constructor

    }
}



// What the above code is About:


/* 


Class A:

This class is defined with two constructors, one with no parameters and another with an integer parameter.
The first constructor public A() is a default constructor and doesn't take any arguments. It calls super(), which is used to call the constructor of its superclass (in this case, the Object class). It then prints "In A" to the console.
The second constructor public A(int n) takes an integer parameter but does not explicitly call super(). By default, it will implicitly call the parameterless constructor of the superclass (A calls super() internally).
Class B:

This class extends from class A, meaning it inherits from A. This inheritance allows class B to access the members (fields and methods) of class A.
Class B has two constructors, one with no parameters and another with an integer parameter.
The first constructor public B() is the default constructor. It calls super(5), which explicitly calls the parameterized constructor of the superclass A with the integer value 5. This will print "In A int" to the console (since the A(int n) constructor is invoked with n=5) and then "In B" to the console.
The second constructor public B(int n) takes an integer parameter. It uses this() to call the default constructor of class B, which, as explained above, calls the parameterized constructor of the superclass A. It does not explicitly call super(n), so by default, the superclass constructor A(int n) is not invoked.
Class Super1:

This class contains the main method, where the program execution starts.
Inside the main method, an object obj of class B is created with the statement B obj = new B(5);.
When this line is executed, the constructor B(int n) is called. It uses this() to call the default constructor B(), which then calls the parameterized constructor of the superclass A with n=5. So, the output will be:



In A int
In B
In B int


*/


/*
 * 
 * 
 * 
 * Now, let's discuss the concept of the superclass and how it relates to Java classes.

The Object class in Java:

In Java, every class implicitly or explicitly extends the Object class. The Object class is the root class of all Java classes in the Java class hierarchy.
This means that all classes in Java inherit certain methods from the Object class, such as toString(), equals(), hashCode(), etc.
If a class does not explicitly extend any other class (like class A extends Object), Java automatically adds the extends Object part for you.
Superclass and Subclass:

When one class (subclass) extends another class (superclass), the subclass inherits the properties (fields and methods) of the superclass.
The super keyword is used in Java to refer to the superclass from within a subclass. It allows you to access the members of the superclass, even if they are hidden by a member of the same name in the subclass.
If you don't explicitly call super() in a constructor, Java automatically inserts a call to the superclass's default constructor (parameterless constructor).
Constructor Chaining:

In Java, constructors can call other constructors of the same class (this()) or the superclass (super() or super(parameters)). This is called constructor chaining.
If you use this() in a constructor, it must be the first statement, and it can only be used once in a constructor. Similarly, if you use super() to call the superclass constructor, it must be the first statement in the constructor, and it can only be used once.
 */