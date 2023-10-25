public class Main {

  public static void main(String[] args) {
    ICalculator krwCalculator = new KrwCalculator();
    Calculator calculator = new Calculator(krwCalculator);

    System.out.println("sum : " + calculator.sum(10,5));
  }
}
