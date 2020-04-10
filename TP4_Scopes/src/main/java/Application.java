
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ruffin.service.SpeakerServiceImpl;

public class Application {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		//////////////////////
		//	TEST SINGLETON	//
		//////////////////////
		/*
		SpeakerServiceImpl serviceSingleton1 = appContext.getBean("speakerService", SpeakerServiceImpl.class);
		// Test scope Bean.singleton1
		System.out.println(serviceSingleton1);
		SpeakerServiceImpl serviceSingleton2 = appContext.getBean("speakerService", SpeakerServiceImpl.class);
		// Test scope Bean.singleton2
		System.out.println(serviceSingleton2);
		System.out.println(serviceSingleton1.findAll().get(0).getFirstName());
		System.out.println(serviceSingleton2.findAll().get(0).getFirstName());

		// CONSTAT Test scope Bean.singleton
		// Nous utilisons bien qun'une m�me et seul adresse memoire pour l'objet SpeakerServiceImpl
		// com.ruffin.service.SpeakerServiceImpl@7722c3c3
		 */

		//////////////////////
		//	TEST PROTOTYPE	//
		//////////////////////

		SpeakerServiceImpl servicePrototype1 = appContext.getBean("speakerService", SpeakerServiceImpl.class);
		// Test scope Bean.prototype1
		System.out.println(servicePrototype1);
		SpeakerServiceImpl servicePrototype2 = appContext.getBean("speakerService", SpeakerServiceImpl.class);
		// Test scope Bean.prototype2
		System.out.println(servicePrototype2);
		// CONSTAT Test scope Bean.prototype
		// Nous utilisons bien differentes adresses memoires pour l'objet SpeakerServiceImpl
		// avec l'aide d'une unique demande de Bean
		// com.ruffin.service.SpeakerServiceImpl@50eac852
		// com.ruffin.service.SpeakerServiceImpl@61df66b6

		System.out.println(servicePrototype1.findAll().get(0).getFirstName());
		System.out.println(servicePrototype2.findAll().get(0).getFirstName());

		//////////////////
		// 	WEB SCOPE	//
		//////////////////

		//////////////
		//	REQUEST	//
		//////////////
		
		// �tend une d�finition de bean unique au cycle de vie d'une seule requ�te HTTP; 
		// c'est-�-dire que chaque requ�te HTTP aura sa propre instance d'un bean cr��
		// issu d'une d�finition de bean unique. Valable uniquement dans le contexte
		// d'une Web ApplicationContext Spring.
		
		
		//////////////
		//	SESSION	//
		//////////////
		
		// �tend une d�finition de bean unique au cycle de vie d'un session HTTP.
		// Valable uniquement dans le contexte d'une Web ApplicationContext Spring.
		

		//////////////////////
		//	GLOBAL SESSION	//
		//////////////////////

		// �tend une d�finition de bean unique au cycle de vie du temps pass� sur une session
		// global HTTP. G�n�ralement valide uniquement lorsqu'il est utilis� dans un contexte de portlet.
		// Valable uniquement dans le contexte d'une Web ApplicationContext Spring.
	}
}
