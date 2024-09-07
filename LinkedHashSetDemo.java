package collectionsdemo;

import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
//Create a LinkedHashSet
        LinkedHashSet<String> set =new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        set.add("Elderberry");

        // Display elements of the LinkedHashSet
        System.out.println("Elements in the set: " + set);

        // Try to add a duplicate element
        boolean added = set.add("Apple");
        if (!added) {
            System.out.println("Apple already exists in the set. Duplicates are not allowed.");
        }

        // Remove an element
        boolean removed = set.remove("Date");
        if (removed) {
            System.out.println("Date removed from the set.");
        } else {
            System.out.println("Date not found in the set.");
        }

        // Check if an element exists
        boolean contains = set.contains("Banana");
        if (contains) {
            System.out.println("Banana exists in the set.");
        } else {
            System.out.println("Banana does not exist in the set.");
        }

        // Display the size of the LinkedHashSet
        System.out.println("Size of the set: " + set.size());

        // Iterate over the elements using an iterator
        System.out.println("Iterating over the set:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Clear the LinkedHashSet
        set.clear();
        System.out.println("All elements removed from the set.");

        // Check if the set is empty
        if (set.isEmpty()) {
            System.out.println("The set is empty.");
        }
    }
}
