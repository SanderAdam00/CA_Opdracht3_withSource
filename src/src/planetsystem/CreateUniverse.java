package planetsystem;

import misc.Color;

import java.util.ArrayList;

public class CreateUniverse {


	public void createGalaxyA(){
		//creating galaxy A
		ArrayList<Galaxy> galaxyA = new ArrayList<>();
		Planet planetA1 = new Planet(1, Color.RED, 'A');
		Planet planetA2 = new Planet(2, Color.BLUE, 'A');
		Planet planetA3 = new Planet(3, Color.YELLOW, 'A');
		Planet planetA4 = new Planet(4, Color.RED, 'A');
		Planet planetA5 = new Planet(5, Color.RED, 'A');
		Planet planetA6 = new Planet(6, Color.YELLOW, 'A');
		Planet planetA7 = new Planet(7, Color.RED, 'A');
		Planet planetA8 = new Planet(8, Color.RED, 'A');
		Planet planetA9 = new Planet(9, Color.YELLOW, 'A');

		galaxyA.add(planetA1);
		galaxyA.add(planetA2);
		galaxyA.add(planetA3);
		galaxyA.add(planetA4);
		galaxyA.add(planetA5);
		galaxyA.add(planetA6);
		galaxyA.add(planetA7);
		galaxyA.add(planetA8);
		galaxyA.add(planetA9);
	}

	public void creataGalaxyB(){
		ArrayList<Galaxy> galaxyB = new ArrayList<>();
		Planet planetB1 = new Planet(1, Color.RED, 'B');
		Planet planetB2 = new Planet(2, Color.RED, 'B');
		Planet planetB3 = new Planet(3, Color.YELLOW, 'B');
		Planet planetB4 = new Planet(4, Color.YELLOW, 'B');
		Planet planetB5 = new Planet(5, Color.RED, 'B');
		Planet planetB6 = new Planet(6, Color.RED, 'B');
		Planet planetB7 = new Planet(7, Color.BLUE, 'B');
		Planet planetB8 = new Planet(8, Color.RED, 'B');
		Planet planetB9 = new Planet(9, Color.GREEN, 'B');

		galaxyB.add(planetB1);
		galaxyB.add(planetB2);
		galaxyB.add(planetB3);
		galaxyB.add(planetB4);
		galaxyB.add(planetB5);
		galaxyB.add(planetB6);
		galaxyB.add(planetB7);
		galaxyB.add(planetB8);
		galaxyB.add(planetB9);
	}

	
}
