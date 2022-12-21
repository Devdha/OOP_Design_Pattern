public class Americano extends Coffee {
  public static final String KENYA = "Kenya";
  public static final String ETHIOPIA = "Ethiopia";

  public Americano(String type) {

    type = type.substring(0, 1).toUpperCase() + type.substring(1);

    switch (type) {

      case KENYA:
      case ETHIOPIA:
        name = type + "Americano";
        break;
      default:
        name = "Americano";
    }

    // if (type != KENYA && type != ETHIOPIA) {
    // name = "Americano";
    // return;
    // }
    // name = type + "Americano";
  }
}