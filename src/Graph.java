import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<Node> nodes;

    public Graph() {
        nodes = new ArrayList<Node>();
    }

    public void addNode(String name) {
    }

    public void addDirectedEdge(String name1, String name2) {
//        Node n1 = /* get node for name 1 */;
//        Node n2 = /* get node for name 2*/;
//        n1.addNeighbor(n2);
    }

    public void addUndirectedEdge(String name1, String name2) {
    }

    public Node getNode(String name) {
        return null;
    }

    public static class Node {
        private String name;
        private ArrayList<Node> neighbors;

    public Node(String name) {
            neighbors = new ArrayList<Node>();
            this.name = name;
        }

        void addNeighbor(Node n) {
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

        public Node getNeighbor(String name) {
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

        public String getName() {
            return name;
        }

        public static void displayCommands() {
        }
    }
}
