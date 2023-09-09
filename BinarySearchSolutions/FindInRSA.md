## Find in Sorted Rotated array ?
#### Time Complexity - O (logn)
#### Space Complexity - O(1)

## Solution1
```java
public int search(int[] nums, int target) {
            
             int min = findMin(nums);
            
             int rs = bsearch(nums,target,0,min-1);
             if(rs!=-1) return rs;
             
             rs = bsearch(nums,target,min,nums.length-1);
             return rs;
    }

      public int findMin(int[] arr) {
         int start =0, end = arr.length-1;

         while(start<end){
           int mid = start + (end-start)/2;
           if(arr[mid]>arr[end])  start = mid+1; 
           else  end = mid;
         }
         return start;
    }

     public int bsearch(int[] nums, int target,int s, int e) 
       {
        int start= s;
        int end = e;
        while(start<=end){
           int mid = start + (end-start)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) end = mid-1;
            else start = mid+1;
        }
        return -1;
    }
```
## Solution2
```java 
class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
                       
            while (start <= end) {
                int mid = (start + end) / 2;
                            
                //found at mid
                if (target == nums[mid])  return mid;

                // If the left side is sorted          
                if (nums[start] <= nums[mid]) {
                    if (nums[start] <= target && nums[mid] >= target)  
                        end = mid - 1;

                    else start = mid + 1;
                } 
                // If the right side is sorted
                else {
                    if (nums[end] >= target && nums[mid] <= target)
                        start = mid + 1;

                    else  end = mid - 1;
                }
            }
        return -1; 
    }
}

```