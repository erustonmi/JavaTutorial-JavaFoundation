package classesandinterfaces;

public class ProfessionalPhotographer implements Photographer {
	private String name;
	
	public ProfessionalPhotographer(String name) {
		this.name = name;
	}
	
//	public ProfessionalPhotographer() {}
	
	@Override
	public void takePhoto(String subject) {
		System.out.println("Set up lights, pose people, smile " 
				+ subject + " click, click, click, here's a bill");
	}

}
