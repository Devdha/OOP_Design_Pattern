## Templete Method Pattern

---

### 1. 사용 이유

알고리즘 구조는 동일하게 사용하되 각 콘크리트 클래스에서 내부 알고리즘은 독립적으로 구현하기 위해 사용된다.  
(상위 클래스에서 처리의 뼈대를 결정하고, 하위 클래스에서 그 구체적 내용을 결정한다.)

```java
// 상위 클래스(추상 메소드)
public abstract class Car {
  public final void startCar() {
    System.out.println("시동을 켭니다.");
  }

  public final void turnOff() {
    System.out.println("시동을 끕니다.");
  }

  public abstract void drive();

  public abstract void stop();

  public void run() {
    startCar();
    drive();
    stop();
    turnOff();
  }
}

// 하위 클래스(구상 메소드)
public class AICar extends Car {
  public void drive() {
    System.out.println("자율 주행합니다.");
    System.out.println("자동차가 스스로 방향을 바꿉니다.");
  }

  public void stop() {
    System.out.println("스스로 멈춥니다.");
  }
}

public abstract class Car {
  public final void startCar() {
    System.out.println("시동을 켭니다.");
  }

  public final void turnOff() {
    System.out.println("시동을 끕니다.");
  }

  public abstract void drive();

  public abstract void stop();

  public void run() {
    startCar();
    drive();
    stop();
    turnOff();
  }
}
```
