package test.util2;

import test.util.Calculator;

public class Calculator2 extends Calculator{

  public void minus(int value) {
    this.result -= value;
  }

  public void minus(int value1, int value2) { //오버로드
    this.result -= value1;
    this.result -= value2;
  }

  public void plus(int value1, int value2) { //상속받은 클래스와 똑같은 이름(단, 파라미터는 달라야하죠) 오버로드
    this.result += value1;
    this.result += value2;
  }
}
