package planetsystem;

import misc.Color;

public class Planet {

	private int id;
	private Color color;

	public Planet(int id, Color color) {
		this.id = id;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public Color getColor() {
		return color;
	}


}
