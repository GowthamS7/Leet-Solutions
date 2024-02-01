import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        int[][] result = new int[n / 3][3];
        Arrays.sort(nums);

        int index = 0;
        for (int i = 0; i < n; i += 3) {
            if (i + 2 >= n || nums[i + 2] - nums[i] > k) {
                return new int[][]{};
            }

            result[index][0] = nums[i];
            result[index][1] = nums[i + 1];
            result[index][2] = nums[i + 2];
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 3, 4, 8, 7, 9, 3, 5, 1};
        int k1 = 2;
        System.out.println(Arrays.deepToString(solution.divideArray(nums1, k1)));

        int[] nums2 = {1, 3, 3, 2, 7, 3};
        int k2 = 3;
        System.out.println(Arrays.deepToString(solution.divideArray(nums2, k2)));
    }
}
