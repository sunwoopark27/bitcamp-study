package test.ex06;

public class App {
  public static void main(String[] args) {
    // 식 1: 2 * 3 + 7 - 2 = 11
    // 식 2: 12 / 4 -5 = -2

    Calculator r1 = new Calculator(); //메소드가 아니라 변수만 들어있는ㄱ야 인스턴스
    Calculator r2 = new Calculator();

    r1.result = 0;
    r2.result = 0;

    //인스턴스 주소를 파라미터가아니라 메소드 앞에서 받는다!

    // 기본적인 값 앞에서 받고 나머지는 파라미터로 받아
    // r1 인스턴스에 들ㅇ있는 인스턴스에 대해서 ~~ 2(ㅠㅏ라미터)를 더해
    r1.plus(2);
    r1.multiple(3);
    r1.plus(7);
    r1.minus(2);


    r2.plus(12);
    r2.divide(4);
    r2.minus(5);

    System.out.println(r1.result);
    System.out.println(r2.result);
  }

}
