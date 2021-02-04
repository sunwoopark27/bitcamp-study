package test;

public class tttt { //
  static class Node{
    Object value;
    Node first;
    Node last;
  }

  public static void main(String[] args) {
    Node node = new Node();
    node.value = new Integer(100);
    node.value = Integer.valueOf(100); //위랑 같음
  }
}
