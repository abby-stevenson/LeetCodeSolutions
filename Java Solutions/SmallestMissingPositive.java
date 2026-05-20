class Result {

    /*
     * Complete the 'findSmallestMissingPositive' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY orderNumbers as parameter.
     */

    public static int findSmallestMissingPositive(List<Integer> orderNumbers) {
    // Write your code here
    int n = orderNumbers.size();

    int[] nums = new int[n];

    for (int i = 0; i < n; i++) {
        nums[i] = orderNumbers.get(i);
    }

    for (int i = 0; i < n; i++) {

        while (
            nums[i] > 0 &&
            nums[i] <= n &&
            nums[i] != nums[nums[i] - 1]
        ) {

            int current = nums[i];
            int temp = nums[current - 1];

            nums[current - 1] = current;
            nums[i] = temp;
        }
    }

    for (int i = 0; i < n; i++) {
        if (nums[i] != i + 1) {
            return i + 1;
        }
    }

    return n + 1;
    }
    
}