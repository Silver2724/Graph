import java.util.ArrayList;
/*
The goal is to be able to have a player:
- Ask what items a room contains
- Pick up an item from the room (in which case it is removed from the room)
- Move to a new room
- Drop their item (in which case it gets added to the room)
- Note: you shouldn’t be able to pick up items that aren’t in your current room.
- Note 2: you shouldn’t be able to drop an item you aren’t carrying
*/


public class Player {
    String name, description;
    ArrayList<Item> items;
    Node currentRoom;
    int playerHP = 100;

    public Player(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void addItem(Item item) {
        // add item
        items.add(item);
    }

    public Item removeRandomItem(String name) {
        // remove item and return it
        Item a = new Item(name, description);
        items.remove(name);
        return a;
    }

    public boolean destroyItem(String name) {
        // remove item without returning it
        if (items.remove(name) == true) { return true; }
        else { return false; }
    }

    public ArrayList<Item> getItems(){
        return items;
    }

    public void displayInventory() {
        // display items you’re carrying
    }

    public Node getCurrentRoom() {
        // return room player is currently in
        Node num = new Node(name);
        num.getNeighborNames();
        return num;
    }

    public void setCurrentRoom() {
        // set player’s current room to a new room
        Node num1 = new Node(name);
        Node currentRoom = new Node(name);
        currentRoom = num1.getNeighbor();
    }

    public boolean moveToRoom(String name) {
        // try and move to neighboring room with given name
        // return true if successful, false otherwise
        return false;
    }
}
