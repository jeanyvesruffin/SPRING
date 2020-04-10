import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan({"com.ruffin"})
public class AppConfig {

	//////////////////
	// @Repository	//
	//////////////////


	// le @Bean(name = "speakerService") est desormais pris en charge par
	// @Service("speakerService")

	// le @Bean(name = "speakerRepository") est desormais pris en charge par
	// @Repository("speakerRepository")





	/*
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
	 */
}
