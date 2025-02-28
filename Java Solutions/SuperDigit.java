public static int superDigit(String n, int k) {
    // Write your code here
    String p = "";
    for (int i = 0; i < k; i++) {
        p = p + n;
    }
    
    while (p.length() > 1){
        int sum = 0;
        for (int j = 0; j < p.length(); j++) {
            int currNum = p.charAt(j) - '0';
            sum = sum + currNum;
        }
        p = String.valueOf(sum);
    }
    return Integer.valueOf(p);

    }


    // With recursion - more efficient
    /*
    
    public static int superDigit(String n, int k) {
        // Compute initial sum of digits in n
        long sum = 0;
        for (char c : n.toCharArray()) {
            sum += (c - '0');
        }
        
        // Multiply by k and recursively compute the super digit
        return computeSuperDigit(sum * k);
    }
    
    private static int computeSuperDigit(long num) {
        if (num < 10) return (int) num;  // Base case: single-digit number
        
        long sum = 0;
        while (num > 0) {
            sum += num % 10;  // Extract last digit and add to sum
            num /= 10;
        }
        
        return computeSuperDigit(sum);
    }
    */