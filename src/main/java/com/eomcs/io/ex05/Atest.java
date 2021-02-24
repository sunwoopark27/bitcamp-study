package com.eomcs.io.ex05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Atest {
  public static void main(String[] args) throws IOException {

    FileReader in = new FileReader("temp/test2.txt");

    BufferedReader in2 = new BufferdReader(in);

    System.out.println(in2.readLine());

    in.close();

  }
}
