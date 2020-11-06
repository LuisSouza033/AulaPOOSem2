import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {
    public static void main(String[] args){

        Map<String, Integer> people = new HashMap<>();
        people.put("John",32);
        people.put("Steve",30);
        people.put("Angie",33);

        for(String i : people.keySet()){
            System.out.println("Name: " + i + " Age: " + people.get(i));
        }

    }
}
