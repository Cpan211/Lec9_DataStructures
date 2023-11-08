/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QueueExample;
import java.util.*;
/**
 *
 * @author chris
 */
public class QueueExample {

  public static void main(String[] args) {
        // Creating a Queue
        Queue<String> queue = new LinkedList<>();

        // Adding fruits to the Queue using offer()
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Orange");

        // Displaying the Queue
        System.out.println("Queue: " + queue);

        // Peeking the first fruit without removing it using peek()
        String peekedFruit = queue.peek();
        System.out.println("Peeked Fruit: " + peekedFruit);

        // Removing and retrieving the first fruit using poll()
        String removedFruit = queue.poll();
        System.out.println("Removed Fruit: " + removedFruit);

        // Displaying the updated Queue
        System.out.println("Updated Queue: " + queue);
    }
}
