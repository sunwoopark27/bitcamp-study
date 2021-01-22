package test.ex01;

public class MyClass {  
  //스태틱 필드(변수) = 클래스 필드(변수)
  //   -클래스가 로딩된 후 자동으로 이 명령은 수행된다.
  //클래스에 직속으로 선언하는 변수
  static int a = 1;

  //인스턴스 필드(변수)
  //  - new 명령을 실행할 때 이 명령은 수행된다.
  int b = 10;
  static void m() {
    //로컬 변수
    //  - 메서드가 호출 될 때 이 명령은 실행된다.
    int c;
    // static int d; //static은 로컬에 선언 불가

    c = 100;
    System.out.println(c);


  }
}