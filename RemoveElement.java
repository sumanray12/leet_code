public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3};
        int num = 2;
        int resultLength = removeElement(nums, num);
        System.out.println(resultLength);
    }

    public static int removeElement(int[] nums, int val) {
        int valCounter = 0; // this will return the number of values which equals to val
        // if the array itself is empty then return 0
        if (nums.length == 0) {
            return 0;
        }

        int start = 0; // start pointer
        int end = nums.length - 1; // end pointer
        // check if there is only one number in the array
        if (start == end) {
            if (nums[start] == val) {
                return 0;
            } else {
                return 1;
            }
        }
        // run below loop until start and end point are same
        while (start <= end) {
            // below block will check if start pointer pointing to the val
            if (nums[start] == val) {
                // below block will check if end pointer pointing to the val
                // if true, end pointer will decrease and skip to the next iteration
                if (nums[end] == val) {
                    valCounter++;
                    end--;
                    continue;
                }
                // if start pointer is pointing to the val,
                // and end pointer pointing to a value
                // which is not val then swap the value in these two pointers,
                // and increment start pointer,
                // and decrement end pointer
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
                valCounter++;
            }
            // if the current start pointer is not pointing the val
            // then increase start pointer
            else {
                start++;
            }
        }
        return nums.length - valCounter;
    }
}
