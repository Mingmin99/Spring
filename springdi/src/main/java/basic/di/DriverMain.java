package basic.di;

public class DriverMain {

	public static void main(String[] args) {
		Car car = new Car();
		HankookTire hankook = new HankookTire();
		KumhooTire Kumhoo = new KumhooTire();
		car.setTire(Kumhoo);
		car.printTireBrand();

		KumhooTire k = new KumhooTire();
//		Car car2 = new Car(new KumhooTire());
		Car car2 = new Car();
		car2.printTireBrand();
	}

}
