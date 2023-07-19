// In case you forget what's going on here, there's explanation at the bottom.
// Remember you are the one who wrote this code.


class Student {

    int rollno;
    String name;
    int marks;
}

public class ArrayExample2 {


    public static void main(String args[]){

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Martin Kamau";
        s1.marks = 100;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Newton Kagimbi";
        s2.marks = 100;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Alex Miguongo";
        s3.marks = 100;

        Student studentArray[] = new Student [3];

        studentArray[0] = s1;
        studentArray[1] = s2;
        studentArray[2] = s3;

        System.out.println(studentArray);
        //This will print the reference location i.e memory location for studentArray.

        for (int i=0; i<studentArray.length;i++){

            System.out.println(studentArray[i].rollno + " " + studentArray[i].name);

            /*
             
            1 Martin Kamau
            2 Newton Kagimbi
            3 Alex Miguongo


             */
        }

        // FOR EACH LOOP or   ENHANCED FOR LOOP

        for( Student student:  studentArray){
            
            System.out.println(student.name + "" + ":" + "" + student.marks);

            /*
             
            Martin Kamau:100  
            Newton Kagimbi:100
            Alex Miguongo:100 

             */
        }




    }
    
}


/*
 

In the provided code, there is a Student class that represents a student's information. The ArrayExample2 class demonstrates the usage of an array to store and access objects of the Student class. Here's a breakdown of what is happening in the code:

The Student class:

Defines a class called Student with three instance variables: rollno, name, and marks.
The main method:

The main method is the entry point of the program.
Creates three instances of the Student class (s1, s2, s3) and assigns values to their instance variables.
Creating and populating the array:

Declares an array of type Student named studentArray with a length of 3.
Assigns the created Student instances (s1, s2, s3) to the respective elements of the studentArray.
Printing the studentArray reference:

Prints the reference location (memory address) of the studentArray.
Accessing and printing array elements using a for loop:

Iterates over each element in the studentArray using a for loop.
Prints the rollno and name of each Student object.
Accessing and printing array elements using a for-each loop:

Utilizes a for-each loop to iterate over each Student object in the studentArray.
Prints the name and marks of each Student object.
The output of the program is the displayed information of the students, including their roll numbers, names, and marks.

It's important to note that the code provided lacks proper formatting for the desired output. To improve readability, consider modifying the print statements with appropriate formatting options.


 */
