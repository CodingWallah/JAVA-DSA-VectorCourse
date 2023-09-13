class BinarySearchLecture {
    public static void main(String[] args) {
        int[] sarray = {10,20,30,55,65,87,98};
        int[] descarray = {98,58,48,32,22,20,10};
        int target = 22;
        int result = binarySearchI(sarray,target);
        System.out.println(result);
         result = binarySearchReverse(descarray,target);
        System.out.println(result);
    }

     
    public static int binarySearchI(int[] arr, int target) {
        int s=0,mid=0,e = arr.length-1;
        while(s<=e) {
         // Find Mid
            // mid = (s+e)/2;
            mid = s + (e-s)/2;
         // Element found at index mid
         if(arr[mid]==target) return mid;
         // Search in the right half
        else if(arr[mid]<target) s=mid+1;
         // Search in the left half
         else e = mid-1;
        }
         // Element not found in the array
         return -1;
 }

 public static int binarySearchReverse(int[] arr, int target) {
        int s=0,mid=0,e = arr.length-1;
        while(s<=e) {
         // Find Mid
            // mid = (s+e)/2;
            mid = s + (e-s)/2;
         // Element found at index mid
         if(arr[mid]==target) return mid;
         // Search in the right half
        else if(arr[mid]>target) s=mid+1;
         // Search in the left half
         else e = mid-1;
        }
         // Element not found in the array
         return -1;
 }

}