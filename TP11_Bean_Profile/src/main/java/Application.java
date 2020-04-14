
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ruffin.service.SpeakerServiceImpl;

public class Application {

	public static void main(String[] args) {
		// afin que la configuration d'environnement "dev" soit prise en compte 
		// nous devons modifier et ajouter dans la VM Options
		// ==> Run/Configuration/Arguments et ajouter dans VM Arguments la ligne suivante:
		// -Dspring.profiles.active=dev
		// Leve l' Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: 
		// No bean named 'speakerService' available
		// => Dans le cas ou la configuration dev n'est pas renseigné

		@SuppressWarnings("resource")
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		SpeakerServiceImpl serviceSingleton1 = appContext.getBean("speakerService", SpeakerServiceImpl.class);
		System.out.println(serviceSingleton1);
		System.out.println(serviceSingleton1.findAll().get(0).getFirstName());
		System.out.println(serviceSingleton1.findAll().get(0).getSeedNum());

	}
}
