## Solution of Remove all occurrences of Given Number

#### Time Complexity - O (n)

#### Space Complexity - O(1)

```java

class Solution {
    public int removeElement(int[] nums, int val) {
         
 int i = 0;
            int n = nums.length;
            while (i < n) {
                if (nums[i] == val) {
                    nums[i] = nums[n - 1];
                    n--;
                } else {
                    i++;
                }
            }
            return n;
    }
}

```
<div  align="right"> 
   Contributed By <a href="https://github.com/Love-Garg-19"> Love Garg</a>
</div>