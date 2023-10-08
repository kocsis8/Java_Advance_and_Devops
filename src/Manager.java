import model.SimpleSimCard;

import java.util.LinkedList;
import java.util.List;

public class Manager {
    List<SimpleSimCard> simCards = new LinkedList<>();

    public Manager() {}

    public void addSim(SimpleSimCard simpleSimCard){
        simCards.add(simpleSimCard);
    }

    public List<SimpleSimCard> getSimCards() {
        return simCards;
    }
}
