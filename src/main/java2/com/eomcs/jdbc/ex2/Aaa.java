package com.eomcs.jdbc.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Aaa {
  public static void main(String[] args) {
    String title = null;
    String contents = null;

    try(Scanner keyScan = new Scanner(System.in)) {

      // 사용자로부터 제목, 내용을 입력 받는다.
      System.out.print("제목? ");
      title = keyScan.nextLine();

      System.out.print("내용? ");
      contents = keyScan.nextLine();

      System.out.print("입력하시겠습니까?(Y/n) ");
      String input = keyScan.nextLine();

      if (!input.equalsIgnoreCase("y") && input.length() != 0) {
        System.out.println("등록을 취소 하였습니다.");
        return;
      }
    }

    try (Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        Statement stmt = con.createStatement();) {

      String sql = String.format("inser into x_board(title,contents) values('%s, '%s')", title, contents);

      int count = stmt.executeUpdate(sql);
      System.out.printf("%d 개 입력 성공!", count);
    } catch(Exception e) {

    }
  }
}
