## Solution of Count Duplicates using Linear Search
#### Time Complexity - O (n)
#### Space Complexity - O(1)

```java 
public class CountDuplicates {
    public static int countDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 2, 3, 3, 3, 4, 5, 5};
        int duplicateCount = countDuplicates(sortedArray);
        System.out.println("Number of duplicates: " + duplicateCount);
    }
}

```

## Solution of Count Duplicates using Binary Search
#### Time Complexity:
- Best Case - O (logn) 
- But worst case - O(nlogn)
#### Space Complexity - O(1)

🔥 Note : Using binary search to count duplicates in a sorted array won't be an efficient approach because binary search is designed to find specific elements in a sorted array, not to count duplicates. 

To count duplicates in a sorted array efficiently, you should use a linear scan,


```java
class Solution {
    public int countDuplicates(int[] nums, int target) {
		int first = findFirst(nums, target);
		int last = findLast(nums, target);
		return last-first + 1;
    }
    static int findLast(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            int lastOccurrence = -1;
    
            while (left <= right) {
                int mid = left + (right - left) / 2;
    
                if (nums[mid] == target) {
                    lastOccurrence = mid;
                    left = mid + 1; // Continue searching in the right half for the last occurrence
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
    
            return lastOccurrence;
        }
     static int findFirst(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            int firstOccurrence = -1;
    
            while (left <= right) {
                int mid = left + (right - left) / 2;
    
                if (nums[mid] == target) {
                    firstOccurrence = mid;
                    right = mid - 1; // Continue searching in the left half for the first occurrence
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
    
            return firstOccurrence;
        }
}




```