import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ruffin.repository.HibernateSpeakerRepositoryImpl;
import com.ruffin.repository.IHibernateSpeakerRepository;
import com.ruffin.service.ISpeakerService;
import com.ruffin.service.SpeakerServiceImpl;


@Configuration
public class AppConfig {

	// Nous pouvons definir le scope Spring
	// La ou les instances d'un bean sont créées par Spring
	// selon la configuration soit sous la forme d'un singleton (instance unique)
	// ou de prototype (une instance est créée à chaque demande au conteneur)
	// indiqué par @Scope(value = BeanDefinition.singleton ou prototype)
	
	//////////////////////////////////////
	//	Test scope singleton	//
	//////////////////////////////////////
	/* 
	@Bean(name = "speakerService")
	@Scope(value = BeanDefinition.SCOPE_SINGLETON )
	public ISpeakerService getISpeakerService() {
		SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
		return service;
	} */
	//////////////////////////////////////
	//	Test scope prototype	//
	//////////////////////////////////////
	@Bean(name = "speakerService")
	@Scope(value = BeanDefinition.SCOPE_PROTOTYPE )
	public ISpeakerService getISpeakerService() {
		SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
		return service;
	}

	@Bean(name = "speakerRepository")
	public IHibernateSpeakerRepository getSpeakerRepository() {
		return new HibernateSpeakerRepositoryImpl();
	}
}
