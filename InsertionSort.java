// Insertion sort in Java

import java.util.Arrays;

public class InsertionSort {
    public static int counter = 0;

  void insertionSort(int array[]) {
    int size = array.length;counter++;

    for (int step = 1; step < size; step++) {counter++;
      int key = array[step];counter++;
      int j = step - 1;counter++;

      // Compare key with each element on the left of it until an element smaller than
      // it is found.
      // For descending order, change key<array[j] to key>array[j].
      while (j >= 0 && key < array[j]) {
        array[j + 1] = array[j];counter++;
        --j;counter++;
      }

      // Place key at after the element just smaller than it.
      array[j + 1] = key;counter++;
    }
  }

  // Driver code
  public static void main(String args[]) {
    int[] data = { 9, 5, 1, 4, 3 };counter++;
    InsertionSort is = new InsertionSort();
    is.insertionSort(data);counter++;
    System.out.println("Sorted Array in Ascending Order: ");counter++;
    System.out.println(Arrays.toString(data));counter++;

    System.out.println(counter);
  }
}
