import java.util.ArrayList;

public class Node {
    private String name;
    private ArrayList<Node> neighbors;
    ArrayList<Item> items;  // return items room contains
    private ArrayList<Creature> creatures;
    private ArrayList<String> creatureName;

    public void removeCreature(Creature c) { creatures.remove(c); }

    public void addCreature(Creature c) { creatures.add(c); }

    public void addCreature(String name){ creatureName.add(name); }

    public ArrayList<Creature> getCreatures(){ return creatures; }

    public ArrayList<String> getCreatureName(){ return creatureName; }

    public ArrayList<Creature> creatures(){
        creatures = new ArrayList<Creature>();
        return creatures;
    }

    public Node(String name) {
        neighbors = new ArrayList<Node>();
        this.name = name;
    }

    public void addNeighbor(Node n) {
        // add this node as neighbor
        neighbors.add(n);
    }

    public String getNeighborNames() {
        // returns a String of the names of all the neighbors in this node
        String names = "";
        for (Node n: neighbors ) {
            names += n.getName() + " ";
        }
        return names;
    }

    public Node getNeighbor() {
//        Node bed = hallVar.getNeighbor(bedroom);
        // returns neighbor whose name is name, return null otherwise
        // name name of neighboring node to return
        // returns neighboring node with correct name
        for (Node n: neighbors) {
            if(n.getName().equals(name)) {
                return n;
            }
        }
        return null;
    }

    public ArrayList<Node> getRandomNeighbors() {
        ArrayList<Node> neighbors = new ArrayList<Node>();
        Node newRoom = neighbors.get((int)(Math.random()*neighbors.size()));
        neighbors.add(newRoom);
        return neighbors;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Item> getItems(){
        //return items room contains
        return null;
    }

    public String displayItems() {
        // return String for display with all item names
        return "";
    }

    public void addItem(String name){
        // create a new item in the room
    }

    public void addItem(String name, String desc){
        // create a new item in the room
    }

    public void addItem(Item item){
        // add item to the room
    }

    public Item removeItem(String name){
        // remove item with name from the room and return it
        return null;
    }

    public boolean destroyItem(String name){
        // remove item without returning. True if successful.
        return false;
    }

    public boolean contains(Player player) {
        if(getNeighbor().contains(player)) return true;
        return false;
    }

}
