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

    public Node lookforPlayer() {
        Node playersRoom = getCurrentRoom().getNeighbor();
        if(playersRoom.contains(player)){
            return playersRoom;
        }
        return null;
    }

    public Node findingNewNeighbor(Node playersroom) {
        ArrayList<String> roomNames = new ArrayList<String>();
        for (int i = 0; i < roomNames.size(); i++) {
            neighboringRoomToPlayer(playersroom);
        }
        return neighboringRoomToPlayer(playersroom);
    }

    public Node neighboringRoomToPlayer(Node playersRoom ){

        Node roomNextToPlayer = playersRoom.getNeighbor();
        return roomNextToPlayer;
    }

    public void act() {
        super.act();

        if(getCurrentRoom().contains( player )) {
            decreasePlayerLifeForce(lifeForce);
        }

        // update popstar's room to neighboring room to player's
        Node PopStarsRoom = neighboringRoomToPlayer(lookforPlayer());
    }

    private String decreasePlayerLifeForce(int lifeForce) {
        int remainingLifeForce = lifeForce - 5;
        String message = "Player has " + remainingLifeForce + " hp left.";
        return message;
    }
}
