

public class ArraysCC {

    public static void  reverse(int arr[]){
        int first =0, last  = arr.length-1; // Initialize first and last indices for the array
        while(first<last){
            //swap
            int temp = arr[first]; // Store the value at the first index in a temporary variable
            arr[first] = arr[last]; // Assign the value at the last index to the first index
            arr[last] = temp; // Assign the value stored in the temporary variable to the last index
            
            first++;
            last--;

        }
    }
    
    
    // public static int binarySearch(int arr[],int key){
    //     int start = 0 ,end = arr.length-1; // Initialize start and end indices for the search
    //     while(start <= end){
    //         int mid = (start + end) /2;

    //         //comparisons
    //         if(arr[mid] == key){ // If the middle element is equal to the key, return its index
    //             return mid;
    //         }
    //         if(arr[mid] < key){ // If the middle element is less than the key, search in the right half
    //             start = mid + 1;
    //         }
    //         else{ // If the middle element is greater than the key, search in the left half
    //             end = mid - 1;
    //         }
    //     }
    //     return -1; // If the key is not found, return -1
    // }


    // public static int getLargest(int arr[]) {
    //     int largest = Integer.MIN_VALUE; // Initialize largest to the smallest possible integer value
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] > largest) {
    //             largest = arr[i]; // Update largest if current element is greater
    //         }
    //     }
    //     return largest; // Return the largest element found in the array
    // }
    public static void main(String[] args) {
        //<type> arrayName[] = new <type>[size]; // Declaration of an array
        // int marks[] = new int[5]; // Declare an array of integers with size 5
        // int numbers[] = {1, 2, 3, 4, 5}; // Declare and initialize an array with values
        
        // ----------------------------------------------------
        // //to get input from user
        // int marks[] = new int[50];
        // Scanner sc = new Scanner(System.in);

        // marks[0] = sc.nextInt(); //phy
        // marks[1] = sc.nextInt(); //chem
        // marks[2] = sc.nextInt(); //math
        
        // System.out.println("Physics: " + marks[0]);

        //-----------------------------------------------------
        // largest number in an array
        
        // int arr[] = {1, 2, 3, 4, 5};
        // System.err.println("Largest number in the array: " + getLargest(arr)); // Call the method to find the largest number in the array

        //------------------------------------
        //binary search(precondition: array should be sorted)
        // int arr[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}; // Sorted array for binary search
        // int key = 10; // Element to search for
        // System.err.println("index of " + key + " is: " + binarySearch(arr, key)); // Call the binary search method and print the result

        //-----------------------------------

        //reverse an array
        int arr[] ={1,2,3,4,5};

        reverse(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " "); // Print the elements of the reversed array
        }
    }
}
