package phonebook;

import java.util.*;

public class PhoneBook {

    private Map<String, List<String>> map = new HashMap<>();

    public void add(String name, String number) {
        List<String> numbers = (map.containsKey(name)) ? map.get(name) : new ArrayList<>();
        numbers.add(number);
        map.put(name, numbers);
    }

    public List<String> get(String name) {
        return map.get(name);
    }

}
