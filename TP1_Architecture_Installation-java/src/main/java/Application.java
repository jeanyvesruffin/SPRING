
import com.ruffin.service.ISpeakerService;
import com.ruffin.service.SpeakerServiceImpl;

public class Application {

	public static void main(String[] args) {
	
		// declaration  instanciation du service
		// Redefinissant l'interface
		// cela est appelé couplage fort
		ISpeakerService service = new SpeakerServiceImpl();
		System.out.println(service.findAll().get(0).getFirstName());
	}

}
