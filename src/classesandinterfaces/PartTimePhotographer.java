package classesandinterfaces;

public class PartTimePhotographer extends ProfessionalPhotographer {
	private int hoursPerWeek;
	
	public PartTimePhotographer(String name) {
		super(name);
	}
	
	public PartTimePhotographer() {
		this("Hey you");
	}

	@Override
	public void takePhoto(String subject) {
		System.out.println("Fumble fumble, smile " + subject + " click");
	}
}
