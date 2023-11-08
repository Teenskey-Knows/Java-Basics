class Vehicle {

    static int wheels;

    int speed = 40;
    String color = "Blue";
    String make ="Toyota";
    String brand;
    int price;


   public void show(){
    System.out.println("My uncle has a " + " " + color + " " + make + " morty which has a " + speed + "km/hr speed. He also has a " + " " + brand + "which has " + " " + wheels + " " + "wheels." );
   }

}



public class ExampleOfStaticInUse {

    public static void main(String[] args) {
        

        Vehicle obj1 = new Vehicle();
        
        obj1.brand = "Nissan Sudane";
        obj1.price= 40000;
        Vehicle.wheels = 8;
        // Nissan Sudane40000


        obj1.show();
        // My uncle has a  Blue Toyota morty which has a 40km/hr speed. He also has a  Nissan Sudanewhich has  8 wheels.

        System.out.println(obj1.brand +   obj1.price);
        

        Vehicle obj2 = new Vehicle();
        obj2.brand = "Toyota Corolla";
        obj2.price= 50000;
        Vehicle.wheels = 4;

        obj2.show();

        // My uncle has a  Blue Toyota morty which has a 40km/hr speed. He also has a  Toyota Corollawhich has  4 wheels.


    }
    
}
