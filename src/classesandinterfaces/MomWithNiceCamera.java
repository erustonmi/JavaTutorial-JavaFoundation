package classesandinterfaces;

public class MomWithNiceCamera implements Photographer {
	@Override
	public void takePhoto(String subject) {
		System.out.println("Smile " + subject + " ... click");
	}
}
