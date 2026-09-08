package Sorting;

public class SelectionSort {
    
    public int[] selectionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // 1. Changed 'arr' to 'nums'
                if (nums[j] < nums[i]) { 
                    int temp = nums[i];
                    nums[i] = nums[j]; // 2. Removed the incorrect 'int' keyword
                    nums[j] = temp;    // 2. Removed the incorrect 'int' keyword
                }
            }
        }
        return nums;
    }
}


