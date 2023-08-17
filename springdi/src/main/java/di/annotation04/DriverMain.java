package di.annotation04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {

    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("SpringAnnotation03.xml");

        di.annotation03.Car car = context.getBean("car", di.annotation03.Car.class);
        car.printTireBrand();
    }

}
