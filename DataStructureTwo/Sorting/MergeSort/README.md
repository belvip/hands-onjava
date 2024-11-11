# Merge Sort Implementation in Java

This Java code demonstrates the **Merge Sort** algorithm, which is a popular sorting technique based on the **Divide and Conquer** approach. It divides the array into halves, recursively sorts them, and then merges the sorted halves.

## Code Breakdown

### 1. `merge` Method

The `merge` method takes an integer array `A` and three indices: `left`, `middle`, and `right`. It merges two sorted subarrays within `A`:
- The subarray `A[left...middle]`
- The subarray `A[middle+1...right]`

#### Parameters
- `A` - The array to be sorted.
- `left` - The starting index of the first half.
- `middle` - The ending index of the first half.
- `right` - The ending index of the second half.

#### Steps
1. **Initialize Temporary Arrays**  
   Two temporary arrays `leftTempArray` and `rightTempArray` hold the elements of the left and right subarrays, respectively.

2. **Copy Elements**  
   The elements from the original array `A` are copied into `leftTempArray` and `rightTempArray`:
   - `leftTempArray` takes the elements from `A[left...middle]`
   - `rightTempArray` takes the elements from `A[middle+1...right]`

3. **Merge Process**  
   The temporary arrays are merged back into `A[left...right]`:
   - Compare elements of `leftTempArray` and `rightTempArray` one by one.
   - Insert the smaller element into `A` and move to the next index.
   
4. **Copy Remaining Elements**  
   After the comparison loop, any remaining elements in `leftTempArray` or `rightTempArray` are copied back into `A`.

```java
static void merge(int[] A, int left, int middle, int right) {
    int[] leftTempArray = new int[middle - left + 1];
    int[] rightTempArray = new int[right - middle];

    for (int i = 0; i < leftTempArray.length; i++) {
        leftTempArray[i] = A[left + i];
    }

    for (int i = 0; i < rightTempArray.length; i++) {
        rightTempArray[i] = A[middle + 1 + i];
    }

    int i = 0, j = 0;
    int k = left;

    while (i < leftTempArray.length && j < rightTempArray.length) {
        if (leftTempArray[i] <= rightTempArray[j]) {
            A[k++] = leftTempArray[i++];
        } else {
            A[k++] = rightTempArray[j++];
        }
    }

    while (i < leftTempArray.length) {
        A[k++] = leftTempArray[i++];
    }

    while (j < rightTempArray.length) {
        A[k++] = rightTempArray[j++];
    }
}
```

## 2. `mergeSort` Method

The `mergeSort` method recursively sorts an array by splitting it into halves, sorting each half, and then merging them.

### Parameters
- **Array** - The array to be sorted.
- **left** - The starting index of the subarray.
- **right** - The ending index of the subarray.

### Steps
1. **Divide**  
   - If `left` is less than `right`, find the midpoint `m`.

2. **Conquer**  
   - Recursively call `mergeSort` on the left and right halves.

3. **Combine**  
   - Use the `merge` method to combine the sorted halves into a sorted subarray.

```java
public static void mergeSort(int[] Array, int left, int right) {
    if (right > left) {
        int m = (left + right) / 2;
        mergeSort(Array, left, m);
        mergeSort(Array, m + 1, right);
        merge(Array, left, m, right);
    }
}
```

## 2. `printArray` Method
The `printArray` method is a utility function to display the elements of the array.

```java
public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
    }
}
```

## Example Usage

To use the `MergeSort` class:

1. **Create an instance of an array**  
   Initialize an array with the elements you want to sort.

2. **Call `mergeSort`**  
   Use `mergeSort` on the array with `left` as `0` and `right` as the last index of the array (i.e., `array.length - 1`).

3. **Display the Sorted Array**  
   Use `printArray` to output the sorted array to the console.

### Example
```java
int array[] = {10, 3, 5, 8, 4, 1, 2, 9, 7, 11};
MergeSort.mergeSort(array, 0, array.length - 1);
MergeSort.printArray(array);
```

