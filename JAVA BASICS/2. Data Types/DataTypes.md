# Data Types in Java

Java has two main categories of data types: **Primitive Data Types** and **Non-Primitive Data Types**. Below is a detailed explanation of **Primitive Data Types**.

---

## 1. Primitive Data Types

Primitive data types are the most basic types of data. They are predefined by the language and are used to store simple values. There are 8 primitive data types in Java, categorized as follows:

### 1.1 Numeric Data Types

#### a) **Integer Types**
1. **byte**
   - Size: 8 bits
   - Range: -128 to 127
   - Example:
     ```java
     byte age = 25;
     ```
2. **short**
   - Size: 16 bits
   - Range: -32,768 to 32,767
   - Example:
     ```java
     short distance = 15000;
     ```
3. **int**
   - Size: 32 bits
   - Range: -2,147,483,648 to 2,147,483,647
   - Example:
     ```java
     int salary = 50000;
     ```
4. **long**
   - Size: 64 bits
   - Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
   - Example:
     ```java
     long population = 7800000000L; // Note the "L" suffix
     ```

#### b) **Floating-Point Types**
1. **float**
   - Size: 32 bits
   - Range: Approximately ±3.40282347E+38F
   - Example:
     ```java
     float pi = 3.14F; // Note the "F" suffix
     ```
2. **double**
   - Size: 64 bits
   - Range: Approximately ±1.79769313486231570E+308
   - Example:
     ```java
     double gravity = 9.80665;
     ```

### 1.2 Non-Numeric Data Types

#### a) **char**
   - Size: 16 bits
   - Represents a single 16-bit Unicode character.
   - Example:
     ```java
     char grade = 'A';
     ```

#### b) **boolean**
   - Size: 1 bit (conceptually)
   - Values: `true` or `false`
   - Example:
     ```java
     boolean isJavaFun = true;
     ```

---

## 2. Summary Table

| Data Type | Size     | Range                              | Example                     |
|-----------|----------|------------------------------------|-----------------------------|
| `byte`    | 8 bits   | -128 to 127                       | `byte b = 10;`             |
| `short`   | 16 bits  | -32,768 to 32,767                 | `short s = 1000;`          |
| `int`     | 32 bits  | -2^31 to 2^31-1                   | `int i = 100000;`          |
| `long`    | 64 bits  | -2^63 to 2^63-1                   | `long l = 123456789L;`     |
| `float`   | 32 bits  | ±3.4E+38                          | `float f = 3.14F;`         |
| `double`  | 64 bits  | ±1.7E+308                         | `double d = 123.456;`      |
| `char`    | 16 bits  | Unicode characters                | `char c = 'J';`            |
| `boolean` | 1 bit    | `true` or `false`                 | `boolean isHappy = true;`  |

---

## 3. Example Program

Here’s a complete example program demonstrating all the primitive data types:
```java
public class PrimitiveDataTypesExample {
    public static void main(String[] args) {
        // Numeric Data Types
        byte age = 25;
        short distance = 15000;
        int salary = 50000;
        long population = 7800000000L;
        float pi = 3.14F;
        double gravity = 9.80665;

        // Non-Numeric Data Types
        char grade = 'A';
        boolean isJavaFun = true;

        // Output the values
        System.out.println("byte: " + age);
        System.out.println("short: " + distance);
        System.out.println("int: " + salary);
        System.out.println("long: " + population);
        System.out.println("float: " + pi);
        System.out.println("double: " + gravity);
        System.out.println("char: " + grade);
        System.out.println("boolean: " + isJavaFun);
    }
}



What Do the Bits and Ranges Stand For?
In computing, bits are the smallest unit of data in a computer, representing a binary digit: 0 or 1. A byte is 8 bits, and larger data types consist of multiple bytes.

When we say a data type like int is 32 bits, it means the memory allocated to store a value of this type is 32 bits (4 bytes) long. This directly determines the range of numbers that the data type can represent.