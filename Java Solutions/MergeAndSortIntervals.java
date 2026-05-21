  /*
     * Complete the 'mergeHighDefinitionIntervals' function below.
     *
     * The function is expected to return a 2D_INTEGER_ARRAY.
     * The function accepts 2D_INTEGER_ARRAY intervals as parameter.
     */

    public static List<List<Integer>> mergeHighDefinitionIntervals(List<List<Integer>> intervals) {
    // Write your code here
    if (intervals.size() <= 1) {
        return intervals;
    }

    // Sort intervals by start time
    intervals.sort((a, b) -> Integer.compare(a.get(0), b.get(0)));

    List<List<Integer>> merged = new ArrayList<>();

    // Add first interval
    merged.add(new ArrayList<>(intervals.get(0)));

    for (int i = 1; i < intervals.size(); i++) {

        List<Integer> current = merged.get(merged.size() - 1);
        List<Integer> next = intervals.get(i);

        // Overlapping intervals
        if (next.get(0) <= current.get(1)) {

            // Merge intervals
            current.set(1, Math.max(current.get(1), next.get(1)));

        } else {

            // No overlap
            merged.add(new ArrayList<>(next));
        }
    }

    return merged;
    }
