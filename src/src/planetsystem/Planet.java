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
	private Set<Galaxy> galaxySet;

	public Planet(Galaxy galaxy, int id, Color color) {
		this.galaxy = galaxy;
		this.id = id;
		this.color = color;
		addGalaxyNeighbours(galaxy);
	}


	public Set<Galaxy> addGalaxyNeighbours(Galaxy galaxy){
		switch (galaxy){
			case A:
				galaxySet.add(Galaxy.A);
				galaxySet.add(Galaxy.B);
				galaxySet.add(Galaxy.D);
				break;
			case B:

                A, D, K, F



		}
	}

	public void addPlanetSet(Planet[] planet) {
		this.planetSet.addAll(Arrays.asList(planet));
	}

	public void addGalaxySet(Galaxy[] galaxy){
		this.galaxySet.addAll(Arrays.asList(galaxy));
	}

	public Galaxy getGalaxy() {
		return galaxy;
	}

	public Set<Planet> getPlanetSet() {
		return planetSet;
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
