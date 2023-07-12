## Solution of Find All Duplicates in an Array

### First Approach 

#### Time Complexity - O (n)

#### Space Complexity - O(1)

```java

class  Solution {

public  List<Integer> findDuplicates(int[] nums) {

List <Integer> list = new  ArrayList <Integer>();

int start=0;

int ref;

Arrays.sort(nums);

for (int i = 0  ; i < nums.length-1  ; i++){

ref = nums[i] ^ nums[i+1];

if(ref == 0 ){

list.add(start,nums[i]);

start++;

}

}

return list;

}

}

```
### Second Approach

#### Time Complexity - O (n)

#### Space Complexity - O(1)

```java
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List <Integer> list = new ArrayList <Integer>();
        int n = nums.length;
        int index;   
        for (int i = 0 ; i < n; i++){
            int num = nums[i];
          index = Math.abs(num) - 1 ;
          if ( nums[index] < 0){
              list.add(Math.abs(nums[i]));
          }
          else{
              nums[index] = nums[index] * -1;
          }
        }
        return list;
    }
}

```

<div  align="right"> 
   Contributed By <a href="https://github.com/rath23"> Muneer Ahmad</a>
</div>