
## Solution of Trapping-rain-water
#### Time Complexity - O (n)
#### Space Complexity - O(n)

```java 
class Solution {
    public int trap(int[] height) {
        int [] arrL = new int [height.length];
        int [] arrR = new int [height.length];
        int lMax= 0;
        int rMax =0;
        for (int i = 0 ; i < height.length ; i++){
            if(lMax < height[i]){
                arrL[i]= height[i];
                lMax=height[i];
            }
            else{
                arrL[i] = lMax;
            }
           
        }
          for (int i = height.length-1 ; i >= 0 ; i--){
            if(rMax < height[i]){
                arrR[i]= height[i];
                rMax =height[i];
            }
              else{
                arrR[i] = rMax;
            }
           
          }
            int result=0;
            int a = 0;
            while(a < height.length){
             result += Math.min(arrL[a],arrR[a]) - height[a];
             a++;
            }
        
        return result;
    }
}
```
<div  align="right"> 
   Contributed By <a href="https://github.com/rath23"> Muneer Ahmad</a>
</div>