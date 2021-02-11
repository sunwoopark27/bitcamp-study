package test;

public class ArrayTest {
  public static void main(String[] args) {
    Array<String> a1 = new Array<>();

    a1.add("aaa");
    a1.add("bbb");
    a1.add("ccc");
    a1.add("ddd");
    a1.add("eee");
    a1.add("fff");

    //System.out.println(a1.get(-1));
    //System.out.println(a1.get(5));

    String oldValue = a1.set(0, "xxx");
    System.out.printf("%s ====> %s\n", oldValue, a1.get(0));

    //a1.set(-1, "yyy");
    //a1.set(6, "xxx");

    System.out.println("------------------");

    print(a1);

    //a1.remove(-1); //예외 발생

    oldValue = a1.remove(5);
    System.out.printf("삭제전(%s) ==> 삭제 후(%s)\n",oldValue, a1.get(0));

    System.out.println("------------------");

    print(a1);

    System.out.println("-------------------");

    a1.add(0, "1111");
    a1.add(3, "2222");
    a1.add(6, "3333");
    //a1.add(-1, "4444"); // 예외
    a1.add(8,"5555");
    print(a1);

    System.out.println("-------------------");

  }

  static void print(Array<String> arr) {
    String[] list = new String[arr.size()];
    arr.toArray(list);
    for (String e : list) {
      System.out.println(e);
    }

  }
}
