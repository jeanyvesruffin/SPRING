
import com.ruffin.service.ISpeakerService;
import com.ruffin.service.SpeakerServiceImpl;

public class Application {

	public static void main(String[] args) {
		ISpeakerService service = new SpeakerServiceImpl();
		System.out.println(service.findAll().get(0).getFirstName());
	}

}
