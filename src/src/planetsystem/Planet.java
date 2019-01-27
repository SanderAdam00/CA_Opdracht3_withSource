package planetsystem;

import misc.Galaxy;
import misc.Color;
import java.util.ArrayList;
import java.util.Arrays;

public class Planet {

    private Galaxy galaxy;
    private int id;
    private Color color;
    private ArrayList<Planet> planetList = new ArrayList<>(); // neighbouring planets in the same galaxy
    private Galaxy[] galaxyList; // other galaxies that are neighbours

    public Planet(Galaxy galaxy, int id, Color color) {
        this.galaxy = galaxy;
        this.id = id;
        this.color = color;
        addGalaxyNeighbours(galaxy);
    }

    /**
     *In deze functie worden de galaxyNeighbours toegevoegd. In het geval van A, zijn galaxies B, C en D de buren.
     */
    public void addGalaxyNeighbours(Galaxy galaxy) {
        switch (galaxy) {
            case A:
                galaxyList = new Galaxy[]{Galaxy.B, Galaxy.C, Galaxy.D};
                break;
            case B:
                galaxyList = new Galaxy[]{Galaxy.A, Galaxy.D, Galaxy.F, Galaxy.K};
                break;
            case C:
                galaxyList = new Galaxy[]{Galaxy.A, Galaxy.D, Galaxy.E};
                break;
            case D:
                galaxyList = new Galaxy[]{Galaxy.A, Galaxy.B, Galaxy.C, Galaxy.F};
                break;
            case E:
                galaxyList = new Galaxy[]{Galaxy.C, Galaxy.F, Galaxy.G};
                break;
            case F:
                galaxyList = new Galaxy[]{Galaxy.B, Galaxy.D, Galaxy.E, Galaxy.H};
                break;
            case G:
                galaxyList = new Galaxy[]{Galaxy.E, Galaxy.H};
                break;
            case H:
                galaxyList = new Galaxy[]{Galaxy.F, Galaxy.G, Galaxy.K};
                break;
            case K:
                galaxyList = new Galaxy[]{Galaxy.B, Galaxy.H};
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

    public Galaxy[] getGalaxyList() {
        return galaxyList;
    }

    public int getId() {
        return id;
    }

    public Color getColor() {
        return color;
    }

}
