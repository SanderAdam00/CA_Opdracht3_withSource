package planetsystem;

import misc.Galaxy;
import misc.Color;

import java.util.ArrayList;
import java.util.Arrays;

public class Planet implements Comparable<Planet> {

    private Galaxy galaxy;
    private int id;
    private Color color;
    private ArrayList<Planet> planetList = new ArrayList<>();
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
                galaxySet = new Galaxy[]{Galaxy.A, Galaxy.D, Galaxy.K, Galaxy.F};
                break;
            case C:
                galaxySet = new Galaxy[]{Galaxy.A, Galaxy.D, Galaxy.K, Galaxy.F};
                break;
            case D:
                galaxySet = new Galaxy[]{Galaxy.A, Galaxy.D, Galaxy.E, Galaxy.F};
                break;
            case E:
                galaxySet = new Galaxy[]{Galaxy.C, Galaxy.F, Galaxy.G};
                break;
            case F:
                galaxySet = new Galaxy[]{Galaxy.D, Galaxy.E, Galaxy.H, Galaxy.B};
                break;
            case G:
                galaxySet = new Galaxy[]{Galaxy.E, Galaxy.H};
                break;
            case H:
                galaxySet = new Galaxy[]{Galaxy.G, Galaxy.H, Galaxy.K};
                break;
            case K:
                galaxySet = new Galaxy[]{Galaxy.H, Galaxy.B};
                break;
        }
    }

    public void addPlanetSet(Planet[] planet) {
        this.planetList.addAll(Arrays.asList(planet));
    }


    public Galaxy getGalaxy() {
        return galaxy;
    }

    public ArrayList<Planet> getPlanetList() {
            return planetList;
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
