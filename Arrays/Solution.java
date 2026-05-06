import java.util.*;

public class Solution {

    public int[] sortArrayByParity(int[] nums) {

        int i = 0;
        int j = 0;

        while (j < nums.length) {

            if (nums[j] % 2 == 0) {

                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;

                i++;
            }
            j++;
        }

        return nums;
    }
    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {3, 1, 2, 4};

        int[] result = obj.sortArrayByParity(nums);

        System.out.println(Arrays.toString(result));
    }
}