public class CarFactoryTest {
  public static void main(String[] args) {
    GenesisFactory genesisFactory = new GenesisFactory();
    Car genesis = genesisFactory.orderCar();
    System.out.println(genesis);

    SonataFactory sonataFactory = new SonataFactory();
    Car sonata = sonataFactory.orderCar();
    System.out.println(sonata);

    GrandeurFactory grandeurFactory = new GrandeurFactory();
    Car grandeur = grandeurFactory.orderCar();
    System.out.println(grandeur);
  }
}