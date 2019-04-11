import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Graph g = new Graph();
        g.addNode("hall");
        g.addNode("closet");
        g.addNode("dungeon");

        g.addDirectedEdge("hall", "dungeon");
        g.addUndirectedEdge("hall", "closet");

        Graph.Node root = new Graph.Node("hall");

        root.addNeighbor(new Graph.Node("closet"));
        root.addNeighbor(new Graph.Node("bedroom"));
        root.addNeighbor(new Graph.Node("ladder"));
        root.addNeighbor(new Graph.Node("dungeon"));
        root.addNeighbor(new Graph.Node("hidden room"));

        root.getNeighbor("closet").addNeighbor(new Graph.Node("hall"));
        root.getNeighbor("bedroom").addNeighbor(new Graph.Node("ladder"));
        root.getNeighbor("ladder").addNeighbor(new Graph.Node("dungeon"));
        root.getNeighbor("ladder").addNeighbor(new Graph.Node("hidden room"));
        root.getNeighbor("hidden room").addNeighbor(new Graph.Node("hall"));

        // "game loop" where I get the user input and move the player
        Graph.Node currentRoom = root;

        String response = "";
        Scanner in = new Scanner(System.in);

        do {
            // display room and the exits
            System.out.println("You are currently in the " + currentRoom.getName());
            System.out.println("You can go to the: " + currentRoom.getNeighborNames());
            // ask player what they want to do
            System.out.println("Press any letter (only one letter) if you want to see what commands you can do.");
            System.out.println("Type the name of the room you want to go to: ");
            System.out.println("What do you want to do?");
            response = in.nextLine();
            // do that
            String[] words = response.split(" ");
            String firstWord = words[0];

            if(firstWord.equals("go")) {
                /* they typed go "<roomname>", go to the room*/
            } else if(firstWord.equals("look")) {
                currentRoom.getNeighborNames();
                System.out.println(currentRoom.getNeighborNames());
            } else if(firstWord.equals("add")) {
                root.addNeighbor(new Graph.Node(response));
            } else if(firstWord.equals("quit")) {
                return;
            } else {
                Graph.Node.displayCommands();
            }

            Graph.Node nextRoom = currentRoom.getNeighbor(response);
            if(nextRoom == null) {
                System.out.println("You can't go to " + response + ". Try again.");
            } else {
                currentRoom = nextRoom;
            }

        } while(!response.equals("quit"));

    }
/*
In Main: Make changes to use the new classes & methods.

To support player movement:
- Remove the currentNode variable, and instead create a Player object.
- Modify the “go” command to use your player’s methods to move them.
- Modify the “look” command so that it displays/returns the list of Items in the room.

To support taking and dropping items:
- Add a new command “take <itemname>” which will remove an item from the room and add it to the
player. It should display appropriate messages.
- Add a new command “drop <itemname>” which will remove an item from the player and add it to the
room. It should display appropriate messages.
- Of course, it should not be possible to trigger a null pointer exception; nor should any objects
mysteriously cease to exist or spontaneously spring into existence.
*/

}

