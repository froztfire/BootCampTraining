package Practice;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("Jerome"), new Diamond("Jhaz"));

    }

    private static void maps() {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Jerome"));
        map.put(2, new Person("Jhaz"));
        map.put(3, new Person("Sancho"));
        map.put(4, new Person("Jeidy"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        map.remove(4);

        map.entrySet().
                forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

        map.forEach((key, person) -> {
            System.out.println(key + " - " + person);
        });

        System.out.println(map.values());
    }

    record Person(String Name){}

    record Diamond(String name){}
}
