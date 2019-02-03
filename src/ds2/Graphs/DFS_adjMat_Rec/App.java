package ds2.Graphs.DFS_adjMat_Rec;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        Node nodes[] = new Node[10];
        nodes[0] = new Node(1);
        nodes[1] = new Node(2);
        nodes[2] = new Node(3);
        nodes[3] = new Node(4);
        nodes[4] = new Node(5);
        nodes[5] = new Node(6);
        nodes[6] = new Node(7);
        nodes[7] = new Node(8);
        nodes[8] = new Node(9);
        nodes[9] = new Node(10);

        int [][] matrix = {
                {0,1,0,0,1,1,0,0,0,0},
                {0,0,1,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,1,0},
                {0,0,0,0,0,0,0,0,0,1},
                {0,0,0,0,0,0,0,0,0,0},
        };

        dfs(0, matrix, nodes);
    }

    public static void dfs(int n, int[][] matrix, Node nodes[]) {
        boolean visited[] = new boolean[10];
        dfsUtil(n, matrix, visited, nodes);
    }

    public static void dfsUtil(int n, int[][] matrix, boolean visited[], Node nodes[]) {
        visited[n] = true;
        System.out.println(nodes[n].data);

        for(int i = 0; i < matrix.length; i++) {
            if (matrix[n][i] == 1 && !visited[i]) {
                dfsUtil(i, matrix, visited, nodes);
            }
        }
    }
}
