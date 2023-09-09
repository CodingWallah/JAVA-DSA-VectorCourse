
## Solution of Intersection Of Two Arrays

#### Time Complexity - O (n*m)

#### Space Complexity - O(n)

```java

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i <nums1.length ; i++) {
            for (int j = 0; j <nums2.length ; j++) {

                if(nums1[i]==nums2[j]){

                    hs.add(nums2[j]);
    }
  }
}

        int []nums3 = new int[hs.size()];
        int h=0;
        for(Integer n: hs){
            nums3[h++]=n;
        }
        return nums3;



}
}


```

### Solution 2: Two Pointer Approach 

#### Time Complexity - O (nlog(n))

#### Space Complexity - O(n)

```java

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]==nums2[j]){
                hs.add(nums1[i]);
                i++;j++;
}
            else{
                if(nums1[i]<nums2[j])i++;
                else j++;
}

}

        int []nums3 = new int[hs.size()];
        int h=0;
        for(Integer n: hs){
            nums3[h++]=n;
}
        return nums3;



}
}

```

<div  align="right"> 
   Contributed By <a href="https://github.com/Love-Garg-19"> Love Garg</a>
</div>