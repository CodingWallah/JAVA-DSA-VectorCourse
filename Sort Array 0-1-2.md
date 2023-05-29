### [Back2Home](https://github.com/CodingWallah/Arrays-DSA-Coding-Questions) | [Go2Video](#)
```java

//Best Solution 1 || Time = O(n) , Space = O(1)
class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int ptr = 0, temp = 0;
        while (ptr <= end) {
            switch (nums[ptr]) {
            case 0: {
                temp = nums[start];
                nums[start] = nums[ptr];
                nums[ptr] = temp;
                start++;
                ptr++;
                break;
            }
            case 1:
                ptr++;
                break;
            case 2: {
                temp = nums[ptr];
                nums[ptr] = nums[end];
                nums[end] = temp;
                end--;
                break; 
               }
            }
        }
    }
}

```

```java

//Solution2 - time complexity = O(n)  | space = O(1)
class Solution {
    public void sortColors(int[] nums) {
       int i=0, cnt0 = 0, cnt1 = 0, cnt2 = 0;
        for (i = 0; i < nums.length; i++) {
            if(nums[i]==0) 
                cnt0++;
            else if(nums[i]==1) 
                cnt1++;
            else if(nums[i]==2) 
                cnt2++;
        }
        
        i = 0;
     
         while (cnt0 > 0) {
            nums[i++] = 0;
            cnt0--;
        }
     
        while (cnt1 > 0) {
            nums[i++] = 1;
            cnt1--;
        }
     
        while (cnt2 > 0) {
            nums[i++] = 2;
            cnt2--;
        }
    }
}

```

```java

//sol3 || Time = O(nlogn)
  class Solution {
    public void sortColors(int[] nums) {
       Arrays.sort(nums);
    }
}
```
