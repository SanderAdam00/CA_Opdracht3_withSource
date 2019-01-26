package planetsystem;

import misc.CreateUniverse;

import java.util.ArrayList;

public class Universe {
    // all 9 galaxies
    private ArrayList<Planet> GalaxyA;
    private ArrayList<Planet> GalaxyB;
    private ArrayList<Planet> GalaxyC;
    private ArrayList<Planet> GalaxyD;
    private ArrayList<Planet> GalaxyE;
    private ArrayList<Planet> GalaxyF;
    private ArrayList<Planet> GalaxyG;
    private ArrayList<Planet> GalaxyH;
    private ArrayList<Planet> GalaxyK;

    private Planet planet;
    private Planet goal;
    private Planet start;


    public Universe() {
        CreateUniverse universe = new CreateUniverse();
        GalaxyA = universe.createGalaxyA();
        GalaxyB = universe.createGalaxyB();
        GalaxyC = universe.createGalaxyC();
        GalaxyD = universe.createGalaxyD();
        GalaxyE = universe.createGalaxyE();
        GalaxyF = universe.createGalaxyF();
        GalaxyG = universe.createGalaxyG();
        GalaxyH = universe.createGalaxyH();
        GalaxyK = universe.createGalaxyK();

        goal = GalaxyA.get(7); // hardcoded goal
        start = GalaxyA.get(8); // hardcoded start
    }


    public boolean isGoal (Planet position){
        return position == goal;
    }

    public Planet getGoal() {
        return goal;
    }

    public Planet getStart() {
        return start;
    }

    public ArrayList<Planet> getNeighbours(Planet planet){
        return planet.getPlanetList();
    }

}
