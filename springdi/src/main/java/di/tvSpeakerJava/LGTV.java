package di.tvSpeakerJava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("LG")
public class LGTV implements TV {

	Speaker leftspeaker;
	Speaker rightspeaker;

	public void turnon() {
		System.out.println("LGtv 켜짐");

	}

	public void turnoff() {
		System.out.println("LGtv 꺼짐");

	}

	public void volumeup() {
		System.out.println("LGtv 볼륨업");

	}

	public void volumedown() {
		System.out.println("LGtv 볼륨다운");

	}

	@Autowired
	public LGTV(@Qualifier("a") Speaker leftspeaker, @Qualifier("x") Speaker rightspeaker) {
		super();
		this.leftspeaker = leftspeaker;
		this.rightspeaker = rightspeaker;
	}

	public void printSpeakerBrand() {
		// TODO Auto-generated method stub

	}

}
