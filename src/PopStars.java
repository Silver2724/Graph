import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

public class PopStars extends Creature {
    int lifeForce = 100;

    @Override
    public Node chooseNextRoom() {
        return lookforPlayer();
    }
//    Map<String, Level> findsNeighbors = new HashMap<String, Level>(map.values());

    public static ArrayList<String> findingNeighbor() {
        ArrayList<String> roomNames = new ArrayList<String>();
        for (int i = 0; i < roomNames.size() ; i++) {
            // return room names???
        }

        return roomNames;
    }

    public Node lookforPlayer() {
        return null;
    }

    public void act() {
        super.act();

        if(getCurrentRoom().contains( player )) {
            decreasePlayerLifeForce(lifeForce);
        }
    }

    private String decreasePlayerLifeForce(int lifeForce) {
        int remainingLifeForce = lifeForce - 5;
        String message = "Player has " + remainingLifeForce + " hp left.";
        return message;
    }


}
