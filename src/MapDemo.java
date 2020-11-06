import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args){

        Map<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "Lodon");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities.get("England"));
        System.out.println(capitalCities.size());
        //capitalCities.remove("England");
        //capitalCities.clear();

        System.out.println("------------------------------");
        for (String i : capitalCities.keySet()){
            System.out.println(i);
        }

        System.out.println("------------------------------");
        for (String i : capitalCities.values()){
            System.out.println(i);
        }

        System.out.println("------------------------------");
        for (String i : capitalCities.keySet()){
            System.out.println("Key: " + i + " value: " + capitalCities.get(i));
        }

    }
}

