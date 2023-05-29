### [Back2Home](https://github.com/CodingWallah/ArraysCodingQuestions/main/README.md) | [Go2Video](#)

1) min heap = uses for largest ?

2) max heap = uses for smallest ?

### WHEN max and when min HEAPS and WHY ?

 Note- k is small = min; | k is large = MAX;
```java

//sol1 = using sorting or trick
// Time complexity = O(NlogN)
class Solution {
    public int findKthLargest(int[] nums, int k) {
          Arrays.sort(nums);
          return nums[nums.length-k];
    }
}

```

```java

//MIN HEAP APPROACH = Best Solution O(N + NlogK) time complexity
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
```java

//MIN HEAP EASY & CONCISE IMPLEMENTATION
PriorityQueue<Integer> pq = new PriorityQueue<Integer>();  
         for(int i : nums){
            pq.add(i);
            if(pq.size()>k){
                pq.remove();
            }
        }
        
        return pq.remove();

```


```java
//MAX HEAP APPROACH = Best Solution O(N + NlogK) time complexity
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
    }
    
```

```java
//MAX HEAP EASY & CONCISE IMPLEMENTATION
PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());   
        for(int i : nums){
            pq.add(i);
            
        for(int i=1;i<k;i++)
               pq.poll();
        
           return pq.peek(); 
           
```
