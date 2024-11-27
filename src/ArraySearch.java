import java.util.Arrays;

public class ArraySearch {

    /**
     *Linear Search
     * Sequentially search for an element.
     */
    public void useLinearSearch(){
        int [] numbers = {7, 8, 9, 8,11,12};
        int target = 8;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == target){
                System.out.println("Number found: " + " at index " + i +  " " + numbers[i]);
            }else{
                System.out.println("Number was not found: ");
            }
        }

    }

    /**
     * Binary search repeatedly divides the search interval in half.
     * It requires the array to be sorted beforehand.
     * Compares the middle element of the array with the target:
     * If the middle element matches the target, return its index.
     * If the target is smaller than the middle element, search in the left half.
     * If the target is larger, search in the right half.
     */

    public void useBinarySearch(){
        int [] numbers = {15, 25, 35, 45, 55};

        Arrays.sort(numbers);  //Ensure the array is sorted

        int target = 40;
        int result = myBinarySearch(numbers, target);

        if(result != -1){
            System.out.println("Element found at index: " + result);
        }else {
            System.out.println("Element not found in the array");
        }

    }

    /**
     * Binary Search
     * @param array
     * @param target
     * @return
     */
    public int myBinarySearch(int [] array, int target){
        int left = 0;
        int right = array.length-1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(array[mid] == target){
                return mid; //returning the index if the target is immediately found
            }else if (array[mid] < target){
                left = mid + 1;  //Search in the right half of the array
            }else{
                right = mid - 1; //Search in the left half
            }

        }
        return -1;
    }

}
