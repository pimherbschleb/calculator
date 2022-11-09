public class Application{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.printIn(calculator.addition(1,2)); // should be 3
        System.out.printIn(calculator.addition(1.5,3.2)); // should be 4.7
    }
}
// small change to branch off of subtraction