package com.eomcs.jdbc.ex1;

public class ddd {
  java.sql.ResultSet rs = stmt.executeQuery(//
      "select * from x_board order by board_id desc");

}f (isReceived) {
  // 서버에서 한 개 가져온 결과를 출력한다.
  System.out.printf("%s, %s, %s, %s, %s\n", //
      rs.getString(1), // board_id
      rs.getString(2), // title
      rs.getString