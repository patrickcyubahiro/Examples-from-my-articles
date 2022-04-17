class Main {

  // create a method
  public int divideNumbers(int x, int y) {
    int division = x / y;
    // return value
    return division;
  }

  public static void main(String[] args) {
    
    int firstNumber = 4;
    int secondNumber = 2;

    // create an object of Main
    Main obj = new Main();
    // calling method
    int result = obj.divideNumbers(firstNumber, secondNumber);
    System.out.println("Dividing " + firstNumber + " by " + secondNumber + " is: " + result);
  }
}
