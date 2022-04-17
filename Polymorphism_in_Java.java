class Animal {
  public void animalSound() {
    System.out.println("An animal can make a sound.");
  }
}

class Cow extends Animal {
  public void animalSound() {
    System.out.println("A cow says: Moooo");
  }
}

class Cat extends Animal {
  public void animalSound() {
    System.out.println("A cat says: Meeooww");
  }
}

class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();
    Animal myCow = new Cow();
    Animal myCat = new Cat();
        
    myAnimal.animalSound();
    myCow.animalSound();
    myCat.animalSound();
  }
}
