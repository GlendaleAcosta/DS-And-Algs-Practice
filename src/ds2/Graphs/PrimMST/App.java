package ds2.Graphs.PrimMST;

public class App {
    public static void main(String[] args) {
        Graph g = new Graph();
        g.addNode("A");
        g.addNode("B");
        g.addNode("C");
        g.addNode("D");
        g.addNode("E");
        g.addNode("F");
        g.addNode("G");

        Node A = g.getNode("A");
        Node B = g.getNode("B");
        Node C = g.getNode("C");
        Node D = g.getNode("D");
        Node E = g.getNode("E");
        Node F = g.getNode("F");
        Node G = g.getNode("G");

        A.addAdjNode(B, 2);
        A.addAdjNode(C, 3);
        A.addAdjNode(D, 3);

        B.addAdjNode(A, 2);
        B.addAdjNode(C, 4);
        B.addAdjNode(E, 3);

        C.addAdjNode(A, 3);
        C.addAdjNode(B, 4);
        C.addAdjNode(D, 5);
        C.addAdjNode(E, 1);
        C.addAdjNode(F, 6);

        D.addAdjNode(A, 3);
        D.addAdjNode(C, 5);
        D.addAdjNode(F, 7);

        E.addAdjNode(B, 3);
        E.addAdjNode(C, 1);
        E.addAdjNode(F, 8);

        F.addAdjNode(C, 6);
        F.addAdjNode(D, 7);
        F.addAdjNode(E, 8);
        F.addAdjNode(G, 9);

        G.addAdjNode(F, 9);


        g.prims(A);



    }
}
