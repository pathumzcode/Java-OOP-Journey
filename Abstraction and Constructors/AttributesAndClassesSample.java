// Car.java or in same file
class Car {
    // attributes
    String Brand;
    String Colour;
    int HoursePower;
}

// Main class (public) with main method
public class AttributesAndClassesSample {
    public static void main(String[] args) {
        Car myCar = new Car(); // Create object of Car class

        // Initialize Object Properties
        myCar.Brand = "BMW";
        myCar.Colour = "White";
        myCar.HoursePower = 1600;

        // Get output
        System.out.println("Car Brand is: " + myCar.Brand);
        System.out.println("Car Colour is: " + myCar.Colour);
        System.out.println("Car Hourse Power is: " + myCar.HoursePower);
    }
}
