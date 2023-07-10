 [ Profile ](https://github.com/rath23)
 ========

### Solution of Reverse an Array
#### Time Complexity - O (n)
#### Space Complexity - O(1)

```java 
class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1; 
        while ( start < end){
          char temp = s[start];
          s[start] = s[end];
          s[end]= temp;
          start++;
          end--;
        }
    }
}
```