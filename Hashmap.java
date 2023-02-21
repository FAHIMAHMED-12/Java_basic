import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        // Create a new HashMap with String keys and Integer values
        HashMap<String, Integer> map = new HashMap<>();

        // Add some key-value pairs to the HashMap
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Access the values stored in the HashMap
        int aliceAge = map.get("Alice");
        int bobAge = map.get("Bob");
        int charlieAge = map.get("Charlie");

        // Print the values
        System.out.println("Alice's age is " + aliceAge);
        System.out.println("Bob's age is " + bobAge);
        System.out.println("Charlie's age is " + charlieAge);
    }
}
