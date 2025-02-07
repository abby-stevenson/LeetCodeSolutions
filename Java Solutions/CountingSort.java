class Result {

    /*
     * Using ArrayList
     */

    public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
    List<Integer> freq = new ArrayList<>(Collections.nCopies(100, 0));
    //List<Integer> sorted = new ArrayList<Integer>(100);
    //int n = 0;
    for (int i = 0; i < arr.size(); i++) {
        int value = arr.get(i);
        int currCount = freq.get(value);
        int incCount = currCount + 1;
        freq.set(value, incCount);
    }
    /*
    while (n < arr.size()) {
        if (freq.get(n) == 0){
            n++;
        }
        else {
            int number = freq.get(n);
            int j = n;
            while (number != 0){
                sorted.set(j, n);
                number --;
            }
        }
    }
    */
    return freq;
    }

}