package com.eomcs.lang.ex05;

//# 증감 연산자 : 전위(pre-fix) 증감 연산자 응용 II
//
public class Exam0682 {
  public static void main(String[] args) {
    // 주의!
    // 1) pre-fix 연산자나 post-fix 연산자를 리터럴에 적용할 수 없다.
    //int x = ++100; // 컴파일 오류!
    //x = 100++; // 컴파일 오류!

    // 2) 변수에 동시에 적용할 수 없다.
    int y = 100;
    //++y++; // 컴파일 오류!
    //++y 하면 이미 그 부분은 리터럴 값이기 때문에 다음에 ++가 다시 붙으면
    //리터럴 값에 ++ 하는 것처럼 되기 때문에 오류가 난다.

    //(++y)++; // 컴파일 오류!
    //++(y++); // 컴파일 오류!
  }
}






