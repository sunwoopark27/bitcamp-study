// 예외 처리 - 개념
// => 메서드를 실행하는 중에 예외가 발생했을 때 호출자에게 알려주는 문법
// => 메서드를 호출하는 중에 예외를 받았을 때 처리하는 문법
// => 예외처리 문법의 의미
// 1) 메서드 실행 중에 예외 상황을 만났을 때 리턴 값으로 알려주는 방식의 한계를 극복하기 위해
// 2) 예외가 발생하더라도 시스템을 멈추지 않고 적절한 조치를 취한 후 계속 실행하기 위해
package com.eomcs.exception.ex3;

public class Exam0112 {

  static void m() {
    throw new RuntimeException("예외가 발생했습니다!");
  }

  static void test() {
    m();
    // m() 메서드가 던진 예외를 받지 않으면?
    // 즉시 현재 메서드의 실행을 멈추고 호출자에게 예외 처리를 위임한다.

    // 따라서 다음 출력코드는 실행되지 않는다.
    System.out.println("test() 호출됨!");
  }

  public static void main(String[] args) {

    // 애플리케이션 실행의 최후의 보루인 main()에서 예외를 처리하지 않는다면?

    test();
    // 위와 같이 test()를 호출하는 main()에서도 예외를 처리하지 않는다면,
    // 그 예외는 main()을 호출한 JVM에게 전달된다.
    // JVM이 예외를 받는다면 무조건 예외 정보를 출력한 후 프로그램을 종료한다.

    System.out.println("시스템을 종료합니다.");

  }

}