public abstract class CarTest {
	public static void main(String[] args) {
		GenesisTest genesisTest = new GenesisTest();
		Car genesis = genesisTest.produceCar();

		SonataTest sonataTest = new SonataTest();
		Car sonata = sonataTest.produceCar();

		GrandeurTest grandeurTest = new GrandeurTest();
		Car grandeur = grandeurTest.produceCar();
	}

	public abstract Car produceCar();
}