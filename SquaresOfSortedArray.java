public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] sortedNums = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[start]) < Math.abs(nums[end])) {
                sortedNums[i] = nums[end] * nums[end];
                end--;
            } else {
                sortedNums[i] = nums[start] * nums[start];
                start++;
            }
        }
        return sortedNums;
    }
}
