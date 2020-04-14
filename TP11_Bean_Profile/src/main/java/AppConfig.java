import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ruffin.util.CalendarFactory;


@Configuration
@ComponentScan({"com.ruffin"})
public class AppConfig {

	// Nous utilisons ici le fichier de configuration applicationContext.xml
	
	// nous allons ajouter deux bean à notre factory
	@Bean(name = "cal")
	public CalendarFactory calFacTory() {
		CalendarFactory factory = new CalendarFactory();
		factory.addDays(2);
		return factory;
	}
	
	@Bean
	public Calendar cal() throws Exception {
		return calFacTory().getObject();
	}
	// que l'on cable (wire) sur notre class HibernateSpeakeRepositoryImpl
	
}
