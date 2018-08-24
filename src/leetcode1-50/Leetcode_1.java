import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode_1 {
    public static void main(String []args)
    {
        try {
            Leetcode_1 leetcode = new Leetcode_1();
            System.out.println(Arrays.toString(leetcode.twoSum1(new int[] {1, 2, 3}, 3)));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public int[] twoSum1(int[] nums, int target)
    {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("fail");
    }

    public int[] twoSum2(int[] nums, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {i, map.get(complement)};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("fail");
    }
}
