package test.ex05;

public class Calculator {

  int result;

  //밑에 Calculator that은 인스턴스 주소 받는 거야 

  static void plus(Calculator that, int value) {
    that.result += value;
  }

  static void minus(Calculator that, int value) {
    that.result -= value;
  }

  static void multiple(Calculator that, int value) {
    that.result *= value;
  }

  static void divide(Calculator that, int value) {
    that.result /= value;
  }
}
