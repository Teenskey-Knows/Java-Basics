import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = { 5, 10, 15, 20, 25 };
        
        // Access and print individual elements
        System.out.println("Element at index 0: " + numbers[0]);
        System.out.println("Element at index 2: " + numbers[2]);
        
        // Modify an element
        numbers[3] = 30;
        
        // Print all elements using a for loop
        System.out.println("Printing all elements using a for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        
        // Print all elements using a for-each loop
        System.out.println("Printing all elements using a for-each loop:");
        for (int number : numbers) {
            System.out.println("Element: " + number);
        }


        //Copying Array
        /*
          You can copy the contents of one array to another using the System.arraycopy() method or the Arrays.copyOf() method.
        System.arraycopy() syntax: System.arraycopy(srcArray, srcPos, destArray, destPos, length);
        Arrays.copyOf() syntax: newArray = Arrays.copyOf(srcArray, length);
         */

         int[] sourceArray = {1,2,3};
         int[] destinationArray = new int[sourceArray.length];

         // Using System.arraycopy()

         System.arraycopy(sourceArray,0,destinationArray,0,sourceArray.length);

        /*  sourceArray: This is the source array from which elements will be copied.
        0: This is the starting position in the source array from where copying begins. In this example, it starts from index 0.
        destinationArray: This is the destination array where the elements will be copied.
        0: This is the starting position in the destination array where the copied elements will be placed. In this example, it starts from index 0.
        sourceArray.length: This specifies the number of elements to be copied. In this case, it will copy all the elements from the source array.


        In general, if you omit the starting position for the destination array in the System.arraycopy() method, it is assumed to be 0 by default. However, you can specify a different starting position if needed.

        For instance, if you wanted to copy elements from the source array to the destination array starting from a different index, you can modify the code accordingly. Here's an example:

        Example:

        int[] sourceArray = { 1, 2, 3, 4, 5 };
        int[] destinationArray = new int[5];

        System.arraycopy(sourceArray, 2, destinationArray, 1, 3);

        In this case, the elements from index 2 to index 4 (3 elements) of the source array will be copied to the destination array starting from index 1.

        So, the starting position in the destination array is not always 0 by default. It can be modified based on your specific requirements.


        int[] sourceArray = { 1, 2, 3, 4, 5 };
        int[] destinationArray = new int[5];

        System.arraycopy(sourceArray, 2, destinationArray, 1, 3);

        System.out.println(Arrays.toString(destinationArray));

        [0, 3, 4, 5, 0]

        Explanation:

        The sourceArray contains elements: [1, 2, 3, 4, 5].
        The destinationArray is initially filled with zeros: [0, 0, 0, 0, 0].
        With System.arraycopy(sourceArray, 2, destinationArray, 1, 3), we are copying 3 elements starting from index 2 of sourceArray to destinationArray starting from index 1.
        After the System.arraycopy() operation, the destinationArray is updated with the copied elements, resulting in: [0, 3, 4, 5, 0].
        In the resulting destinationArray, the copied elements 3, 4, and 5 are placed at indices 1, 2, and 3, respectively. The initial zero at index 1 is overwritten, and the remaining zeros remain unchanged.



        */


        // ARRAY COMPARISON 

          /*
          To compare the contents of two arrays, you can use the Arrays.equals() method.
        Syntax: boolean areEqual = Arrays.equals(array1, array2);
        The method returns true if the arrays have the same length and the corresponding elements are equal, otherwise it returns false.

        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 1, 2, 3 };

        boolean areEqual = Arrays.equals(array1, array2);
          
          
          
          */   


        // ARRAYS AS PARAMETERS METHODS

        /*
          

        You can pass arrays as parameters to methods in Java.
        Changes made to the array within the method affect the original array.
        Example:
        java
        Copy code
        public static void modifyArray(int[] arr) {
            arr[0] = 100; // Modifying the first element
        }

        public static void main(String[] args) {
            int[] numbers = { 1, 2, 3 };
            modifyArray(numbers);
            System.out.println(numbers[0]); // Output: 100
        }
                */





        // ARRAYS AS OBJECTS

        /*
         
        class Person {
            private String name;
            // Other properties and methods

            public Person(String name) {
                this.name = name;
            }
        }

        public static void main(String[] args) {
            Person[] people = new Person[3];
            people[0] = new Person("John");
            people[1] = new Person("Jane");
            people[2] = new Person("Alice");

            System.out.println(people[1].getName()); // Output: Jane
        }




        class Person {
    private String name;
  
    public Person(String name) {
        this.name = name;
    }
  
    public String getName() {
        return name;
    }
}

        public class ArrayOfObjectsExample {
            public static void main(String[] args) {
                // Create an array of Person objects
                Person[] people = new Person[3];
                
                // Create Person objects and assign them to array elements
                people[0] = new Person("John");
                people[1] = new Person("Jane");
                people[2] = new Person("Alice");

                // Access and print the names of the Person objects in the array
                for (Person person : people) {
                    System.out.println(person.getName());
                }
            }
        }

         */


         // SORTING ARRAYS

         /*
          
     

        You can sort the elements of an array using the Arrays.sort() method.
        Syntax: Arrays.sort(array);
        Note that sorting is performed in ascending order.

        int[] numbers = { 5, 2, 8, 1, 4 };
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // Output: [1, 2, 4, 5, 8]


         The reason Arrays.toString() is used in the code example is to convert the sorted array numbers into a string representation for displaying it with System.out.println().

        By default, when you directly pass an array to System.out.println(), it will print the memory address of the array object, rather than its contents. To display the actual elements of the array in a readable format, you can use the Arrays.toString() method.





        // SORTING IN DESCENDING ORDER


        import java.util.Arrays;
        import java.util.Comparator;

        public class SortDescendingExample {
            public static void main(String[] args) {
                int[] numbers = { 5, 2, 8, 1, 4 };

                // Sort the array in descending order using a custom comparator
                Arrays.sort(numbers, Comparator.reverseOrder());

                // Print the sorted array
                System.out.println(Arrays.toString(numbers));
    }
}

          */


// ADDING , REMOVING FROM ARRAYS IN JAVA

/*


import java.util.ArrayList;

public class ArrayMethodsExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Similar to push() in JavaScript
        numbers.add(5); // [5]
        numbers.add(2); // [5, 2]
        numbers.add(8); // [5, 2, 8]

        // Similar to unshift() in JavaScript
        numbers.add(0, 3); // [3, 5, 2, 8]

        // Similar to pop() in JavaScript
        int lastElement = numbers.remove(numbers.size() - 1); // [3, 5, 2]

        // Print the ArrayList
        System.out.println(numbers); // Output: [3, 5, 2]
        System.out.println(lastElement); // Output: 8
    }
}



 */

       
    }
}




/*
 

ARRAY METHODS
==============================















 */