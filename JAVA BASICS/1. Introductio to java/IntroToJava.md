# JAVA INTRO

- Java is platform independent meaning it will run on any environment.

## JVM (Java Virtual Machine)
-  It is only independent on JVM and JVM is platform dependent.
- JVM depends on OS.
- JVM understands Byte code.
- As a developer you write java code which is compiled by Compilers (JAVAC) into Byte code which is understood by JVM.
- In the Byte code JVM looks for a main function to execute.
- The main Class is identified by the following key code;

java``

class Hello {
     public static void main ( String a[])
     {
        System.out.println("Hello World")
     }
}

``

### JRE (Java Runtime Environment)

### What is JRE?

**JRE** stands for **Java Runtime Environment**. It is a software layer that provides the necessary environment to run Java applications. The JRE includes:

- **Java Virtual Machine (JVM):** Executes Java bytecode.
- **Core Libraries:** Provides essential functionalities like math operations, file handling, and networking.
- **Java Plugins:** Enables Java applets to run in web browsers (though applets are now deprecated).

The JRE does **not** include development tools like the Java compiler (`javac`)—those are part of the **JDK (Java Development Kit)**.


### WORA in Java

**WORA** stands for **Write Once, Run Anywhere**. It is a key concept in Java, meaning that Java code, once compiled into bytecode, can run on any platform with a compatible Java Virtual Machine (**JVM**), regardless of the underlying hardware or operating system.

This cross-platform capability is one of Java's biggest advantages.

