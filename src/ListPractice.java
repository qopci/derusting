import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    List<String> myList = new ArrayList<>();
    // Add 3 elements to the list (OK to do one-by-one)
    myList.add("Apple");
    myList.add("Cherry");
    myList.add("Banana");
    // Print the element at index 1
    System.out.println("Element at index 1: " + myList.get(1));
    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    myList.set(1, "Strawberry");
    System.out.println("Size of the List after the first insertion: " + myList.size());
    // Insert a new element at index 0 (the length of the list will change)
    myList.set(0, "Kiwi");
    System.out.println("Size of the List after the second insertion: " + myList.size());
    // Check whether the list contains a certain string
    System.out.println(myList.contains("Apple"));
    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for (int i = 0; i < myList.size(); i++) {
      System.out.println("Index " + i + ": " + myList.get(i));
    }
    // Sort the list using the Collections library
    Collections.sort(myList);
    System.out.println("Sorted List: " + myList);
    // Iterate over the list using a for-each loop
    // Print each value on a second line
    for (String fruit : myList) {
      System.out.println(fruit);
    }
    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}