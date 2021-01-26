package test;

public class Test {
  public static void main(String[] args) {
    Engine setaEngine = new Engine();

    Car sonata = new Car(setaEngine);

    sonata.start();
    sonata.stop();
  }

}
