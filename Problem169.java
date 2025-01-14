public class Problem169 {
  public int majorityElement(int[] nums) {
    int size = nums.length / 2;
    int count;
    int current;
    for (int i = 0; i < nums.length; i ++) {
      count = 0;
      current = nums[i];
      for (int j = i; j < nums.length; j ++) {
        if (nums[j] == current) {
          count ++;
          if (count > size) {
            return current;
          }
        }
      }
    }
    return 0;
  }
}
