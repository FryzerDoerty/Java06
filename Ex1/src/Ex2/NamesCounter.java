package Ex2;

import java.util.HashMap;

public class NamesCounter {
    private HashMap<String, Integer> names = new HashMap<>();

    // Метод для добавления имени в HashMap
    public void addName(String name) {
        // Введите свое решение ниже
        if (names.containsKey(name)){
            int a = names.get(name);
            a+=1;
            names.put(name, a);
        } else {
            names.put(name, 1);
        }
    }

    // Метод для вывода содержимого HashMap
    public void showNamesOccurrences() {
        // Введите свое решение ниже
        System.out.println(names);
    }
}
