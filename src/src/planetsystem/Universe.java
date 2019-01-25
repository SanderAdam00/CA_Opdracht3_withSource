package planetsystem;

import misc.CreateUniverse;
import misc.Galaxy;

import java.util.ArrayList;
import java.util.Set;

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

        goal = GalaxyA.get(2); // hardcoded goal
        start = GalaxyH.get(5); // hardcoded start
    }


    public boolean isGoal (Planet position){
        return position == goal;
    }

    public Set<Planet> getNeighboars(Planet planet){
        return planet.getPlanetSet();
    }

    public enum A_Neighbours{

    }

    public enum B_Neighbours{
        A, D, K, F
    }

    public enum C_Neighbours{
        A, D, E
    }

    public enum D_Neighbours{
        A, B, C, F
    }

    public enum E_Neighbours{
        C, F, G
    }

    public enum F_Neighbours{
        B, D, E, H
    }

    public enum G_Neighbours{
        E, H
    }

    public enum H_Neighbours{
        F, G, K
    }

    public enum K_Neighbours{
        B, H

    public Planet getGoal() {
        return goal;
    }

    public Planet getStart() {
        return start;
    }


}
