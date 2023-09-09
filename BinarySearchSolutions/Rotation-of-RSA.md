## Solution 1
```java
public class CountRotationsInSortedArray {
    public static int countRotations(int[] arr) {  
            //rotation btw (0,n) only
            return findMin(arr);
          }

        public int findMin(int[] arr) {
         int start =0, end = arr.length-1;

         while(start<end){
           int mid = start + (end-start)/2;
           if(arr[mid]>arr[end]) start = mid+1;
           else
             end = mid;
         }
         return start;
    }
}
```
## Solution 2
```java
public class CountRotationsInSortedArray {
    public static int countRotations(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            if (arr[left] <= arr[right]) {
                return left; // No rotations in the array
            }

            int mid = left + (right - left) / 2;
            int next = (mid + 1) % arr.length;
            int prev = (mid + arr.length - 1) % arr.length;

            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return mid; // Number of rotations is equal to the index of the minimum element
            } else if (arr[mid] <= arr[right]) {
                right = mid - 1; // The minimum element is on the left side
            } else {
                left = mid + 1; // The minimum element is on the right side
            }
        }

        return -1; // Array is not rotated
    }

    public static void main(String[] args) {
        int[] rotatedArray = {4, 5, 6, 7, 0, 1, 2};
        int rotations = countRotations(rotatedArray);
        System.out.println("Number of rotations: " + rotations);
    }
}

```