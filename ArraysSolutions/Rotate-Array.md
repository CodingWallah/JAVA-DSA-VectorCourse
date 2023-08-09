## Solution of Rotate-Array
#### Time Complexity - O (n)
#### Space Complexity - O(1)

```java 
class Solution {
    public static void reverse(int [] a , int start , int end ){
        while (start <end){
            int temp = a[start];
            a[start]=a[end];
            a[end] = temp;
            start++;
            end--;
        }
    } 
    
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k =  k%n;
        reverse(nums,(n-k),(n-1));
        reverse(nums,0,(n-k-1));
        reverse(nums,0,(n-1));
    }
}
```
<div  align="right"> 
   Contributed By <a href="https://github.com/rath23"> Muneer Ahmad</a>
</div>