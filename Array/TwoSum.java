package Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  // Solution 1
  public int[] twoSum(int[] nums, int target) {
    int[] array = new int[2];

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          array[0] = i;
          array[1] = j;

          return array;
        }
      }
    }
    return array;
  }

  // Solution 2
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      var kq = target - nums[i];
      if (map.containsKey(kq)) {
        return new int[] {i, map.get(kq)};
      }
      map.put(nums[i], i);
    }
    return null;
  }
}
