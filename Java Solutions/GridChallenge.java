public static String gridChallenge(List<String> grid) {
    // Write your code here
    List<String> sortedGrid = new ArrayList<String>();
    for(int i = 0; i < grid.size(); i++) {
        String curr = grid.get(i);
        char[] chars = curr.toCharArray();
        Arrays.sort(chars);
        String sorted = "";
        for (int j = 0; j < chars.length; j++) {
            sorted = sorted + chars[j];
        }
        sortedGrid.add(sorted);  
    }
    for(int n = 0; n < sortedGrid.size() - 1; n++) {
        for(int k = 0; k < sortedGrid.get(0).length(); k++) {
            char char1 = sortedGrid.get(n).charAt(k);
            char char2 = sortedGrid.get(n + 1).charAt(k);
            if (char1 > char2) {
                return "NO";
            }
        }
    }
    return "YES";
    }