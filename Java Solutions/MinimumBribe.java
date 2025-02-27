public static void minimumBribes(List<Integer> q) {
    // Write your code here
    int numSwaps = 0;
    for (int i = 0; i < q.size(); i++ ){
        int curr = q.get(i);
        if (curr - (i + 1) > 2) {
            System.out.println("Too chaotic");
            return;
        }
        for (int j = Math.max(0, curr - 2); j < i; j++) {
            if (q.get(j) > curr) {
                numSwaps++;
            }
        }
    }
    System.out.println(numSwaps);

    }
