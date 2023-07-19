class Computer
{
    public void playMusic()
    {
System.out.println("Hello world!");
    }

    public String getMeAPen (int cost)
    {
        if (cost >= 10){
                    return "Pen";

        }else{
            return "Nothing";
        }
    }
}



public class Demo {
    public static void main (String a[]){
        
        Computer obj = new Computer();

        obj.playMusic(); 
        String str = obj.getMeAPen(2);

        System.out.println(str);
    }
}

/* The code defines a class named "Computer" with two methods: "playMusic" and "getMeAPen".
The "playMusic" method prints the string "Hello world!" to the console.
The "getMeAPen" method takes an integer parameter named "cost" and returns a string. If the value of "cost" is greater than or equal to 10, it returns the string "Pen". Otherwise, it returns the string "Nothing".
The code also includes a "Demo" class with a "main" method.
In the "main" method, an instance of the "Computer" class is created using the "new" keyword and assigned to the variable "obj".
The "playMusic" method is called on the "obj" instance, which prints "Hello world!" to the console.
The "getMeAPen" method is called on the "obj" instance with an argument of 2, and the returned string is assigned to the variable "str".
Finally, the value of "str" is printed to the console. In this case, it will print "Nothing" since the value of "cost" is less than 10.

*/ 

