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
         
        StringBuffer nameThree = new StringBuffer("Teenskey");

         




    }
}
