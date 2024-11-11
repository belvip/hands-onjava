# BucketSort Code Explanation

## Overview

The provided Java code implements the **Bucket Sort** algorithm, which is a sorting algorithm designed to sort a list of numbers by distributing the elements into several "buckets". Each bucket is then sorted individually (using another sorting algorithm), and the final sorted array is obtained by concatenating the sorted buckets.

## Code Breakdown

### 1. **Class Definition**

```java
public class BucketSort {
    int arr[];
}
```

## The class `BucketSort`

The class `BucketSort` defines an array `arr[]` that will store the elements to be sorted.

### 2. Constructor

The constructor of the `BucketSort` class is used to initialize the array `arr[]` with the values that need to be sorted.

```java
public BucketSort(int arr[]) {
    this.arr = arr;
}
```

- * The constructor takes an array of integers as an input parameter and initializes the class's `arr` field with it.

3. **Printing the Array**  
   The method `printArray()`  is a helper method to print the elements of the array `arr[]`. It loops through the array and prints each element.

```java
public void printArray() {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}
```

4. **Printing the Buckets**  

```java
public void printBucket(ArrayList<Integer>[] buckets) {
    for (int i = 0; i < buckets.length; i++) {
        System.out.println("\nBucket#" + i + ":");
        for (int j = 0; j < buckets[i].size(); j++) {
            System.out.print(buckets[i].get(j) + " ");
        }
    }
}
```

- * The `printBucket()` method takes an array of `ArrayList<Integer>[]` representing the buckets and prints the contents of each bucket.  
- * Each bucket is an `ArrayList` containing the elements that are placed in that bucket.

5. **Bucket Sorting** 
## bucketSort() Method
**`bucketSort()`** is the main sorting method.

```java
public void bucketSort() {
    int numberOfBuckets = (int) Math.ceil(Math.sqrt(arr.length));
    int maxValue = Integer.MIN_VALUE;
    for (int value : arr) {
        if (value > maxValue) {
            maxValue = value;
        }
    }
}
```

1. **Calculate the number of buckets**:  
   It first calculates the number of buckets, which is the square root of the array length, rounded up using `Math.ceil()`.

2. **Find the maximum value**:  
   Then, it finds the maximum value in the array, which will be used to determine the range of values that go into each bucket.
- 
```java
    ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
    for (int i = 0; i < buckets.length; i++) {
        buckets[i] = new ArrayList<Integer>();
    }
```
- * An array `buckets[]` of `ArrayList` objects is created to hold the elements in different buckets.  
- * Each bucket is initialized as a new `ArrayList<Integer>`.

```java
    for (int value : arr) {
        int bucketNumber = (int) Math.ceil(((float)value * numberOfBuckets) / (float)maxValue);
        buckets[bucketNumber - 1].add(value);
    }
```

- * For each element in the input array `arr[]`, the method calculates the bucket number using the formula:
- * This places the element into the correct bucket based on its value.

```java
    System.out.println("\n\nPrinting buckets before sorting...");
    printBucket(buckets);
```
- * The contents of the buckets are printed before sorting.

```java
    for (ArrayList<Integer> bucket : buckets) {
        Collections.sort(bucket);
    }
```

- * Each bucket is sorted individually using Collections.sort(), which sorts the elements in ascending order within the bucket.

```java
    System.out.println("\n\nPrinting buckets after sorting...");
    printBucket(buckets);
```

- * The contents of the buckets are printed again, but now after sorting the elements inside each bucket.

```java
    System.out.println("\nArray sorted : ");
    int index = 0;
    for (ArrayList<Integer> bucket : buckets) {
        for (int value : bucket) {
            arr[index] = value;
            index++;
        }
    }
```

- * The final sorted array is obtained by concatenating the sorted buckets. Each element from the sorted buckets is placed back into the original array `arr[]`.
- * The index variable keeps track of the position in the array as elements are added.

## Summary

- **Bucket Count**: The number of buckets is calculated as the square root of the array length.
- **Bucket Assignment**: Each element is assigned to a bucket based on its value.
- **Sorting Buckets**: Each bucket is sorted individually using `Collections.sort()`.
- **Concatenating Buckets**: The sorted elements are merged back into the original array.

This algorithm is efficient for sorting when the input is uniformly distributed over a range, and it works well with a large number of elements.
