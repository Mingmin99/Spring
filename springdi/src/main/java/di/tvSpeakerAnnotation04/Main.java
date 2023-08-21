package di.tvSpeakerAnnotation04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("tvSpeakerAnnotation01.xml");

		TV tv = (TV) context.getBean("Samsung", TV.class);
		tv.turnon();
		tv.volumedown();
		tv.volumeup();
		tv.printSpeakerBrand();
		tv.turnoff();
	}

}
