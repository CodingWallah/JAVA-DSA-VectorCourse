# Find First and Last Position of Element in Sorted Array

### Time complexity - O(log n)
### Space complexity - O(1)

```java
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
		ans[0] = findFirst(nums, target);
		ans[1] = findLast(nums, target);
		return ans;
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