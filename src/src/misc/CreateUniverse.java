package misc;

import misc.Color;
import planetsystem.Planet;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

public class CreateUniverse {

	public ArrayList<Planet> createGalaxyA(){
		//creating galaxy A
		ArrayList<Planet> planets = new ArrayList<>();
		Planet planetA1 = new Planet(Galaxy.A, 1, Color.RED);
		Planet planetA2 = new Planet(Galaxy.A, 2, Color.BLUE);
		Planet planetA3 = new Planet(Galaxy.A, 3, Color.YELLOW);
		Planet planetA4 = new Planet(Galaxy.A, 4, Color.RED);
		Planet planetA5 = new Planet(Galaxy.A,5, Color.RED);
		Planet planetA6 = new Planet(Galaxy.A,6, Color.YELLOW);
		Planet planetA7 = new Planet(Galaxy.A,7, Color.RED);
		Planet planetA8 = new Planet(Galaxy.A,8, Color.RED);
		Planet planetA9 = new Planet(Galaxy.A,9, Color.YELLOW);



		planets.add(planetA1);
		planets.add(planetA2);
		planets.add(planetA3);
		planets.add(planetA4);
		planets.add(planetA5);
		planets.add(planetA6);
		planets.add(planetA7);
		planets.add(planetA8);
		planets.add(planetA9);

		return planets;
	}

	public ArrayList<Planet> createGalaxyB(){
		//creating galaxy B
		ArrayList<Planet> planets = new ArrayList<>();
		Planet planetB1 = new Planet(1, Color.RED);
		Planet planetB2 = new Planet(2, Color.RED);
		Planet planetB3 = new Planet(3, Color.YELLOW);
		Planet planetB4 = new Planet(4, Color.YELLOW);
		Planet planetB5 = new Planet(5, Color.RED);
		Planet planetB6 = new Planet(6, Color.RED);
		Planet planetB7 = new Planet(7, Color.BLUE);
		Planet planetB8 = new Planet(8, Color.RED);
		Planet planetB9 = new Planet(9, Color.GREEN);

		planets.add(planetB1);
		planets.add(planetB2);
		planets.add(planetB3);
		planets.add(planetB4);
		planets.add(planetB5);
		planets.add(planetB6);
		planets.add(planetB7);
		planets.add(planetB8);
		planets.add(planetB9);

		return planets;
	}

	public ArrayList<Planet> createGalaxyC(){
		//creating galaxy C
		ArrayList<Planet> planets = new ArrayList<>();
		Planet planetC1 = new Planet(Galaxy.C,1, Color.RED);
		Planet planetC2 = new Planet(Galaxy.C,2, Color.RED);
		Planet planetC3 = new Planet(Galaxy.C,3, Color.BLUE);
		Planet planetC4 = new Planet(Galaxy.C,4, Color.RED);
		Planet planetC5 = new Planet(Galaxy.C,5, Color.GREEN);
		Planet planetC6 = new Planet(Galaxy.C,6, Color.BLUE);
		Planet planetC7 = new Planet(Galaxy.C,7, Color.RED);
		Planet planetC8 = new Planet(Galaxy.C,8, Color.GREEN);
		Planet planetC9 = new Planet(Galaxy.C,9, Color.YELLOW);

		planets.add(planetC1);
		planets.add(planetC2);
		planets.add(planetC3);
		planets.add(planetC4);
		planets.add(planetC5);
		planets.add(planetC6);
		planets.add(planetC7);
		planets.add(planetC8);
		planets.add(planetC9);

		return planets;
	}

	public ArrayList<Planet> createGalaxyD(){
		//creating galaxy D
		ArrayList<Planet> planets = new ArrayList<>();
		Planet planetD1 = new Planet(Galaxy.C,1, Color.BLUE);
		Planet planetD2 = new Planet(Galaxy.C,2, Color.BLUE);
		Planet planetD3 = new Planet(Galaxy.C,3, Color.BLUE);
		Planet planetD4 = new Planet(Galaxy.C,4, Color.BLUE);
		Planet planetD5 = new Planet(Galaxy.C,5, Color.BLUE);
		Planet planetD6 = new Planet(Galaxy.C,6, Color.BLUE);
		Planet planetD7 = new Planet(Galaxy.C,7, Color.RED);
		Planet planetD8 = new Planet(Galaxy.C,8, Color.RED);
		Planet planetD9 = new Planet(Galaxy.C,9, Color.YELLOW);

		planets.add(planetD1);
		planets.add(planetD2);
		planets.add(planetD3);
		planets.add(planetD4);
		planets.add(planetD5);
		planets.add(planetD6);
		planets.add(planetD7);
		planets.add(planetD8);
		planets.add(planetD9);

		return planets;
	}

	public ArrayList<Planet> createGalaxyE(){
		//creating galaxy E
		ArrayList<Planet> planets = new ArrayList<>();
		Planet planetE1 = new Planet(Galaxy.E, 1, Color.GREEN);
		Planet planetE2 = new Planet(Galaxy.E,2, Color.GREEN);
		Planet planetE3 = new Planet(Galaxy.E,3, Color.BLUE);
		Planet planetE4 = new Planet(Galaxy.E,4, Color.RED);
		Planet planetE5 = new Planet(Galaxy.E,5, Color.YELLOW);
		Planet planetE6 = new Planet(Galaxy.E,6, Color.YELLOW);
		Planet planetE7 = new Planet(Galaxy.E,7, Color.GREEN);
		Planet planetE8 = new Planet(Galaxy.E,8, Color.GREEN);
		Planet planetE9 = new Planet(Galaxy.E,9, Color.YELLOW);

		planets.add(planetE1);
		planets.add(planetE2);
		planets.add(planetE3);
		planets.add(planetE4);
		planets.add(planetE5);
		planets.add(planetE6);
		planets.add(planetE7);
		planets.add(planetE8);
		planets.add(planetE9);

		return planets;
	}

	public ArrayList<Planet> createGalaxyF(){
		//creating galaxy F
		ArrayList<Planet> planets = new ArrayList<>();
		Planet planetF1 = new Planet(Galaxy.F,1, Color.BLUE);
		Planet planetF2 = new Planet(Galaxy.F,2, Color.BLUE);
		Planet planetF3 = new Planet(Galaxy.F,3, Color.GREEN);
		Planet planetF4 = new Planet(Galaxy.F,4, Color.RED);
		Planet planetF5 = new Planet(Galaxy.F,5, Color.GREEN);
		Planet planetF6 = new Planet(Galaxy.F,6, Color.GREEN);
		Planet planetF7 = new Planet(Galaxy.F,7, Color.BLUE);
		Planet planetF8 = new Planet(Galaxy.F,8, Color.GREEN);
		Planet planetF9 = new Planet(Galaxy.F,9, Color.GREEN);

		planets.add(planetF1);
		planets.add(planetF2);
		planets.add(planetF3);
		planets.add(planetF4);
		planets.add(planetF5);
		planets.add(planetF6);
		planets.add(planetF7);
		planets.add(planetF8);
		planets.add(planetF9);

		return planets;
	}

	public ArrayList<Planet> createGalaxyG(){
		//creating galaxy G
		ArrayList<Planet> planets = new ArrayList<>();
		Planet planetG1 = new Planet(Galaxy.G, 1, Color.GREEN);
		Planet planetG2 = new Planet(Galaxy.G,2, Color.GREEN);
		Planet planetG3 = new Planet(Galaxy.G,3, Color.GREEN);
		Planet planetG4 = new Planet(Galaxy.G,4, Color.GREEN);
		Planet planetG5 = new Planet(Galaxy.G,5, Color.YELLOW);
		Planet planetG6 = new Planet(Galaxy.G,6, Color.GREEN);
		Planet planetG7 = new Planet(Galaxy.G,7, Color.GREEN);
		Planet planetG8 = new Planet(Galaxy.G,8, Color.YELLOW);
		Planet planetG9 = new Planet(Galaxy.G,9, Color.YELLOW);

		planets.add(planetG1);
		planets.add(planetG2);
		planets.add(planetG3);
		planets.add(planetG4);
		planets.add(planetG5);
		planets.add(planetG6);
		planets.add(planetG7);
		planets.add(planetG8);
		planets.add(planetG9);

		return planets;
	}

	public ArrayList<Planet> createGalaxyH(){
		//creating galaxy H
		ArrayList<Planet> planets = new ArrayList<>();
		Planet planetH1 = new Planet(Galaxy.H, 1, Color.YELLOW);
		Planet planetH2 = new Planet(Galaxy.H,2, Color.YELLOW);
		Planet planetH3 = new Planet(Galaxy.H,3, Color.YELLOW);
		Planet planetH4 = new Planet(Galaxy.H,4, Color.YELLOW);
		Planet planetH5 = new Planet(Galaxy.H,5, Color.GREEN);
		Planet planetH6 = new Planet(Galaxy.H,6, Color.GREEN);
		Planet planetH7 = new Planet(Galaxy.H,7, Color.YELLOW);
		Planet planetH8 = new Planet(Galaxy.H,8, Color.YELLOW);
		Planet planetH9 = new Planet(Galaxy.H,9, Color.BLUE);

		planets.add(planetH1);
		planets.add(planetH2);
		planets.add(planetH3);
		planets.add(planetH4);
		planets.add(planetH5);
		planets.add(planetH6);
		planets.add(planetH7);
		planets.add(planetH8);
		planets.add(planetH9);

		return planets;
	}

	public ArrayList<Planet> createGalaxyK(){
		//creating galaxy K
		ArrayList<Planet> planets = new ArrayList<>();
		Planet planetK1 = new Planet(Galaxy.K,1, Color.YELLOW);
		Planet planetK2 = new Planet(Galaxy.K, 2, Color.RED);
		Planet planetK3 = new Planet(Galaxy.K,3, Color.YELLOW);
		Planet planetK4 = new Planet(Galaxy.K,4, Color.YELLOW);
		Planet planetK5 = new Planet(Galaxy.K,5, Color.GREEN);
		Planet planetK6 = new Planet(Galaxy.K,6, Color.RED);
		Planet planetK7 = new Planet(Galaxy.K,7, Color.YELLOW);
		Planet planetK8 = new Planet(Galaxy.K,8, Color.BLUE);
		Planet planetK9 = new Planet(Galaxy.K,9, Color.RED);

		planets.add(planetK1);
		planets.add(planetK2);
		planets.add(planetK3);
		planets.add(planetK4);
		planets.add(planetK5);
		planets.add(planetK6);
		planets.add(planetK7);
		planets.add(planetK8);
		planets.add(planetK9);

		return planets;
	}

	
}
