## Solution of Removing-minimum-and-maximum-from-array
#### Time Complexity - O (n)
#### Space Complexity - O(1)

```java 
class Solution {
    public int minimumDeletions(int[] nums) {
        int arrayLength = nums.length;
        int max=nums[0];
        int maxIndex = 0;
        int min=nums[0];
        int minIndex = 0;

        for (int i = 0 ; i < nums.length; i++){
            if (max<nums[i]){
                 max = nums[i] ;
                 maxIndex = i;
            }
             if (min>nums[i]){
                 min = nums[i] ;
                 minIndex=i;
            }
        }
        int c1,c2,c3;
        if(minIndex > maxIndex){
            c1 = (maxIndex +1) + (arrayLength - minIndex);
            c2 = minIndex + 1;
            c3 = arrayLength - maxIndex;
        }

          else if(maxIndex > minIndex){
            c1 = (minIndex +1) + (arrayLength - maxIndex);
            c2 = maxIndex + 1;
            c3 = arrayLength - minIndex;
        }
        else {
            c1=c2=c3=maxIndex+1;
        }

        if ( c1 < c2 && c1 < c3 ){
            return c1;
        }
        else if (c2 < c1 && c2 < c3){
            return c2;
        }
        else if (c3 < c1 && c3 < c2){
            return c3;
        }
        else {
            return c2;
        }
}
}
```
<div  align="right"> 
   Contributed By <a href="https://github.com/rath23"> Muneer Ahmad</a>
</div>