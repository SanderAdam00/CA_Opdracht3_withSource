package planetsystem;

import misc.Galaxy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

public class SearchPlanet {

    private Universe universe;
    private Planet start;
    private Planet goal;
    private Planet rTramPlanet;


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
        System.out.println("current: " + start.getGalaxy() + start.getId());
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
        }
        if(!universe.isGoal(start)) {
            rTram();
        }
        System.out.println("Checked all galaxies");
        visited.remove(start);
        return new ArrayList<Planet>(); // no solution
    }

    public ArrayList<Planet> rTram() {
        ArrayList<Planet> solution;
        ArrayList<Planet> visited = new ArrayList<>();
        Galaxy[] galaxyNeighbours = start.getGalaxySet();
        for (Galaxy galaxy : galaxyNeighbours) {
            ArrayList<Planet> neighbourGalaxy = universe.getGalaxy(galaxy);
            rTramPlanet = neighbourGalaxy.get(start.getId() - 1);
            if (rTramPlanet.getColor() == start.getColor() || rTramPlanet.getId() == start.getId()) {
                if (universe.isGoal(rTramPlanet)) {
                    solution = new ArrayList<>();
                    solution.add(rTramPlanet);
                    System.out.println("I reached here");
                    return solution;
                } else if (rTramPlanet.getColor() == start.getColor() || rTramPlanet.getId() == start.getId()) {
                    for (int i = 0; i < galaxyNeighbours.length; i++) {
                        if (!visited.contains(galaxy)) {
                            solution = dfs(rTramPlanet, visited);
                        }
                    }
                }
            }
        }
        visited.remove(rTramPlanet);
        return new ArrayList<>();
    }
}
