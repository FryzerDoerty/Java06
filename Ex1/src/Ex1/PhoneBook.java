package Ex1;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class PhoneBook {
    public static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {

// Введите свое решение ниже
        ArrayList<Integer> array = new ArrayList<>();
        if(!phoneBook.containsKey(name)){

             phoneBook.put(name, new ArrayList<>());
             phoneBook.get(name).add(phoneNum);
            }  else {

            if(!phoneBook.containsValue(array)){
                phoneBook.get(name).add(phoneNum);
            }
        }



    }

    public ArrayList<Integer> find(String name) {
// Введите свое решение ниже
        ArrayList<Integer> null_ar = new ArrayList<>();
        if (phoneBook.containsKey(name)) {
            null_ar = phoneBook.get(name);
            return  null_ar;
        } else {
            return null_ar;
        }

    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
// Введите свое решение ниже
        return phoneBook;

   }
}
