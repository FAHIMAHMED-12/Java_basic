import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
 
    // Adding elements to the ArrayList
    list.add("Messi");
    list.add("Ronaldo");
    list.add("Neymar");
    list.add("Mbappe");
    list.add("Haland");
    
 
    // Printing the ArrayList
    System.out.println("ArrayList: " + list);
 
    // Adding elements at a specific index
    list.add(2, "Rashford");
    list.add(4, "Kane");
 
    // Printing the ArrayList after adding element
    System.out.println("ArrayList after adding an element: " + list);
 
    // Removing element
    list.remove("Ronaldo");
    list.remove("Mbappe");
 
    // Printing the ArrayList after removing an element
    System.out.println("ArrayList after removing element: " + list);
 
    // Accessing an element by index
    String Player = list.get(1);
    System.out.println("Second element: " + Player);
 
    // Finding the size of the ArrayList
    int size = list.size();
    System.out.println("Size of ArrayList: " + size);

    // Finding the size of the ArrayList alternate way
    System.out.println("Size of ArrayList: " + list.size());


}



}
