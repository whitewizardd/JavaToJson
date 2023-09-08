package map;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        java.util.Map<String, Integer> map = new HashMap<>();
//        java.util.Map<String, Integer> dictionary = new HashMap<>(map);
        java.util.Map<String, Integer> dictionary = new HashMap<>();
        map.put("Asiwaju", 200);
        map.put("Atiku", 2000);
        map.put("Obi", 1000);
        map.put("Obi", 4000);//just like the set, doesn't allow duplicate key
        System.out.println(map);
//        System.out.println(map.size());
//        System.out.println(map.entrySet());
//        dictionary.putAll(map);
//        System.out.println(dictionary);
        map.remove("Asiwaju");
        System.out.println(map);
    }
}
