package com.eomcs.net.ex11;

import java.net.ServerSocket;

public class CalculatorServer {
  public static void main(String[] args) {
    try (ServerSocket socket = new ServerSocket(8888);){
      System.out.println("서버 실행 중...");

      try (Socket socket = ServerSocket.accept();)
    }
  }
}
