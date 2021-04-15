// 애노테이션 프로퍼티 타입
package com.eomcs.annotation.ex6;

// @MyAnnotation은 메서드와 타입(인터페이스와 클래스)에만 붙일 수 있다.
//@MyAnnotation2 // OK!
public class MyClass2 {

  @MyAnnotation2 int i; // 컴파일 오류!
  @MyAnnotation2 static int i2; // 컴파일 오류!

  // @MyAnnotation2
  public void m(/*@MyAnnotation2*/ int p) {
    /*@MyAnnotation2*/ int a;
  } 


}
