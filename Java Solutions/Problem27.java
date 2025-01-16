public class Problem27 {
  public int removeElement(int[] nums, int val) {
    int k = 0;
    int i = 0;
    int start = 0;
    int end = nums.length - 1;
    int[] result = new int[nums.length];

    if (nums.length == 0) {
      return 0;
    }

    for (int j = 0; j < nums.length; j++) {
      if (nums[j] == val) {
        result[end] = nums[j];
        end --;
      }
      else {
        result[start] = nums[j];
        start ++;
      }
    }
    while (i < result.length &&  result[i] != val) {
      k ++;
      i ++;
    }
    for (i = 0 ; i < nums.length  ; i++) {
      nums[i] = result[i];
    }

    return k;
  }
}
