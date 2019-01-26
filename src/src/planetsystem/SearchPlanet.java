package planetsystem;

import misc.Galaxy;

import java.util.ArrayList;
import java.util.Set;

public class SearchPlanet {

    private Universe universe;
    private Planet start;
    private Planet goal;


    public SearchPlanet(Universe universe) {
        this.universe = universe;
        start = universe.getStart();
        goal = universe.getGoal();
    }

    public ArrayList<Planet> startSearching() {
        ArrayList<Planet> solution = dfs(start, new ArrayList<Planet>());
        return solution;
    }


    public ArrayList<Planet> dfs(Planet start, ArrayList<Planet> visited) {
        ArrayList<Planet> solution;
        visited.add(start);
        if (universe.isGoal(start)) {
            solution = new ArrayList<>();
            solution.add(start);
            System.out.println("Start was solution");
            return solution;
        } else {
            ArrayList<Planet> neighbours = universe.getNeighbours(start);
            for (Planet neighbour : neighbours) {
                if (!visited.contains(neighbour)) {
                    solution = dfs(neighbour, visited);
                    if (universe.isGoal(neighbour)) {
                        solution.add(neighbour);
                        return solution;
                    }
                }
            }
            Galaxy[] galaxyNeighbours = start.getGalaxySet();
            for (Galaxy galaxy: galaxyNeighbours) {
                ArrayList<Planet> neighbourGalaxy = universe.getGalaxy(galaxy);
                Planet rTramPlanet = neighbourGalaxy.get(start.getId() -1);
            }
        }

        return new ArrayList<Planet>();
    }
}
