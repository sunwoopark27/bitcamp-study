package test.ex05;

public class App {
  public static void main(String[] args) {
    // 식 1: 2 * 3 + 7 - 2 = 11
    // 식 2: 12 / 4 -5 = -2

    Calculator r1 = new Calculator(); //메소드가 아니라 변수만 들어있는ㄱ야 인스턴스
    Calculator r2 = new Calculator();

    r1.result = 0;
    r2.result = 0;

    Calculator.plus(r1, 2);
    Calculator.multiple(r1, 3);
    Calculator.plus(r1, 7);
    Calculator.minus(r1, 2);


    Calculator.plus(r2, 12);
    Calculator.divide(r2, 4);
    Calculator.minus(r2, 5);

    System.out.println(r1.result);
    System.out.println(r2.result);
  }

}
