public class Problem42 {
    public int trap(int[] height) {
      int amount = 0;
      int[] water = new int[height.length];
      water[0] = 0;
      water[height.length - 1] = 0;
      for (int i = 1; i < height.length -1; i++) {
        water[i] = Math.min(maxRight(i, height), maxLeft(i, height)) - height[i];
        if (water[i] < 0) {
          water[i] = 0;
        }
        System.out.println("right");
        System.out.println(maxRight(i, height));
        System.out.println("left");
        System.out.println(maxLeft(i, height));
        System.out.println("water");
        System.out.println( Math.min(maxRight(i, height), maxLeft(i, height)) - height[i]);
      }
      for (int j = 0; j < water.length; j++){
        amount = amount + water[j];
      }

      return amount;
    }

    public int maxLeft(int curr, int[] height){
      int max = 0;
      for (int i = 0; i < curr; i++) {
        if(height[i] > max) {
          max = height[i];
        }
      }
      return max;
    }

    public int maxRight(int curr, int[] height){
      int max = 0;
      for (int i = height.length -1; i > curr; i--) {
        if(height[i] > max) {
          max = height[i];
        }
      }
      return max;
    }

    //same intution as you had just runs better 
    public int trapBetterComplexity(int[] height) {
      int n = height.length;
      if (n == 0) return 0;

      int[] leftMax = new int[n];
      int[] rightMax = new int[n];

      leftMax[0] = height[0];
      for (int i = 1; i < n; i++) {
        leftMax[i] = Math.max(leftMax[i - 1], height[i]);
      }

      rightMax[n - 1] = height[n - 1];
      for (int i = n - 2; i >= 0; i--) {
        rightMax[i] = Math.max(rightMax[i + 1], height[i]);
      }

      int waterTrapped = 0;
      for (int i = 0; i < n; i++) {
        waterTrapped += Math.min(leftMax[i], rightMax[i]) - height[i];
      }

      return waterTrapped;
    }
  }

