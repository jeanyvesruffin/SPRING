
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ruffin.service.SpeakerServiceImpl;

public class Application {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		SpeakerServiceImpl serviceSingleton1 = appContext.getBean("speakerService", SpeakerServiceImpl.class);
		
		// A l'aide de l'autowired et du System.out.println ()
		// Nous pouvons constater comment est crée le constructeur au demarrage 
		
		System.out.println(serviceSingleton1);
		System.out.println(serviceSingleton1.findAll().get(0).getFirstName());

	}
}
