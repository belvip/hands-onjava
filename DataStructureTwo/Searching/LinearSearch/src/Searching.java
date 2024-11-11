public class Searching {

    // Method to perform linear search on an array
    public static int linearSearch(int[] array, int value){

        // Iterate through each element of the array
        for (int i = 0; i < array.length; i++) {

            // If the current element matches the value we're looking for
            if (array[i] == value) {

                // Print the index of the found element
                System.out.println("The element " + value + " is found at index : " + i);

                // Return the index of the found element
                return i;
            }
        }

        // If the value was not found in the array, print a message
        System.out.println("The element " + value + " is not found");

        // Return -1 to indicate that the value was not found
        return -1;
    }

    // Binary Search
    public static int binarySearch(int arr[], int value) {
        int start = 0;
        int end = arr.length - 1;

        // Keep searching as long as start is less than or equal to end
        while (start <= end) {
            int middle = (start + end) / 2;
            System.out.println(start + " " + middle + " " + end);  // Debugging output

            // If the middle element is the one we're looking for
            if (arr[middle] == value) {
                System.out.println("The element " + value + " is found at index: " + middle);  // Print the found message
                return middle;  // Return the index if found
            }

            // Narrow the search range
            if (value < arr[middle]) {
                end = middle - 1;  // Search in the left half
            } else {
                start = middle + 1;  // Search in the right half
            }

            // Update the middle position after narrowing the range
            middle = (start + end) / 2;
            System.out.println(start + " " + middle + " " + end);  // Debugging output
        }

        // Return -1 if the value was not found
        System.out.println("The element " + value + " is not found");
        return -1;
    }


}
