package classesandinterfaces;

import java.util.Arrays;
import java.util.List;

public class CompanyOfPhotogs implements Photographer {
	private List<Photographer> lp = Arrays.asList(
			new ExperiencedPhotogapher(),
			new ProfessionalPhotographer("Jim")
			);

	private Photographer currentlyOnCall = lp.get(0);
	@Override
	public void takePhoto(String subject) {
		currentlyOnCall.takePhoto(subject);
	}

	// change "strategy" implementation at runtime...
	public void switchWorker() {
		currentlyOnCall = lp.get(1);
	}
}
