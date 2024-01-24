// Bucket sort in Java

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    public static int counter = 0; // counter

    public void bucketSort(float[] arr, int n) {
        if (n <= 0)
            return;counter++;
        @SuppressWarnings("unchecked")
        ArrayList<Float>[] bucket = new ArrayList[n];counter++;

        // Create empty buckets
        for (int i = 0; i < n; i++) {
            bucket[i] = new ArrayList<Float>();counter++;
        }

        // Add elements into the buckets
        for (int i = 0; i < n; i++) {counter++;
            int bucketIndex = (int) (arr[i] * n);counter++;
            bucket[bucketIndex].add(arr[i]);counter++;
        }

        // Sort the elements of each bucket
        for (int i = 0; i < n; i++) {counter++;
            Collections.sort(bucket[i]);counter++;
        }

        // Get the sorted array
        int index = 0;
        for (int i = 0; i < n; i++) {counter++;
            for (int j = 0, size = bucket[i].size(); j < size; j++) {
                arr[index++] = bucket[i].get(j);counter++;
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        BucketSort b = new BucketSort();counter++;
        float[] arr = { (float) 0.42, (float) 0.32, (float) 0.33, (float) 0.52, (float) 0.37, (float) 0.47,
                (float) 0.51 };counter++;
        b.bucketSort(arr, 7);counter++;

        for (float i : arr)
            System.out.print(i + "  ");counter++;

        System.out.println(counter);
    }
}

