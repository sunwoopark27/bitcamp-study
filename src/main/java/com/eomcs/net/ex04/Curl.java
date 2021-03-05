package com.eomcs.net.ex04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Curl { //ex06
  public static void main(String[] args) throws Exception{
    try(Socket socket = new Socket("www.kostat.go.kr",80);
        PrintStream out = new PrintStream(socket.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))){

      // 웹 서버에 요청
      out.println("GET //portal/korea/index.action"); //리퀘스트 라인
      out.println("Host: www.kostat.go.kr"); // 리퀘스트 
      out.println();//빈줄

      // 웹서버 응답받기
      String str = null;
      while((str = in.readLine()) != null) {
        System.out.println(str); // 한줄 씩 출력
      }
    }
  }
}
