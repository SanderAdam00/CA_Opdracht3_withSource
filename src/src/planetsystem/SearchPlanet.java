package planetsystem;

import misc.Galaxy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;

public class SearchPlanet {

    private Universe universe;
    private Planet starting_point;
    private Planet finish_point;
    private Planet rTramPlanet;


    public SearchPlanet(Universe universe) {
        this.universe = universe;
        starting_point = universe.getStart();
        finish_point = universe.getGoal();
    }

    public LinkedList<Planet> startSearching() {
        LinkedList<Planet> solution = dfs(starting_point, new ArrayList<Planet>());
        if (solution.isEmpty()){
            System.out.println("No solution was found");
        }
        return solution;
    }


    public LinkedList<Planet> dfs(Planet start, ArrayList<Planet> visited) {
        LinkedList<Planet> solution;
        visited.add(start);
        System.out.println("current: " + start.getGalaxy() + start.getId());
        if (universe.isGoal(start)) {
            solution = new LinkedList<>();
            solution.add(start);
            System.out.println("Start was solution");
            return solution;
        } else {
            ArrayList<Planet> neighbours = getAllNeighbours(start);
            for (Planet neighbour : neighbours) {
                if (!visited.contains(neighbour)) {
                    solution = dfs(neighbour, visited);
                    if (!solution.isEmpty()) {
                        solution.addFirst(start);
                        return solution;
                    }
                }
            }
        }
   /*     if(!universe.isGoal(start)) {
            rTram();
        }
        System.out.println("Checked all galaxies");*/
        //visited.remove(start);
        return new LinkedList<>(); // no solution
    }

    public ArrayList<Planet> getAllNeighbours(Planet currentPlanet) {
        ArrayList<Planet> allNeighbours = new ArrayList<>();
        allNeighbours.addAll(currentPlanet.getPlanetList());

        Galaxy[] galaxyNeighbours = currentPlanet.getGalaxySet();
        for (Galaxy galaxy : galaxyNeighbours) {
            ArrayList<Planet> neighbourGalaxy = universe.getGalaxy(galaxy);
            rTramPlanet = neighbourGalaxy.get(currentPlanet.getId() - 1);
            if (rTramPlanet.getColor() == currentPlanet.getColor())
                allNeighbours.add(rTramPlanet);
        }
        return allNeighbours;
    }

    /*public ArrayList<Planet> rTram() {
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
    }*/
}
