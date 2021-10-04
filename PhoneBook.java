package homework4;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    public static HashMap<String, String> phoneMap = new HashMap<>();

    public static void main(String[] args) {
        String name;
        String phone;
        homework4.PhoneBook phoneBook = new homework4.PhoneBook();


        ArrayList<String> Names = new ArrayList<String>();
        Names.add("Иванов");
        Names.add("Петров");
        Names.add("Сидоров");
        Names.add("Петухин");
        Names.add("Иванов");
        Names.add("Сидоров");

        phoneMap.put("Иванов", "1234");
        phoneMap.put("Петров", "2345");
        phoneMap.put("Сидоров", "3456");
        phoneMap.put("Петухин", "4567");
        phoneMap.put("Иванов", "5678");
        phoneMap.put("Сидоров", "6789");

        searchName(Names);
        GetSpisok();


    }

    private static void GetSpisok() {
        System.out.println(phoneMap);
    }

    private static void searchName(ArrayList<String> Names) {
        for (String person : Names) {

            if (phoneMap.containsKey(person)) {
                phoneMap.put(person, phoneMap.get(person) + phoneMap.get(person));
                // phoneMap.put(phoneMap.get(i), phoneMap.getOrDefault(phoneMap.get(i),"0")+ phoneMap.get(i));
            } else {
                phoneMap.put(person, phoneMap.get(person));
            }
        }
    }
}



