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

	@Bean(name = "speakerService")
	@Scope(value = BeanDefinition.SCOPE_SINGLETON )
	public ISpeakerService getISpeakerService() {
		SpeakerServiceImpl service = new SpeakerServiceImpl();
		return service;
	}

	@Bean(name = "speakerRepository")
	public IHibernateSpeakerRepository getSpeakerRepository() {
		return new HibernateSpeakerRepositoryImpl();
	}
}
