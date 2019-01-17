package planetsystem;

import misc.Color;

public class Planet extends Universe {
	private int id;
	private Color color;

	public Planet(int id, Color color, char universeId) {
		super(universeId);
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
