// 애노테이션 프로퍼티 타입
package com.eomcs.annotation.ex6;

// @MyAnnotation5는 로컬변수, 파라미터, 필드에만 붙일 수 있다.
//@MyAnnotation5 
public class MyClass5 {

  @MyAnnotation5 int i; // 컴파일 오류!
  @MyAnnotation5 static int i2; // 컴파일 오류!

  //  @MyAnnotation5
  public void m(@MyAnnotation5 int p) {
    @MyAnnotation5 int a;
  } 


}
