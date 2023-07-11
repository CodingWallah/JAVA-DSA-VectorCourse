## Solution of Wave Array
#### Time Complexity - O (n)
#### Space Complexity - O(1)

```java 
class Solution {
  
    public static void convertToWave(int n, int[] a) {
      
        for (int i = 0; i <n-1 ; i+=2){
            int temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
        
    }
}
```
<div  align="right"> 
   Contributed By <a href="https://github.com/rath23"> Muneer Ahmad</a>
</div>
