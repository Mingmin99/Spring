package di.tvSpeakerAnnotation04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Samsung")
public class SamsungTV implements TV {

	private Speaker leftSpeaker;
	private Speaker rightSpeaker;

	public SamsungTV() {
		super();
		System.out.println("SamsungTV 생성자입니다");
	}

	@Autowired
	public SamsungTV(@Qualifier("a") Speaker leftSpeaker, @Qualifier("x") Speaker rightSpeaker) {
		super();
		this.leftSpeaker = leftSpeaker;
		this.rightSpeaker = rightSpeaker;
		System.out.println("SamsungTV(Speaker leftSpeaker, Speaker rightSpeaker) 생성자입니다");
	}

	public void turnon() {
		System.out.println("삼성tv 켜짐");

	}

	public void turnoff() {
		System.out.println("삼성tv 꺼짐");

	}

	public void volumeup() {
		System.out.println("삼성tv 볼륨업");
		rightSpeaker.volumeup();
		leftSpeaker.volumeup();

	}

	public void volumedown() {
		System.out.println("삼성tv 볼륨다운");
		rightSpeaker.volumedown();
		leftSpeaker.volumedown();

	}

	public void printSpeakerBrand() {
		System.out.println("오른쪽 스피커 브랜드는" + rightSpeaker.getBrand() + "왼쪽 스피커 브랜드는" + leftSpeaker.getBrand() + "입니다");

	}

}
