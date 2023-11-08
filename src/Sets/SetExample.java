package Sets;
import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author chris
 */
public class SetExample {
    public static void main(String[] args) {
        // HashSet Example
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(8);
        hashSet.add(1);
        
        System.out.println("HashSet: " + hashSet);

        // TreeSet Example
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        
        
        
        System.out.println("TreeSet: " + treeSet);
    }
}
