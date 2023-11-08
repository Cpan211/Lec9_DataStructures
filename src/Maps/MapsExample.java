/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template


 */
package Maps;

import java.util.*;

/**
 *
 * @author chris
 */
public class MapsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating a map 
        Map<String, Integer> m = new HashMap<>();

        // Inserting a new key-value pair 
        m.put("apple", 100);
        m.put("banana", 200);
        m.put("cherry", 300);

        // Retrieving the value associated with a key 
        int value = m.get("banana");
        System.out.println("Value for key 'banana': " + value);

        // Updating the value associated with a key 
        m.put("banana", 250);

        value = m.get("banana");
        System.out.println("Updated value for key 'banana': " + value);

        // Removing a key-value pair 
        m.remove("cherry");

        //Iterating using KeySet()
        for (String key : m.keySet()) {
            int v = m.get(key);
            System.out.println("Key: " + key + ", Value: " + v);
        }
        
        // Iterating over the key-value pairs in the map 
        System.out.println("Key-value pairs in the map:");
        for (Map.Entry<String, Integer> pair : m.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
        
        // Iterating using Iterator
        Iterator<String> iterator = m.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
                int v = m.get(key);
            System.out.println("Key: " + key + ", Value: " + v);
        }
    }

}
