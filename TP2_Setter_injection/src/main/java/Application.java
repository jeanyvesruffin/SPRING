
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ruffin.service.SpeakerServiceImpl;

public class Application {

	public static void main(String[] args) {
		// appel de la configuration Spring
		@SuppressWarnings("resource")
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// declaration  instanciation du service
		// cela est appelé couplage fort
		// Remplacer ISpeakerService service = new SpeakerServiceImpl(); par 
		// la puissance du l'injection de setter ci-dessous
		
		SpeakerServiceImpl service = appContext.getBean("speakerService", SpeakerServiceImpl.class);
		System.out.println(service);
		System.out.println(service.findAll().get(0).getFirstName());
	}

}
