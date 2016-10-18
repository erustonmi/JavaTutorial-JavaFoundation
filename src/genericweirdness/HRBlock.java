package genericweirdness;

import java.util.ArrayList;
import java.util.List;

public class HRBlock {

	public static void computeTaxes(
			Taxable[] lt) {
		Corporation c = null;
		lt[0] = c;
		for (Taxable t : lt) {
			computeTaxes(t);
		}
	}
	public static void computeTaxes(
			List<? extends Taxable> lt) {
		Corporation c = null;
//		lt.add(c); Not legal for ? extends Taxable
		for (Taxable t : lt) {
			computeTaxes(t);
		}
	}
	public static void computeTaxes(Taxable t) {
		// t dot doTaxes...
	}
	
	public static void collectClients(
			List<? super Individual> li) {
		Individual i = null;
		li.add(i);
//		Individual x = li.get(0); ERROR for ? super...
	}
	public static void main(String[] args) {
		List<Taxable> clients = new ArrayList<>();
		computeTaxes(clients);
		List<Individual> li = new ArrayList<>();
		computeTaxes(li);
		Individual[] ia = {};
		computeTaxes(ia);
		Taxable t = null;
		computeTaxes(t);
		Corporation c = null;
		computeTaxes(c);
		
		collectClients(li);
		collectClients(clients);
	}

}
