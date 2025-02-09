public static int flippingMatrix(List<List<Integer>> matrix) {
        int size = matrix.size();

        int midPoint = size / 2;

        int bigTotal = 0;

        for (int i = 0; i < midPoint; i++ ){
            for (int j = 0; j < midPoint; j++) {
                int topLeft = matrix.get(i).get(j);
                int topRight = matrix.get(i).get(size - j - 1);

                int bottomLeft = matrix.get(size - i - 1).get(j);
                int bottomRight = matrix.get(size - i - 1).get(size - j - 1);

                bigTotal = bigTotal + Math.max(Math.max(topLeft, topRight),
                Math.max(bottomLeft, bottomRight));
            }  
        }
        return bigTotal;
    }