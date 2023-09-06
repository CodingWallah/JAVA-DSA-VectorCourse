import java.util.Arrays;
import java.util.Scanner;

public class RuffClass {
//     public static void main(String[] args) {
//       //  System.out.println("Coding Wallah Community");

//         // Long lg = 12395654998765655L;
//         // System.out.println(lg.SIZE);
//         // System.out.println(lg.MAX_VALUE);
//         // System.out.println(lg.MIN_VALUE);
//         String a= "coding wallah";
//         String b= "coding wallah";
//         System.out.println("a==b :");
//         System.out.println("a==b :" + a==b);

//     }

 public static int nestedSum(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + nestedSum(nestedSum(n - 1));
        }
    }
//Recursion
        //  static void recursion(int num){
            
        //      if(num>0)
        //          recursion(num-1);

        //      System.out.println(num);
        //  }

      //Recursion
          static void recursion(int num){
                if(num< 0) return; 

                recursion(num-1);
                System.out.println(num);
          }

        //   public static int peakIndexInMountainArrayBinary(int[] arr) {
        //     int s=0, e=arr.length-1;
        //     while(s<e){
        //         int mid = s + (e-s)/2;
        //         if(arr[mid]>arr[mid+1]) e = mid;
        //         else s=mid;
        //     }
        //     return s;
        // }

    // public static void main(String[] args) {
    //     //int result = nestedSum(2);
    //     //System.out.println(result);
    //     int arr[] = {0,1,2,5,6,7,4,3};
    //    // System.out.println("pk :"+peakIndexInMountainArrayBinary(arr));
    //    Scanner sc = new Scanner(System.in);
    //    String name = sc.next();
    //    System.out.println("Name :"+name);
    //     sc.nextLine();
    //    String sname = sc.nextLine();
    //    System.out.println("Sname :"+sname);
    //    // recursion(6);
    // }
    //    public static void main(String arr){
            
    //    }


 public static void main(String[] args) {
    int arr[] = {50,60,30,20,90,50};

    //QuickSort(arr,0,arr.length-1);
    //System.out.println(Arrays.toString(arr));
 }

private static void QuickSort(int[] arr, int s, int e) {
    if(s<e){
       // int p = Lpartion(arr,s,e);
        int p = Hpartion(arr,s,e);
        QuickSort(arr,s,p);
        QuickSort(arr,p+1,e);
    }
}

private static int Hpartion(int[] arr, int s, int e) {
    int pivot = arr[s];
    int left=s+1,right=e;
  
    //     int pivot=arr[l];
    //     int i=l-1,j=h+1;
    //     while(true){
        // do{i++;}while(arr[i]<pivot);
        // do{j--;}while(arr[j]>pivot);
        // if(i>=j) return j;
        // swap(arr,i,j);
    // }

        boolean done = false;
        while (!done) {
            while (left <= right && arr[left] <= pivot) {
                left = left + 1;
            }
            while (arr[right] >= pivot && right >= left) {
                right = right - 1;
            }
            if (right < left) {
                done = true;
            } else {
                // Swap arr[left] and arr[right]
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

    int temp = arr[s];
    arr[s] = arr[right];
    arr[right] = temp;
    return right;
}

private static int Lpartion(int[] arr, int s, int e) {
    int pivot = arr[e];
    int i = s-1;
    for(int j=s;j<=e-1;j++) {
     if(arr[j]<pivot){
        i++; // we need to grow size of smaller window array
        swap(arr,i,j);
     }
    }
     //swapping of placing the pivot to his corrct psn
     swap(arr,i+1,e);
    return i+1;
}

private static void swap(int[] arr, int i, int j) {
     int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
}


 }


//  class Account {
//     static class Amount{
//     }
//  }

// class Bank{
// }

// class test{
//     public static void main(String[] args) {
//         Account.Amount am = new Account.Amount();
//     }
// }
