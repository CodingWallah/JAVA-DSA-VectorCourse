## Solution of Insertion of two Array 
## Approach First
#### Time Complexity - O (n)
#### Space Complexity - O(n)

```java 
class Solution {
    public int [] intersection(int[] nums1, int[] nums2) {
      HashSet <Integer> hs = new HashSet <Integer>();
      HashSet <Integer> hs1 = new HashSet<Integer>();
      for(int i = 0 ; i < nums1.length ;i ++){
          hs1.add(nums1[i]);
      }
    
          for (int j = 0 ; j < nums2.length ; j++){
              if(hs1.contains(nums2[j])){
                  hs.add(nums2[j]);
              }
          }
      
       int arr[] = new int [hs.size()];
       int l = 0;
      for(Integer a : hs){
          arr[l++]=a;
      }
        
       return arr;
    }
}
```

### Second Approach 
## Time complexity : O(n^2)
## Space complexity : O(n)

```java 
class Solution {
    public int [] intersection(int[] nums1, int[] nums2) {
      HashSet <Integer> hs = new HashSet <Integer>();
      
      for(int i = 0 ; i < nums1.length ;i ++){
          for (int j = 0 ; j < nums2.length ; j++){
              if(nums1[i]== nums2[j]){
                  hs.add(nums2[j]);
              }
          }
      }
       int arr[] = new int [hs.size()];
       int l = 0;
      for(Integer a : hs){
          arr[l++]=a;
      }
        
       return arr;
    }
}
```
<div  align="right"> 
   Contributed By <a href="https://github.com/rath23"> Muneer Ahmad</a>
</div>