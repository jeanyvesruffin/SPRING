
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ruffin.service.SpeakerServiceImpl;

public class Application {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		SpeakerServiceImpl serviceSingleton1 = appContext.getBean("speakerService", SpeakerServiceImpl.class);
		System.out.println(serviceSingleton1);
		System.out.println(serviceSingleton1.findAll().get(0).getFirstName());
		System.out.println(serviceSingleton1.findAll().get(0).getSeedNum());

	}
}
