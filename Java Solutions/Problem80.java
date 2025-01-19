public class Problem80 {
  public int removeDuplicates(int[] nums) {
    int count;
    int current;
    int k = nums.length;
    for (int i = 0; i < nums.length; i ++) {
      count = 1;
      current = nums[i];
      for (int j = i + 1; j < k; j++) {
        if (nums[i] == nums[j]) {
          count++;
          if (count > 2) {
            for (int m = j + 1; m < k; m++) {
              nums[m - 1] = nums[m];
            }
            nums[nums.length - 1] = current;
            k--;
            j--;
          }
        }
      }
    }
    return k;
  }
}
