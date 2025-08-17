import java.util.HashMap;
import java.util.Scanner;

public class TextAdventure {
    private AdventureModel model;
    private Adventurer player;

    public TextAdventure() {
        model = new AdventureModel();
        player = new Adventurer("Adventurer", model.getStartingRoom());
    }

    public void startGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Text-Based Adventure Game!");

        while (true) {
            System.out.println(player.getCurrentRoom().getDescription());
            System.out.print("> ");
            String command = sc.nextLine().toLowerCase();

            if (command.equals("exit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            handleCommand(command);
        }

        sc.close();
    }

    private void handleCommand(String command) {
        if (command.startsWith("go ")) {
            String direction = command.substring(3);
            player.move(direction);
        } else if (command.equals("look")) {
            System.out.println(player.getCurrentRoom().getDescription());
        } else if (command.startsWith("take ")) {
            String item = command.substring(5);
            player.takeItem(item);
        } else if (command.startsWith("drop ")) {
            String item = command.substring(5);
            player.dropItem(item);
        } else if (command.startsWith("use ")) {
            String item = command.substring(4);
            player.useItem(item);
        } else {
            System.out.println("Unknown command.");
        }
    }

    // ✅ Added main method to run the game
    public static void main(String[] args) {
        TextAdventure game = new TextAdventure();
        game.startGame();
    }
}

class AdventureModel {
    private HashMap<String, Room> rooms;

    public AdventureModel() {
        rooms = new HashMap<>();
        setupRooms();
    }

    public Room getStartingRoom() {
        return rooms.get("start");
    }

    private void setupRooms() {
        Room start = new Room("You are in a small, dimly lit room. There is a door to the north.");
        Room hall = new Room("You are in a long hallway. There are doors to the east and west.");

        start.setExit("north", hall);
        hall.setExit("south", start);

        // Example: add an item to the start room
        start.addItem("key");

        rooms.put("start", start);
        rooms.put("hall", hall);
    }
}

class Adventurer {
    private String name;
    private Room currentRoom;
    private HashMap<String, String> inventory;

    public Adventurer(String name, Room startingRoom) {
        this.name = name;
        this.currentRoom = startingRoom;
        this.inventory = new HashMap<>();
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void move(String direction) {
        Room nextRoom = currentRoom.getExit(direction);
        if (nextRoom != null) {
            currentRoom = nextRoom;
            System.out.println("You move " + direction + ".");
        } else {
            System.out.println("You can't go that way.");
        }
    }

    public void takeItem(String item) {
        if (currentRoom.hasItem(item)) {
            inventory.put(item, item);
            currentRoom.removeItem(item);
            System.out.println("You take the " + item + ".");
        } else {
            System.out.println("There's no " + item + " here.");
        }
    }

    public void dropItem(String item) {
        if (inventory.containsKey(item)) {
            currentRoom.addItem(item);
            inventory.remove(item);
            System.out.println("You drop the " + item + ".");
        } else {
            System.out.println("You don't have that item.");
        }
    }

    public void useItem(String item) {
        if (inventory.containsKey(item)) {
            System.out.println("You use the " + item + ".");
            // Implement item-specific logic here
        } else {
            System.out.println("You don't have that item.");
        }
    }
}

class Room {
    private String description;
    private HashMap<String, Room> exits;
    private HashMap<String, String> items;

    public Room(String description) {
        this.description = description;
        exits = new HashMap<>();
        items = new HashMap<>();
    }

    public String getDescription() {
        return description;
    }

    public void setExit(String direction, Room neighbor) {
        exits.put(direction, neighbor);
    }

    public Room getExit(String direction) {
        return exits.get(direction);
    }

    public boolean hasItem(String item) {
        return items.containsKey(item);
    }

    public void addItem(String item) {
        items.put(item, item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }
}
