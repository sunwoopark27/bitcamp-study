package test.ex02;

public class App3 {
  public static void main(String[] args) {

    // 인스턴스와 가비지

    MyClass v1 = new MyClass(); //static 안붙은 변수를 heap이라는 메모리에 놓아라
    v1.b = 300;
    System.out.println(v1.b);

    // 다음과 같이 새 인스턴스를 만든 다음에
    // 그 주소를 v1에 저장하면,
    // 이전 인스턴스의 주소는 잃어버린다.
    // 따라서 이전 인스턴스는 사용할 수 없다.
    // 이렇게 주소를 잃어버려 사용할 수 없는 인스턴스를 가비지라고 부른다.
    v1 = new MyClass(); 
    System.out.println(v1.b); //이제 200 원래 200 들어가 있으니까
  }
}
