package di.tvSpeakerJava;

import org.springframework.stereotype.Component;

@Component("x")
public class XYZSpeaker implements Speaker {

	public void volumeup() {
		System.out.println("XYZSpeaker스피커 볼륨업");
	}

	public void volumedown() {
		System.out.println("XYZSpeaker스피커 볼륨다운");

	}

	public String getBrand() {
		return "XYZ";

	}

}
