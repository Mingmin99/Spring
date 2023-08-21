package di.tvSpeakerJava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import di.java.Config;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(di.tvSpeakerJava.Config.class);

		TV tv = (TV) context.getBean("Samsung", TV.class);
		tv.turnon();
		tv.volumedown();
		tv.volumeup();
		tv.printSpeakerBrand();
		tv.turnoff();
	}

}
