// SqlSession 사용법 - select 문 실행하기 : 자바 객체의 프로퍼티 이름과 컬럼명을 일치시키기 II
package com.eomcs.mybatis.ex02.f;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.eomcs.mybatis.vo.Board;

public class Exam0120 {

  public static void main(String[] args) throws Exception {
    SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(
        "com/eomcs/mybatis/ex02/f/mybatis-config.xml")).openSession();


    Board b = sqlSession.selectOne("BoardMapper.selectBoard2", 100);

    if (b == null) {
      System.out.println("해당 번호의 게시글이 없습니다.");
    }

    System.out.printf("%d,%s,%s,%s,%d\n",
        b.getNo(),
        b.getTitle(),
        b.getContent(),
        b.getRegisteredDate(),
        b.getViewCount());

    sqlSession.close();
  }

}


