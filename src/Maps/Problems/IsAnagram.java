/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Maps.Problems;

import java.util.*;

/**
 *
 * @author chris
 */
public class IsAnagram {

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();

        // Count the frequency of characters in string s
        for (char x : s.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        // Decrement the frequency of characters in string t
        for (char x : t.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) - 1);
        }

        // Check if any character has non-zero frequency
        for (int val : count.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(isAnagram("car", "rat"));
        System.out.println(isAnagram("anagram", "namagra"));

    }

}
