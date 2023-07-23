import java.util.Set;

public class Strings {
    

    // String in Java are objects in themselves.
    // To instantiate a new String we say:

    public static void main(String args[]){
        String name = new String();

        System.out.println(name);

        // This printed an empty space

        // To provide data, we can pass a value inside the string constructor:

        String nameTwo = new String("Kamau");
        System.out.println("Hello" + " " + nameTwo );
        // Hello Kamau


        // STRING METHODS

        // 1. .charAt()

        System.out.println(nameTwo.charAt(0));
        // K 


        //2. .concat()

        System.out.println(nameTwo.concat(" "  + "is great."));

        // Kamau is great. 

        //3 .length()

        String str = "Hello, Java!";
        System.out.println(str.length());
         // length is 12

        //4. substring(int beginIndex)
        String helloJava = "Hello, Java. I hear you cool!";
        System.out.println(helloJava.substring(8));
        // ava. I hear you cool!

        //5. substring(int beginIndex, int endIndex) 

        //  Returns a new string that is a substring of the original string, from beginIndex (inclusive) to endIndex (exclusive)

        String greetJava = "Hello, Java!";
        String subStr = greetJava.substring(7, 11); 
        System.out.println(subStr);
        // subStr is "Java"

        //6. indexOf(String str) 

        //Returns the index within the string of the first occurrence of the specified substring.

        String anotherJavaGreeting = "Hello, Java!";
        int index = anotherJavaGreeting.indexOf("Java");
        System.out.println(index);
         // index is 7

        //7. .toLowerCase()

         String lowerCaseIt = "Hello, Java!";
         String lowerCased = lowerCaseIt.toLowerCase(); 
         System.out.println(lowerCased);
         // lowerCaseStr is "hello, java!"

         //8. .toUpperCase()

         // Works the same way as .toLowerCase()

         //9. .trim()

         // Removes leading and trailing whitespace from the string.

         String trimIt = "  Hello, Java!  ";
         String trimmedStr = trimIt.trim(); 
         // trimmedStr is "Hello, Java!"


         //10. replace(CharSequence target, CharSequence replacement) 
         
         // Replaces all occurrences of the target string with the replacement string.

         String replacedStr= "Hello, Java!";
         String newStr = replacedStr.replace("Java", "World"); 
         // newStr is "Hello, World!"


         //11. startsWith(String prefix) 
         // Checks if the string starts with the specified prefix.

         String startsWith = "Hello, Java!";
        boolean startsWithHello = startsWith.startsWith("Hello"); // true
        boolean startsWithJava = startsWith.startsWith("Java"); // false


        //12. String str = "Hello, Java!";
        boolean endsWithJava = startsWith.endsWith("Java!"); // true
        boolean endsWithWorld = startsWith.endsWith("World!"); // false


        //13. contains(CharSequence sequence) 
        // Checks if the string contains the specified sequence.

        String contains = "Hello, Java!";
            boolean containsJava = contains.contains("Java"); // true
            boolean containsWorld = contains.contains("World"); // false








         






        // MUTABLE STRINGS
        // By  default strings are immutable  to create mutable strings we have 2 classes.

        // a) String Buffer
        // b) String Builder
        // - They are both similar and provide a way to create mutable strings.


        // STRING BUFFER

        // The StringBuffer class is used to create and manipulate mutable sequences of characters. It is similar to the String class but provides more efficient ways to modify strings.

        // To use a StringBuffer, you need to create an instance of the class.
         
       // Option 1: Initialize an empty StringBuffer

            StringBuffer sb = new StringBuffer();
            System.out.println(sb.capacity());
            //16 

            // Option 2: Initialize with an initial capacity (recommended if you know the expected size)
            int initialCapacity = 16; // You can adjust this based on your expected string length
            StringBuffer sbWithCapacity = new StringBuffer(initialCapacity);

            // Option 3: Initialize with a String
            String initialString = "Hello";
            StringBuffer sbWithString = new StringBuffer(initialString);


            // 1. Size of a StringBuffer:

            // The size of a StringBuffer refers to the number of characters it currently holds. You can get the current size using the length() method:

            int size = sb.length();
            System.out.println("Size of StringBuffer: " + size);
            // 0


           // 2. Appending data to StringBuffer:

            // One of the primary purposes of StringBuffer is to concatenate strings efficiently. You can do this using the append() method:

            sb.append("Hello"); // Append a String
            sb.append(' '); // Append a character
            sb.append(42); // Append an integer
            sb.append(3.14); // Append a double

            System.out.println(sb);

            // Hello 423.14 - you can see how funny the integers have concatenated.

            // 3.0 Converting String Buffer back to normal string
            StringBuffer convertToNormalString = new StringBuffer("Martin Kamau");
            System.out.println(convertToNormalString.toString());
            // Martin Kamau
            System.out.println(convertToNormalString.getClass().getSimpleName());
            // StringBuffer


            // 3. Inserting data into StringBuffer:

            // You can also insert data at a specific position using the insert() method:

            sb.insert(5, " world"); // Insert " world" at index 5

            System.out.println(sb);

            // Hello world 423.14

            // 4. Deleting data from StringBuffer:

            // If you want to remove characters from the StringBuffer, you can use the delete() method:

            sb.delete(5, 11); // Delete characters from index 5 to 10 (exclusive)

            System.out.println(sb);

            // Hello 423.14

            // 5. Replacing data in StringBuffer:

            // You can replace characters in the StringBuffer using the replace() method:

            sb.replace(0, 5, "Hi"); // Replace characters from index 0 to 4 with "Hi"
            System.out.println(sb);

            // Hi 423.14

            //==========================

                // Other useful methods:

            //==========================

            // To know all the methods associated with String Buffer, just do for instance sb. and it will bring other methods that you can explore. 
            // If you know StringBuffer you definitely now know String Builder.
            sb.setLength( 6);

            // charAt(int index): Get the character at a specific index.

            // indexOf(String str): Find the index of the first occurrence of the specified string.

            // substring(int start): Get the substring starting from the specified index.

            // substring(int start, int end): Get the substring from the start index to the end index (exclusive).
            
            // reverse(): Reverse the characters in the StringBuffer.

            // capacity(): Get the current capacity of the StringBuffer.

            // setLength(int newLength): Set a new length for the StringBuffer.


            // ADVANCED CONCEPTS:

            // Thread Safety:
            // Unlike StringBuilder, StringBuffer is thread-safe. This means it can be used in multithreaded environments without data corruption. However, if you don't need thread safety, it's recommended to use StringBuilder, which is more efficient due to lack of synchronization.

            // Performance Considerations:
            // If you are doing a lot of string concatenation or manipulation, prefer using StringBuilder instead of StringBuffer in single-threaded environments. StringBuilder provides better performance as it is not burdened with synchronization overhead.

            // That covers the basics and some advanced concepts of using StringBuffer in Java. Remember to use StringBuffer when you need thread safety or if you are working in a multithreaded environment. Otherwise, consider using StringBuilder for better performance.


            // Thread Safety:

            // In Java, a thread is like an independent sequence of instructions that can run concurrently with other threads in a program. When multiple threads are executing in a program, there is a possibility of data corruption or unexpected behavior if they access and modify the same data simultaneously. Thread safety refers to the property of a program or data structure that ensures it behaves correctly and predictably when accessed by multiple threads.
            // In the context of StringBuffer and StringBuilder:

            // StringBuffer is thread-safe, which means it has built-in mechanisms to handle multiple threads accessing it at the same time. This ensures that data corruption or inconsistency won't occur even if multiple threads are using the same StringBuffer object simultaneously.

            // On the other hand, StringBuilder is not thread-safe. It is more efficient in single-threaded environments, meaning situations where only one thread is executing the program. In such cases, you won't face the risk of data corruption, and using StringBuilder provides better performance compared to StringBuffer.

            // Synchronization:
            // In the context of thread safety, synchronization is the process of coordinating the access to shared resources (like data structures or variables) among multiple threads. When a method or code block is "synchronized," it means that only one thread can execute that method or block at a time, ensuring exclusive access to the shared resource.
            // StringBuffer achieves thread safety by making its methods synchronized. This allows multiple threads to use a single StringBuffer safely, but it also introduces some performance overhead because the threads need to wait for each other while accessing the shared StringBuffer.

            // StringBuilder, being not thread-safe, does not have this synchronization overhead. It is faster in single-threaded scenarios, where you don't need to worry about multiple threads accessing the same StringBuilder simultaneously.

            // Single-Threaded Environment:
            // A single-threaded environment refers to a situation where only one thread is running and executing the program at any given time. In this scenario, you don't have to deal with the complexities of managing concurrent access to data because there is only one thread accessing the data. Most simple Java programs run in a single-threaded environment by default.









         




    }
}
