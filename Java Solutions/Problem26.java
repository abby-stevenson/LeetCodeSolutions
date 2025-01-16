import java.util.ArrayList;

public class Problem26 {
  public int removeDuplicates(int[] nums) {
    int current;
    int start = 0 ;
    int end = nums.length - 1;
    int k = 0;
    ArrayList doublesChecked = new ArrayList();
    int[] result = new int[nums.length];
    for(int i = 0; i < nums.length; i ++) {
      if (!doublesChecked.contains(i)) {
        current = nums[i];
        for (int j = i + 1; j < nums.length; j ++) {
          if (current == nums[j]) {
            result[end] = nums[j];
            doublesChecked.add(j);
            end --;
          }
        }
        result[start] = current;
        k ++;
        start ++;
      }
    }
    for (int n = 0 ; n < nums.length ; n++) {
      nums[n] = result[n];
    }
    return k;
  }

}
