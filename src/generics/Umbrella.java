package generics;

public class Umbrella implements Sized {
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Umbrella(int size) {
		super();
		this.size = size;
	}
	
}
