package di.tvSpeakerJava;

import org.springframework.stereotype.Component;

@Component("a")
public class ABCSpeaker implements Speaker {

	public void volumeup() {
		System.out.println("ABCSpeaker스피커 볼륨업");
	}

	public void volumedown() {
		System.out.println("ABCSpeaker스피커 볼륨다운");

	}

	public String getBrand() {
		return "ABC";

	}

}
