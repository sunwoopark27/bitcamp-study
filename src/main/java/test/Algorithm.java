package test;

public class Algorithm {
  static Object[] elementData = new Object[5];
  static int size;


  static public boolean add(Object e) {
    if(size == elementData.length) {
      grow();
    }
    elementData[size++] = e;
    return true;
  }

  static private void grow() {
    System.out.println("오호라 배열 늘리자");
    Object[] newArray = new Object[size >> 1];
    for(int i = 0; i < size; i++) {
      newArray[i] = elementData[i];
    }
    elementData = newArray;
  }


  static public void add(int index, Object element) {

    if(size == elementData.length) {
      grow();
    }
    if(index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    for(int i = size; i > index; i--) {
      elementData[i] = elementData[i-1];
    }
    elementData[index] = element;
    size++;
  }



  static public Object get(int index) {
    if(index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    return elementData[index];
  }

  static public Object set(int index, Object element) {
    Object old = elementData[index];
    elementData[index] = element;
    return old;
  }

  static public Object remove(int index, Object element) { 
    Object old = elementData[index];

    for(int i = index; i < size; i++) {
      elementData[i] = elementData[i + 1];
    }
    size --;

    return old;
  }


}
