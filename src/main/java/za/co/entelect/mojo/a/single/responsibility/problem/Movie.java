package za.co.entelect.mojo.a.single.responsibility.problem;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private List<Actor> actors;
    private double budget;

    public Movie() {
        actors = new ArrayList<>();
    }

    public void addActor(Actor actor) {
        budget += actor.getSalary();
        actors.add(actor);
    }
}
