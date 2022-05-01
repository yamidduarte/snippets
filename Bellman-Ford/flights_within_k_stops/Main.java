class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
             
        long[][] distances = new long[2][n];
        Arrays.fill(distances[0], Integer.MAX_VALUE);
        Arrays.fill(distances[1], Integer.MAX_VALUE);
        distances[0][src] = distances[1][src] = 0;
        
        for (int iterations = 0; iterations < K + 1; iterations++)
            for (int[] edge : flights) {
                int s = edge[0], d = edge[1], wUV = edge[2];
                long dU = distances[1 - iterations&1][s];
                long dV = distances[iterations&1][d];
                if (dU + wUV < dV)
                    distances[iterations&1][d] = dU + wUV;             
            }
        return distances[K&1][dst] < Integer.MAX_VALUE ? (int) distances[K&1][dst] : -1;
    }
}

// T: O(K*E), since we have K + 1 iterations, and in each iteration we go over all the edges in the graph
// S: O(V)
