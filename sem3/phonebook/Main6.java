package phonebook;

import java.util.List;

public class Main6 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John", "33344");
        phoneBook.add("Peter", "344");
        phoneBook.add("Philipp", "344");
        phoneBook.add("Philipp", "122");
        
        List<String> strings = phoneBook.get("Philipp");
        System.out.println(strings);
        }
}
