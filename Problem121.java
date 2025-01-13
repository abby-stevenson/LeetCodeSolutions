public class Problem121 {
  public int maxProfitON2(int[] prices) {
    int min = prices[0];
    int max = prices[0];
    int difference = 0;
    for (int i = 0; i < prices.length; i++) {
      max = prices[i];
      min = prices[i];
      for (int j = i + 1; j < prices.length; j++){
        if(prices[j] > max){
          max = prices[j];
          if(max - min > difference) {
            difference = max - min;
          }
        }
      }
    }
    return difference;
  }

  public int maxProfit(int[] prices) {
    int min = prices[0];
    int difference = 0;
    for (int i = 1; i < prices.length; i++) {
      if(prices[i] < min) {
        min = prices[i];
      }
      else if (prices[i] - min > difference) {
        difference = prices[i] - min;
      }
    }
    return difference;
  }
}
