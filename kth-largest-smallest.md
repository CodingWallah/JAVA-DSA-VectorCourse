### [Back2Home](https://github.com/CodingWallah/Arrays-DSA-Coding-Questions) | [Go2Video](#)

##

#### `When` max Heaps and when min Heaps and `why`?

1) min heap = uses for largest ?
2) max heap = uses for smallest ?

> #### :exclamation: k is small = min; | k is large = MAX;

##

### Solution 1 : Using Sorting
#### Time Complexity: `O(n*logn)`
```java
class Solution {
    public int findKthLargest(int[] nums, int k) {
          Arrays.sort(nums);
          return nums[nums.length-k];
    }
}
```

##

### Solution 2: Min Heap Approach 
#### Time Complexity: `O(n + n*logk)`
`Best Solution`
```java
PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
  for(int i=0;i<k;i++)
      minheap.add(nums[i]);
    
  for(int i=k;i<nums.length;i++){
    if(nums[i]>minheap.peek()){
        minheap.poll();
        minheap.add(nums[i]);
    }
  }
return minheap.peek();
```

`Concise Implementation`

```java
PriorityQueue<Integer> pq = new PriorityQueue<Integer>();  
  for(int i : nums){
    pq.add(i);
    if(pq.size()>k){
        pq.remove();
    }
  }
return pq.remove();
```

## 

### Solution 3: Max Heap Approach
#### Time Complexity: `O(n + n*logk)`
`Best Solution`
```java
PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());   
  for(int i=0;i<nums.length-k+1;i++)
    maxHeap.add(nums[i]);
      
  for(int i=nums.length-k+1;i<nums.length;i++){
    if(nums[i]<maxHeap.peek()){
       maxHeap.poll();
       maxHeap.add(nums[i]);
    }
  }
return maxHeap.peek();
```

`Consice Implementation`
```java
PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());   
  for(int i : nums){
    pq.add(i);
      
  for(int i=1;i<k;i++)
    pq.poll();
  
return pq.peek();            
```
