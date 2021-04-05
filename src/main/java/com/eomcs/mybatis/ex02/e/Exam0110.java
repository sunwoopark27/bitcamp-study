// SqlSession 사용법 - select 문 실행하기 : 자바 객체의 프로퍼티 이름과 컬럼명을 일치시키기 II
package com.eomcs.mybatis.ex02.e;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam0110 {

  public static void main(String[] args) throws Exception {
    SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(
        "com/eomcs/mybatis/ex02/e/mybatis-config.xml")).openSession();

    List<Map<String,Object>> list = sqlSession.selectList("BoardMapper.selectBoard");

    // 컬러몀과 자바 객체의 프로퍼티명이 일치한다면 다음과 같이 정상적으로 데이터를 꺼내올 수 있다.
    for (Map<String,Object> map : list) {
      System.out.printf("%d,%s,%s,%s,%d\n",
          map.get("board_id"),
          map.get("title"),
          map.get("contents"),
          map.get("created_date"),
          map.get("view_count"));
    }

    sqlSession.close();
  }

}


