public static int lonelyinteger(List<Integer> a) {
    // Write your code here
    int result = 0;

        // XOR all the elements in the array
        for (int num : a) {
            result ^= num;  // XOR operation
        }
        
        // Return the result, which is the lonely integer
        return result;
    }
