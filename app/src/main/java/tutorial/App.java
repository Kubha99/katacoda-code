/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tutorial;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }

    public int squareSum(int a, int b){
      MathOne m1 = new MathOne();
      MathTwo m2 = new MathTwo();
      return m2.simpleMultiplication(m1.simpleAddition(a,b),m1.simpleAddition(a,b));
    }

}
