public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int primaryDiagonal = 0;
    int secondaryDiagonal = 0;
    for (int i = 0; i < arr.size(); i ++) {
        for (int j = 0; j < arr.size(); j ++) {
            if (i == j) {
                primaryDiagonal = primaryDiagonal + arr.get(i).get(j);
            }
            if ((arr.size() - i - 1) == j) {
                secondaryDiagonal = secondaryDiagonal + arr.get(i).get(j);
            }
        }
    }
    return Math.abs(primaryDiagonal - secondaryDiagonal);
    }