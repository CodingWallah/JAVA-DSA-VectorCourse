# Find Minimum in Rotated Sorted Array

## Time = O (logn)
```java
class Solution {
    public int findMin(int[] arr) {
         int start =0, end = arr.length-1;

         while(start<end){
           int mid = start + (end-start)/2;

            // If the mid element is greater than to the right element
            //the minimum must be on the right side
           if(arr[mid]>arr[end])
              start = mid+1;
           
           // If the mid element is less than or equal to the right element
           //the minimum must be on the left side,
          // including the mid element
           else
             end = mid;
         }
         return arr[start];
    }
}












```