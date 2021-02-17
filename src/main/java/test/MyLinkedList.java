package test;

//06하는중
public class MyLinkedList {

  Node first;
  Node last;
  int size;

  static class Node{
    Object value;
    Node next;
    public Node() {}
    public Node(Object value) {
      this.value = value;
    }
  }

  public boolean add(Object e) {
    Node node = new Node();
    node.value = e;
    if(last == null) {
      first = node;
    }else {
      last.next = node;
    }
    last = node;
    this.size++;

    return true;
  }

  public void add(int index, Object element) {
    if(index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    Node node = new Node(element);
    size++;
    if(index == 0) {
      node.next = first;
      first = node;
      return;
    }
  }

  public Object get(int index) {
    if(index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    Node cursor = first;
    for (int i = 0; i <= index ; i++) {
      cursor = cursor.next;
    }
    return cursor.value;
  }
}
