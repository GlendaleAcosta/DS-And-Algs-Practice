package ds.Graph.BFS;
import java.util.Queue;
import java.util.LinkedList;
public class BFS {

    public void bfs(Vertex root) {
        Queue<Vertex> queue = new LinkedList<>();
        root.setVisited(true);
        queue.add(root);

        while(!queue.isEmpty()) {
            Vertex actual = queue.remove();
            System.out.println(actual + " ");
            for(Vertex v: actual.getNeighborList()) {
                if(!v.isVisited()) {
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }
    }
}
