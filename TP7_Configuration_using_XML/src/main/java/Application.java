
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ruffin.service.SpeakerServiceImpl;

public class Application {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		// testons aussi le constructeur avec parametres
		// il suffit de deplace l'annotation @Autowired sur la méthodes que l'on
		// souhaites executer au runtime
		
		SpeakerServiceImpl serviceSingleton1 = appContext.getBean("speakerService", SpeakerServiceImpl.class);
		System.out.println(serviceSingleton1);
		System.out.println(serviceSingleton1.findAll().get(0).getFirstName());

	}
	
	//////////////////
	//	Stereotypes	//
	//////////////////
	
	// permet de couvrir les aspects MVC de Spring à l'aide de :
	// ==> @ComponentScan({package à scanner au runtime}): permet d'indiquer à Spring qu'elles
	// package sont à scanner lors du runtime, permet ainsi de charger les beans et components.
	// ==> @Component
	// fonctionne comme un bean mais pour les classes
	// ==> @Service
	// fonctionne comme un bean mais pour les classes implementant une interface service
	// dans notre ex: nous permet l'acces aux service findAll()
	// ==> @Repository
	// fonctionne comme un bean mais pour les classes implementant une interface repository (ex : DAO)
	// dans notre ex: nous permet l'acces aux repository ici le dao nous retournant des information d'une personne
	// Le scope level n'est pas redefinie car singleton par defaut
}
