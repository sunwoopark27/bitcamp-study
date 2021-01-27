package test;

public class ttest {

  public static void main(String[] args) {

    // 다음 식을 연산자 우선 순위를 고려하지 않고 순서대로 계산하라!
    // 2 + 3 - 1 * 7 / 3 = ?

    Calculator c1 = new Calculator();

    c1.plus(2);
    c1.plus(3);
    c1.minus(1);
    c1.multiply(7);
    c1.divide(3);

    System.out.println(c1.result);

  }


}
