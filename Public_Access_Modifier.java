// Car.java file
// public class
public class Car {
    // public variable
    public int tyreCount;

    // public method
    public void display() {
        System.out.println("I am a Car.");
        System.out.println("I have " + tyreCount + " tyres.");
    }
}

// Main.java
public class Main {
    public static void main( String[] args ) {
        // accessing the public class
        Car car = new Car();

        // accessing the public variable
        car.tyreCount = 4;
        // accessing the public method
        car.display();
    }
}
