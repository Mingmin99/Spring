package di.tvSpeaker;

public class SamsungTV implements TV {

	String leftspeaker;
	String rightspeaker;

	public void turnon() {
		System.out.println("삼성tv 켜짐");

	}

	public void turnoff() {
		System.out.println("삼성tv 꺼짐");

	}

	public void volumeup() {
		System.out.println("삼성tv 볼륨업");

	}

	public void volumedown() {
		System.out.println("삼성tv 볼륨다운");

	}

}
