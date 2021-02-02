package test.util;

public class Calculator {
  protected int result;

  public void plus(int value) {
    this.result += value;
  }
  public int getResult() { //인스턴스의 값을 리턴해주는 메소드의 이름은 'get변(첫글자대문자)수이름'
    //메소드 이름은 대문자로 시작하는것 아님! class이름은 대문자로 시작
    return this.result;
  }
}
