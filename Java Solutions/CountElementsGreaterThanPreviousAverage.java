class Result {

    /*
     * Complete the 'countResponseTimeRegressions' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY responseTimes as parameter.
     */

    public static int countResponseTimeRegressions(List<Integer> responseTimes) {
    int count = 0;
    double average = 0;
    
    if (responseTimes.size() == 0){
        return 0;
    }
    
     long lastFew = responseTimes.get(0);
    
    for (int i = 1; i < responseTimes.size(); i++) {
    
        average = (double) lastFew / i;
        if( average < responseTimes.get(i)){
            count = count + 1;
        }

        lastFew += responseTimes.get(i);
    }
    
    return count;

    }

}