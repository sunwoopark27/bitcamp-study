package test;

import java.sql.Date;

public class Test {
  //  static void print(int value) {
  //    System.out.println("====>" + value);
  //  }
  //
  //  static void print(float f) {
  //    System.out.println("====>" + f);
  //  }

  //  static void print(String str)
  //  {
  //    System.out.println("====>" + str);
  //  }  
  //
  //  static void print(Date date) {
  //    System.out.println("====>" + date);
  //  }

  static void print(Object obj) {
    System.out.println("====>" + obj.toString());
  }
  public static void main(String[] args) {

    print(Integer.valueOf(100));
    print(Float.valueOf(3.14f));
    print(3.14f);
    print("홍길동");
    print(new Date(System.currentTimeMillis()));

  }
}