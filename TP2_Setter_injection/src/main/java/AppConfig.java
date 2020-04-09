import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ruffin.service.ISpeakerService;
import com.ruffin.service.SpeakerServiceImpl;

//////////////////////////////////
// Registre ou configuration    //
// sont maintenant des beans !!	//
//////////////////////////////////


// Spring Configuration

@Configuration
public class AppConfig {

	// Nous declarons une methode qui nous retourne "le contrat" de l'interface
	// que l'on mettra dans un bean (Spring Bean)
	@Bean(name = "speakerService")
	public ISpeakerService getISpeakerService() {
		return new SpeakerServiceImpl();
	}

}





// L'annotation Spring @Configuration
// nous permet d'utiliser des annotations
// pour l'injection de dépendances. 
// ==> c'est l'equivalent de notre 
// applicationContext.xml)
// Pour ajouter des beans à notre component Spring
// il faut ajouter l'annotation @Bean 