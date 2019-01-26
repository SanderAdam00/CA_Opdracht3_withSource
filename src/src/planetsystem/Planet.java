package planetsystem;

import misc.Galaxy;
import misc.Color;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public class Planet implements Comparable<Planet> {

	private Galaxy galaxy;
	private int id;
	private Color color;
	private Set<Planet> planetSet;
	private Galaxy[] galaxySet;

	public Planet(Galaxy galaxy, int id, Color color) {
		this.galaxy = galaxy;
		this.id = id;
		this.color = color;
		addGalaxyNeighbours(galaxy);
	}

	public void addGalaxyNeighbours(Galaxy galaxy) {
		switch (galaxy) {
			case A:
			    galaxySet = new Galaxy[]{Galaxy.A, Galaxy.B, Galaxy.D};
				break;
			case B:
                galaxySet = new Galaxy[]{Galaxy.A, Galaxy.D,Galaxy.K, Galaxy.F };
                break;
			case C:
                galaxySet = new Galaxy[]{Galaxy.A, Galaxy.D, Galaxy.K, Galaxy.F};
                break;
			case D:
                galaxySet = new Galaxy[]{Galaxy.A,Galaxy.D, Galaxy.E, Galaxy.F };
				break;
			case E:
                galaxySet = new Galaxy[]{Galaxy.C,Galaxy.F,Galaxy.G};
				break;
			case F:
                galaxySet = new Galaxy[]{Galaxy.D,Galaxy.E,Galaxy.H,Galaxy.B };
				break;
			case G:
                galaxySet = new Galaxy[]{Galaxy.E,Galaxy.H };
				break;
			case H:
                galaxySet = new Galaxy[]{Galaxy.G,Galaxy.H,Galaxy.K};
				break;
			case K:
                galaxySet = new Galaxy[]{Galaxy.H, Galaxy.B};
				break;
		}
	}

	public void addPlanetSet(Planet[] planet) {
		this.planetSet.addAll(Arrays.asList(planet));
	}


	public Galaxy getGalaxy() {
		return galaxy;
	}

	public Set<Planet> getPlanetSet() {
		return planetSet;
	}

    public Galaxy[] getGalaxySet() {
        return galaxySet;
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
