import java.util.ArrayList;

public class Chicken extends Creature {

    public static Node next;

   @Override
    public void act() {
        // doesn't act
    }

    @Override
    public void move() {
        // randomly moves to a room
        ArrayList<Node> neighbors = currentRoom.getRandomNeighbors();

        System.out.println("The chickens are currently in the " + neighbors + " room.");

        currentRoom.removeCreature(this);
        setRoom(next);
        currentRoom.addCreature(this);
    }

    @Override
    public boolean detectPlayerInNextRoom() { return false; }

    @Override
    public Node getCurrentRoom() { return currentRoom; }

    public ArrayList<Creature> getCreatures() { return getCreatures(); }

    public Creature removeCreature() { return removeCreature(); }

    public void addCreature(String name) { addCreature(name); }

    public void addCreature(Creature c){ addCreature(c); }

    public ArrayList<Creature> creatures() {
        return creatures();
    }
}
