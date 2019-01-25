import misc.Galaxy;
import planetsystem.Planet;
import planetsystem.SearchPlanet;
import planetsystem.Universe;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        SearchPlanet searchPlanet = new SearchPlanet(new Universe());
        ArrayList<Planet> solution = searchPlanet.startSearching();
	}



}
