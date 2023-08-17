package di.tvSpeaker;

public class LGTV implements TV {
	
	String leftspeaker;
	String rightspeaker;
	

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

}
