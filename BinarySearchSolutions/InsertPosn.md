# Search Insert Position
## Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

### Time complexity - O(log n)
### Space complexity - O(1)

```java
class Solution {
    public int searchInsert(int[] nums, int target) {
     
        int start= 0,mid=0;
        int end = nums.length-1;
        while(start<=end){
            mid = start + (end-start)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) end = mid-1;
            else start = mid+1;
        }
        return start;
  
    }
}
```