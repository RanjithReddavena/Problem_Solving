import java.util.*;

class Solution {

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {

        int[][] dist = new int[n][n];

        int inf = Integer.MAX_VALUE;

        // Initialize distances as INF
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], inf);
            dist[i][i] = 0;
        }

        // Store edges
        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            dist[u][v] = w;
            dist[v][u] = w;
        }

        // Floyd-Warshall
        for (int m = 0; m < n; m++) {

            for (int s = 0; s < n; s++) {

                for (int e = 0; e < n; e++) {

                    if (dist[s][m] != inf && dist[m][e] != inf) {

                        dist[s][e] = Math.min(
                            dist[s][e],
                            dist[s][m] + dist[m][e]
                        );
                    }
                }
            }
        }

        // Find city with minimum reachable neighbors
        int answer = -1;
        int minCount = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {

                if (i != j && dist[i][j] <= distanceThreshold) {
                    count++;
                }
            }

            // <= ensures largest index in case of tie
            if (count <= minCount) {
                minCount = count;
                answer = i;
            }
        }

        return answer;
    }
}