package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ddd {
  public static void main(String[] args) {
    java.sql.Connection con = null;

    try {
      con = DriverManager.getConnection(
          "jdbc:mariadb://localhost:3306/studydb",
          "study",
          "1111"
          );

      System.out.println("DBMS와 연결!");
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        con.close();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      System.out.println("연결 해제");
    }
  }
}
