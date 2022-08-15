public class DuplicateZeros {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 0, 0, 0, 0};

        /* insert a new value in the beginning of the array */
//        for (int i = nums.length - 1; i != 0; i--) {
//            nums[i] = nums[i - 1];
//        }
//        nums[0] = 10;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && i != nums.length - 1) {
                insertValue(nums, (i + 1), 0);
                i++; //skip the index which has been inserted for previous 0
            }
        }

        for (var p = 0; p < nums.length; p++) {
            System.out.print(nums[p] + " ");
        }
    }

    public static void insertValue(int[] arr, int index, int number) {
        for (int i = arr.length - 1; i >= index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = number;
    }
}
