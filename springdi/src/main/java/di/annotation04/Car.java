package di.annotation04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Qualifier("h")
	@Autowired
	private Tire tire;

	public Car() {
		System.out.println("Car() 생성자입니다.");
	}

	public Car(@Qualifier("h1") Tire tire) {
		this.tire = tire;
		System.out.println("Car(Tire tire) 생성자입니다.");
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire(Tire tire) 입니다.");
	}

	public void printTireBrand() {
		System.out.println("타이어 브랜드는 " + tire.getTireBrand());
	}
}
