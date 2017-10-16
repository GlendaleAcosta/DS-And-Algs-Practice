package ds.Graph.IsBipartite;

import java.util.LinkedList;

public class Bipartite {
    private int V = 4;

    public boolean isBipartite(int G[][], int src) {
        int colorArr[] = new int[V];
        for(int i = 0; i < V; i++)
            colorArr[i] = -1;

        colorArr[src] = 1;

        LinkedList<Integer> q = new LinkedList<>();
        q.add(src);

        while(!q.isEmpty()) {
            int u = q.poll();
            if (G[u][u] == 1)
                return false;

            for(int i = 0; i < V; i++) {
                if (G[u][i] == 1 && colorArr[i] == -1) {
                    colorArr[i] = 1 - colorArr[u];
                    q.add(i);
                } else if (G[u][i] == 1 && colorArr[i] == colorArr[u])
                    return false;
            }
        }
        return true;
    }
}
