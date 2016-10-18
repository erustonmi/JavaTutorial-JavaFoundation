package classesandinterfaces;

public class ExperiencedPhotogapher implements Photographer {

	@Override
	public void takePhoto(String subject) {
		System.out.println("Do lots of thinking, take picture of " + subject);
	}

}
