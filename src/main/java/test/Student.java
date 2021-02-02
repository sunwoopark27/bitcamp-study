package test;

public class Student extends Member{
  String school;
  String major;

  @Override
  void print() { //print2라고 했었음 그러면 프로그램에 일관성이 없잖아
    //print();
    super.print(); //super class의 메서드 호출
    System.out.printf("%s, %s\n", this.school, this.major);
  }

}
