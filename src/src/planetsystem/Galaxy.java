package planetsystem;

import java.util.ArrayList;

public class Galaxy{

	private char galaxyId;
	private ArrayList<Planet> planets;

	public Galaxy(char galaxyId, ArrayList<Planet> planets) {
		this.galaxyId = galaxyId;
		this.planets = planets;
	}

	public char getGalaxyId() {
		return galaxyId;
	}


}
