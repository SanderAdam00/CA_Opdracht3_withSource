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

    /**
     * In deze constructor definiëren we de universe, maar ook wat de startingpoint en de finishingpoint moet zijn.
     */
    public SearchPlanet(Universe universe) {
        this.universe = universe;
        starting_point = universe.getStart();
        finish_point = universe.getGoal();
    }

    /**
     * Als de startingPoint en de finisingPoint zijn gedefinieerd, dan kunnen we beginnen met zoeken. startSearching() wordt
     * dan aangeroepen en in startSearching() staat een if-statement, als er geen solution gevonden wordt, dan print hij dat uit
     * en stopt het programma, om eem mogelijke cycle te voorkomen.
     */
    public LinkedList<Planet> startSearching() {
        LinkedList<Planet> solution = dfs(starting_point, new ArrayList<Planet>());
        if (solution.isEmpty()){
            System.out.println("No solution was found");
        }
        return solution;
    }

    /**
     * De dfs methode is waar het zoekwerk gebeurt. In de eerste instantie kijken we of start niet bij toeval als goal
     * is opgegeven. Als dit zo is, wordt er weergegeven dat de oplossing is gevonden en sluit het programma zich af.
     * Als start niet de goal is, dan kijken we verder. We kijken eerst of de directe buren (als de planeet deze heeft)
     * de goal kan zijn. Is dit niet het geval, dan moet in deze puzzel het principe rTram toegepast worden. Het kan ook
     * zijn dat het programma helamaal geen solution vindt, als dit het geval is, dan wordt er een lege array gereturned
     * en wordt het programma afgesloten.
     */
    public LinkedList<Planet> dfs(Planet start, ArrayList<Planet> visited) {
        LinkedList<Planet> solution;
        visited.add(start);
        System.out.println("current: " + start.getGalaxy() + start.getId());
        if (universe.isGoal(start)) {
            solution = new LinkedList<>();
            solution.add(start);
            System.out.println("We found the solution");
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
        return new LinkedList<>(); // no solution
    }

    /**
     * getAllNeighbours is de functie die kijkt wat de naaste planeetburen en wat de naaste buur galaxies zijn. Als een
     * planeet geen naaste buren heeft en wel via het prinicpe rTram naar een andere galaxy kan, dan gebeurt dat via
     * deze functie. Er wordt een Galaxy[] aangemaakt en er de galaxySet wordt daarvoor aangeroepen om de array op te
     * vullen met de juiste buren. Daarna gaat hij door de foreach loop en pakt hij een ArrayList en vult het op met de
     * galaxies, waarna bij rTramPlanet van galaxy naar galaxy wordt "gesprongen" door te kijken naar de directe
     * neighbourGalaxy van de planet waarvan ge-rTrammed wordt. Er moet natuurlijk ook gekeken worden of er überhaupt
     * ge-rTrammed kan worden, sinds blauw niet naar groen kan en vice versa. Dat wordt gedaan in de ifstatement
     * onder de check van de naaste neighbourGalaxy. Daar wordt de kleur met elkaar vergeleken en als er ge-rTrammed
     * kan worden, dan wordt het toegevoegd aan allNeighbours. De lijst die de galaxyburen bijhoudt.
     */
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
}
