import java.util.ArrayList;
import java.util.List;

public class CountConnectedComponents {

    /*
     * Complete the 'countIsolatedCommunicationGroups' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. 2D_INTEGER_ARRAY links
     *  2. INTEGER n
     */

    public static int countIsolatedCommunicationGroups(List<List<Integer>> links, int n) {
    // Write your code here
        
        if (links.size() == 0) {
            return n;
        }
        
        if (links.size() == 1) {
            return n-1;
        }
        
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Build the graph
        for (int j = 0; j < links.size(); j++) {
            List<Integer> link = links.get(j);
            int a = link.get(0);
            int b = link.get(1);

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        boolean[] visited = new boolean[n];
        int components = 0;

        // Traverse all nodes
        for (int i = 0; i < n; i++) {

            // New component found
            if (!visited[i]) {
                dfs(i, graph, visited);
                components++;
            }
        }

        return components;

    }
    
    private static void dfs(int node,
                            List<List<Integer>> graph,
                            boolean[] visited) {

        visited[node] = true;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited);
            }
        }
    }


}
