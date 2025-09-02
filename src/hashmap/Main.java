package hashmap;


import java.util.HashMap;
import java.util.HashSet;

class MapUsingHash {

    private Entity[] entities;

    public MapUsingHash() {
        entities = new Entity[100];
    }

    public void put(String key, String value) {
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value); // overriding
    }

    public String get(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)) {
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)) {
            entities[hash] = null;
        }
    }

    private class Entity {
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}










public class Main{
    public static void main(String[] args) {
//      HashMapFinal<String,String> map=new HashMapFinal<>();
//        map.put("Mango","King Of Fruits");
//        map.put("Apple ","A red Fruits");
//        map.put("Goolo Moolo","My Fruit");
//
//        System.out.println(map);






















//        public static void demo(){
//            String name ="Goolo Moolo";
//            int n=name.hashCode();
//            System.out.println(n);
//
//            HashMap<String ,Integer> map=new HashMap<>();
//            map.put("Mayank",56);
//            map.put("Goolo Moolo",65);
//
//            System.out.println(map.get("Mayank"));
//            System.out.println(map.containsKey("Mayank"));
//
//
//
//
//            HashMap<String, Integer> map1 = new HashMap<>();
//
//            map.put("Kunal", 89);
//            map.put("Karan", 99);
//            map.put("Rahul", 94);
//
//            // System.out.println(map.get("Karan"));
//            // System.out.println(map.getOrDefault("Apoorv", 78));
//            System.out.println(map.containsKey("Karan"));
//
//            HashSet<Integer> set = new HashSet<>();
//            set.add(56);
//            set.add(9);
//            set.add(12);
//            set.add(43);
//            set.add(56);
//            set.add(2);
//
//            System.out.println(set);
//        }

    }
}







