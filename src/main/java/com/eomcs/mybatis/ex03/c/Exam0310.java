// SQL 문에 삽입할 파라미터 전달하기 - 일반 객체를 이용하여 여러 개의 값 넘기기
package com.eomcs.mybatis.ex03.c;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam0310 {

  public static void main(String[] args) throws Exception {
    SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(
        "com/eomcs/mybatis/ex03/c/mybatis-config.xml")).openSession();

    int count = sqlSession.update("BoardMapper.delete", 5);
    System.out.printf("%d 개의 데이터를 삭제 했음!\n", count);

    sqlSession.commit();

    sqlSession.close();

    System.out.println("실행 완료!");
  }
}


