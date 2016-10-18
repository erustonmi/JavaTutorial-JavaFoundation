package classesandinterfaces;

import java.util.Arrays;
import java.util.List;

public class Wedding {

	public static void main(String[] args) {
		List<Photographer> lp = Arrays.asList(
				new MomWithNiceCamera(),
				new ProfessionalPhotographer("Joe"),
				new PartTimePhotographer()
				);
		for (Photographer p : lp) {
			p.takePhoto("Bride");
		}
	}

}
