// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzzz");
  }
}

// Subclass (inherit from Animal)
class Cow extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The cow says: Moo");
  }
}

class Main {
  public static void main(String[] args) {
    Cow myCow = new Cow(); // Create a Cow object
    myCow.animalSound();
    myCow.sleep();
  }
}
