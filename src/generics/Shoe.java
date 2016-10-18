package generics;

import java.awt.Color;

public class Shoe implements Sized, Colored {
	private int size;
	private Color color;

	public Shoe(int size, Color color) {
		super();
		this.size = size;
		this.color = color;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public Color getColor() {
		return color;
	}

}
