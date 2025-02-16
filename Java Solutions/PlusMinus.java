public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int length = arr.size();
    int pos = 0;
    int neg = 0;
    int zero = 0;
    for (int i = 0; i < length; i++) {
        Integer current = arr.get(i);
        if (current > 0 ) {
            pos ++;
        }
        else if (current < 0) {
            neg ++;
        }
        else {
            zero ++;
        }
    }
    
    System.out.println((double)pos/length);
    System.out.println((double)neg/length);
    System.out.println((double)zero/length);

    }
