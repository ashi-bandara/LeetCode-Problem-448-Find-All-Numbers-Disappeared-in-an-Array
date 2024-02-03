import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums); // Sorting for efficient binary search
        List<Integer> result  = new ArrayList<>(); // Initializing the result list to store missing numbers

        for (int i = 1; i <= nums.length; i++) {
            if(Arrays.binarySearch(nums, i) < 0){ // Use binary search to check if the current number does not exist in the array
                result.add(i); // if not found, add to result list
            }
        }

        return result;
    }
}