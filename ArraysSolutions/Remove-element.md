## Solution of Remove Element
#### Time Complexity - O (n)
#### Space Complexity - O(n)

```java 
class Solution {
    public int removeElement(int[] nums, int val) {
       int result=0;
       int arr [] = nums;
       for(int i = 0 ; i < arr.length ; i++){
           if(arr[i]!= val){
             nums[result] = arr[i];
             result++; 
           }
       } 
       return result;
    }
}
```
<div  align="right"> 
   Contributed By <a href="https://github.com/rath23"> Muneer Ahmad</a>
</div>