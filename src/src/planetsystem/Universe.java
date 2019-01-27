package planetsystem;

import misc.CreateUniverse;
import misc.Galaxy;

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

        /**
         * Een goal en start die gehardcode zijn. Deze hebben we regelmatig veranderd om te testen.
         */
        start = GalaxyG.get(0); // hardcoded start
        goal = GalaxyG.get(1); // hardcoded goal
    }

    public boolean isGoal(Planet position) {
        return position == goal;
    }

    public Planet getStart() {
        return start;
    }

    public ArrayList<Planet> getGalaxy(Galaxy galaxy) {
        switch (galaxy) {
            case A:
                return GalaxyA;
            case B:
                return GalaxyB;
            case C:
                return GalaxyC;
            case D:
                return GalaxyD;
            case E:
                return GalaxyE;
            case F:
                return GalaxyF;
            case G:
                return GalaxyG;
            case H:
                return GalaxyH;
            case K:
                return GalaxyK;
            default:
                return null;
        }
    }


}
