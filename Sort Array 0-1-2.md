### [Back2Home](https://github.com/CodingWallah/Arrays-DSA-Coding-Questions) | [Go2Video](#)

##

### Solution 1 `Not Recommended`
#### Time Complexity: `O(n*logn)`

```java
class Solution {
  public void sortColors(int[] nums) {
     Arrays.sort(nums);
  }
}
```

### Solution 2 `Alternative`
#### Time Complexity: `O(n)`
#### Space Complexity: `O(1)`
```java

class Solution {
  public void sortColors(int[] nums) {
    int i = 0, count0 = 0, count1 = 0, count2 = 0;
    for (i = 0; i < nums.length; i++) {
      if (nums[i] == 0)
        count0++;
      else if (nums[i] == 1)
        count1++;
      else if (nums[i] == 2)
        count2++;
    }

    i = 0;

    while (count0 > 0) {
      nums[i++] = 0;
      count0--;
    }

    while (count1 > 0) {
      nums[i++] = 1;
      count1--;
    }

    while (count2 > 0) {
      nums[i++] = 2;
      count2--;
    }
  }
}
```

### Solution 3 `Best`
#### Time Complexity: `O(n)`
#### Space Complexity: `O(1)`

```java

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
        case 1: {
          ptr++;
          break;
        }
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