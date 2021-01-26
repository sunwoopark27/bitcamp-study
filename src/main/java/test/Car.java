package test;

public class Car {
  private Engine engine;

  Car(){
    engine = new Engine();
  }

  Car(Engine e){
    this.engine = e;
  }

  void start() {
    engine.onSparkPlug();
    engine.moveMotor();
  }

  void stop() {
    engine.offSparkPlug();
    engine.stopMotor();
  }
}
