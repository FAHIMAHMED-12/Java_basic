import java.util.ArrayList;
import java.util.Arrays;

public class ArraytoArraylist {
    public static void main(String[] args) {
        String[] array = {"ball", "boot", "jersey"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println(arrayList);
    }
    
}
