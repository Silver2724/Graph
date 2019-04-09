
public abstract class Creature {
    protected Node currentRoom;
    protected static String name;
    protected static String description;
    protected static Player player;

    public void act(){
        move();
    }

    public void setRoom(Node newRoom) { this.currentRoom = newRoom; }

    public void move(){
        Node nextRoom = chooseNextRoom();
        if(nextRoom != null) {
            moveToRoom(nextRoom);
        }
    }

    protected boolean moveToRoom(Node newRoom){
        return false;
    }

    protected abstract Node chooseNextRoom();

    public Node getCurrentRoom() { return currentRoom; }

}
