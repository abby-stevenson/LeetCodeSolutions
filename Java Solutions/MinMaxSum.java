public static void miniMaxSum(List<Integer> arr) {
    long totalSum = 0;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        
        // Calculate total sum and find min/max values
        for (int num : arr) {
            totalSum += num;
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }

        long minSum = totalSum - largest;
        long maxSum = totalSum - smallest;

        System.out.println(minSum + " " + maxSum);
    }
}
