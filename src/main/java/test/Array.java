package test;

import java.util.Arrays;

public class Array<E> {

  private static final int DEFAULT_CAPACITY = 5;
  private Object[] elementData;
  private int size;

  public Array() {
    elementData = new Object[DEFAULT_CAPACITY];
  }
  public Array(int initialCapacity) {
    if(initialCapacity < DEFAULT_CAPACITY) {
      elementData = new Object[DEFAULT_CAPACITY];
    }else {
      elementData = new Object[initialCapacity];
    }
  }


  public boolean add(E e) {
    if(size == elementData.length) {
      grow();
    }
    elementData[size++] = e;
    return true;
  }

  private void grow() {
    System.out.println("오호라 배열 늘리자");
    int newCapacity = elementData.length + (elementData.length >> 1);
    elementData = Arrays.copyOf(elementData, newCapacity);
  }


  public void add(int index, E element) {

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

  @SuppressWarnings("unchecked")
  public E get(int index) {
    if(index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    return (E) elementData[index];
  }

  @SuppressWarnings("unchecked")
  public E set(int index, E element) {
    if(index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    Object old = elementData[index];
    elementData[index] = element;
    return (E) old;
  }

  @SuppressWarnings("unchecked")
  public E remove(int index) { 

    Object old = elementData[index];

    System.arraycopy(elementData, index + 1, elementData, index, size - (index + 1));

    //    for(int i = index; i < size; i++) {
    //      elementData[i] = elementData[i + 1];
    //    }
    size --;
    elementData[size] = null;

    return (E) old;
  }

  public int size() {
    return size;
  }

  public Object toArray() {
    Object arr = Arrays.copyOf(elementData, this.size);
    return arr;
  }

  @SuppressWarnings("unchecked")
  public E[] toArray(E[] arr) {
    if(arr.length < this.size) {
      return (E[]) Arrays.copyOf(this.elementData, this.size, arr.getClass());
    }
    System.arraycopy(elementData, 0, arr, 0, this.size);
    return arr;

  }
}
