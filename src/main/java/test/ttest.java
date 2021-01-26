package test;

public class ttest {

  public static void main(String[] args) {

    class Score{
      String name;
      int kor;
      int eng;
      int math;
    }

    final int LENGTH = 3;
    Score[] scores = new Score[LENGTH];

    for(int i = 0; i < LENGTH; i++) {
      scores[i] = new Score();
    }
    scores[0].name = "홍길동";
    scores[0].kor = 100;
    scores[0].eng = 100;
    scores[0].math = 100;

    scores[1].name = "임꺽정";
    scores[1].kor = 100;
    scores[1].eng = 100;
    scores[1].math = 100;

    scores[2].name = "유관순";
    scores[2].kor = 100;
    scores[2].eng = 100;
    scores[2].math = 100;


    for(int i = 0; i < LENGTH; i++) {

      System.out.printf("%s, %d, %d, %d\n", scores[i].name, scores[i].kor, scores[i].eng, scores[i].math);
    }



  }

}
