package planetsystem;

import misc.CreateUniverse;

import java.util.ArrayList;

public class Universe {


    private ArrayList<Planet> GalaxyA;
    private ArrayList<Planet> GalaxyB;
    private ArrayList<Planet> GalaxyC;
    private ArrayList<Planet> GalaxyD;
    private ArrayList<Planet> GalaxyE;
    private ArrayList<Planet> GalaxyF;
    private ArrayList<Planet> GalaxyG;
    private ArrayList<Planet> GalaxyH;
    private ArrayList<Planet> GalaxyK;


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
    }
}
