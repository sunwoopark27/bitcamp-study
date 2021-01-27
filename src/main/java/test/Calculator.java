package test;

public class Calculator {

  int result = 0;

  void plus(int value) {
    this.result += value;
  }

  void minus(int value) {
    this.result -= value;
  }

  void multiply(int value) {
    this.result *= value;
  }

  void divide(int value) {
    this.result /= value;
  }
}
