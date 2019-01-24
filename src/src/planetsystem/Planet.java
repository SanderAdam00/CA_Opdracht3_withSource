package planetsystem;

import misc.Galaxy;
import misc.Color;

import java.util.Set;

public class Planet implements Comparable<Planet> {

	private Galaxy galaxy;
	private int id;
	private Color color;
	private Set<Planet> planetSet;
	private Set<Galaxy> galaxySet;


	public Planet(Galaxy galaxy, int id, Color color) {
		this.galaxy = galaxy;
		this.id = id;
		this.color = color;
	}



	public int getId() {
		return id;
	}

	public Color getColor() {
		return color;
	}

	@Override
	public int compareTo(Planet o) {
		return 0;
	}
}