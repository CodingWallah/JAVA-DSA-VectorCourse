## Solution of Move-zeroes
#### Time Complexity - O (n)
#### Space Complexity - O(1)

```java 
class Solution {
    public void moveZeroes(int[] nums) {
        int start = 0;
        int end = start+1;
        while (end <= nums.length-1){
            int temp;
            if(nums[start] == 0 && nums[end]!=0){
              temp = nums[start];
              nums[start] = nums[end];
              nums[end]= temp;
              start++;
              end++;
              continue;
            }
            
            if(nums[start]!= 0 && nums[end]== 0 || nums[start]!=0 && nums[end]!= 0){
                start++;
                end++;
                continue;
            }
           
            if (nums[start] == 0 && nums[end]==0){
                end++;
            }
        }
        
    }
}
```
<div  align="right"> 
   Contributed By <a href="https://github.com/rath23"> Muneer Ahmad</a>
</div>