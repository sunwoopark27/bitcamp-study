// SqlSession 사용법 - select 문 실행하기 : 자바 객체의 프로퍼티 이름과 컬럼명을 일치시키기 II
package com.eomcs.mybatis.ex02.f;

import java.util.Map;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam0130 {

  public static void main(String[] args) throws Exception {
    SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(
        "com/eomcs/mybatis/ex02/f/mybatis-config.xml")).openSession();


    Map<String,Object> map = sqlSession.selectOne("BoardMapper.selectBoard3", 9);

    if (map == null) {
      System.out.println("해당 번호의 게시글이 없습니다.");
    }

    System.out.printf("%d,%s,%s,%s,%d\n",
        map.get("board_id"),
        map.get("title"),
        map.get("contents"),
        map.get("created_date"),
        map.get("view_count"));

    sqlSession.close();
  }

}


