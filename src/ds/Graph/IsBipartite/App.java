package ds.Graph.IsBipartite;

public class App {
    public static void main (String[] args)
    {
        int G[][] = {{0, 1, 0, 1},
                {1, 0, 1, 0},
                {0, 1, 0, 1},
                {1, 0, 1, 0}
        };
        Bipartite b = new Bipartite();
        if (b.isBipartite(G, 0))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
