import java.util.Arrays;

public class ex2 {
    private static boolean arrayDouble(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int g = i + 1; g < nums.length; g++) {
                if (nums[g] == nums[i]) {
                    return true;
                }
            }
        }
        return false;
    }
}
