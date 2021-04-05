// SQL 문에 삽입할 파라미터 전달하기 - 일반 객체를 이용하여 여러 개의 값 넘기기
package com.eomcs.mybatis.ex03.e;

import java.util.HashMap;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.eomcs.mybatis.vo.Board;

public class Exam0110 {

  public static void main(String[] args) throws Exception {
    SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(
        "com/eomcs/mybatis/ex03/e/mybatis-config.xml")).openSession(true);

    Board board = new Board();
    board.setTitle("게시글1");
    board.setContent("내용1");

    int count = sqlSession.insert("BoardMapper.insertBoard", board);
    System.out.printf("%d 개의 데이터를 입력 했음!\n", count);

    HashMap<String,Object> fileInfo = new HashMap<>();

    fileInfo.put("filePath", "aaa.gif");
    fileInfo.put("boardNo", board.getNo());
    count = sqlSession.insert("BoardMapper.insertFile", fileInfo);
    System.out.printf("%d 개의 첨부파일을 입력 했음!\n", count);

    fileInfo.put("filePath", "bbb.gif");
    fileInfo.put("boardNo", board.getNo());
    count = sqlSession.insert("BoardMapper.insertFile", fileInfo);
    System.out.printf("%d 개의 첨부파일을 입력 했음!\n", count);

    fileInfo.put("filePath",
        "12345678901234567890123456789012345678901234567890"
            + "12345678901234567890123456789012345678901234567890"
            + "12345678901234567890123456789012345678901234567890"
            + "12345678901234567890123456789012345678901234567890"
            + "12345678901234567890123456789012345678901234567890"
            + "12345678901234567890123456789012345678901234567890"
            + ".gif");
    fileInfo.put("boardNo", board.getNo());
    count = sqlSession.insert("BoardMapper.insertFile", fileInfo);
    System.out.printf("%d 개의 첨부파일을 입력 했음!\n", count);

    sqlSession.close();

    System.out.println("실행 완료!");
  }

}


