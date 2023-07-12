
## Solution of Missing-Number
#### Time Complexity - O (n)
#### Space Complexity - O(1)

```java 
class Solution {
    public int missingNumber(int[] nums) {
     int num = nums.length;
     int sunOfNaturalNumbers = num*(num+1)/2;
     int sumOfArrayNum = 0;
     for(int i = 0; i<num ; i++){
         sumOfArrayNum += nums[i];
     }
     return sunOfNaturalNumbers-sumOfArrayNum;
    }
}
```
<div  align="right"> 
   Contributed By <a href="https://github.com/rath23"> Muneer Ahmad</a>
</div>