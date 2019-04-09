import com.sun.org.apache.xalan.internal.xsltc.dom.NodeSortRecord;

        import java.util.ArrayList;

public abstract class Creature {
    protected Node currentRoom;
    protected static String name;
    protected static String description;

    public abstract void act();

    public void setRoom(Node newRoom) { this.currentRoom = newRoom; }

    public void move(){
        Node newRoom = new Node(name);
        ArrayList<Node> neighbors = currentRoom.getRandomNeighbors();

        currentRoom.removeCreature(this);
        setRoom(newRoom);
        currentRoom.addCreature(this);
    }

    public boolean detectPlayerInNextRoom(){
        // for wumpus and popstar
        return false;
    }

    public Node getCurrentRoom(){ return currentRoom; }

}
