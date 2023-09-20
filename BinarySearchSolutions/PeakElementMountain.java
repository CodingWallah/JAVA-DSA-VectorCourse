public class PeakElementMountain {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1 };
        System.out.println(peakElement(nums));
    }

    public static int peakElement(int nums[]) {
        int start = 0, mid = 0, end = nums.length - 1;
        while (start < end) {
            mid = start + (end - start) / 2;
            // if mid lies on left line of mountain move start to mid+1
            if (nums[mid] < nums[mid + 1])
                start = mid + 1; // Right Half
            else
                // if mid lies on peak of mountain we cant go back by moving end i.e.(end-1=mid)
                end = mid; // Left Half
        }
        return nums[start];
    }
}
