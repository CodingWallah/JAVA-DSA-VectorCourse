package BinarySearchSolutions;

public class FindMaxInRotatedSortedArray {
    public static int findMin(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1; // minm is in the right subarray
            } else {
                right = mid; // minm is in the left subarray (including mid)
            }
        }

        return left; // The minm element is at index 'left'
    }

    public static void main(String[] args) {
        int[] rotatedArray = {4, 5, 6, 7, 9,3};
        int maxElement = findMin(rotatedArray)-1;
        if (maxElement!=-1)
           System.out.println("Maximum element: " + rotatedArray[maxElement]);
        else
           System.out.println("Maximum element: " + rotatedArray[rotatedArray.length-1]);
    }
}
