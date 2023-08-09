## Solution of Remove duplicates from sorted array
#### Time Complexity - O (n)
#### Space Complexity - O(1)

```java 
class Solution {
    public int removeDuplicates(int[] nums) {
        int result=1;
        for (int i = 0 ; i < nums.length-1 ; i++){
            if (nums[i] != nums[i+1]){
                nums[result]=nums[i+1];
                result++;
          }
        }
       return result ; 
    }
}
```
<div  align="right"> 
   Contributed By <a href="https://github.com/rath23"> Muneer Ahmad</a>
</div>