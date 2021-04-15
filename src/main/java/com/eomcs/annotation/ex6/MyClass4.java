// 애노테이션 프로퍼티 타입
package com.eomcs.annotation.ex6;

// @MyAnnotation4는 로컬변에만 붙일 수 있다.
//@MyAnnotation4 
public class MyClass4 {

  /*@MyAnnotation4*/ int i; // 컴파일 오류!
  /*@MyAnnotation4*/ static int i2; // 컴파일 오류!

  //  @MyAnnotation4
  public void m(/*@MyAnnotation4*/ int p) {
    @MyAnnotation4 int a;
  } 


}
