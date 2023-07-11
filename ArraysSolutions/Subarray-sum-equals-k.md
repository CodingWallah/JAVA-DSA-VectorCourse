#### Time Complexity - O (n^2)
#### Space Complexity - O(1)

```java 
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int sum = 0;
            for (int j = i ; j < nums.length ; j++){
                sum+=nums[j];
                if (sum == k){
                    count++;
                }
            }
        }
        return count++;
    }
}
```
<div  align="right"> 
   Contributed By <a href="https://github.com/rath23"> Muneer Ahmad</a>
</div>
