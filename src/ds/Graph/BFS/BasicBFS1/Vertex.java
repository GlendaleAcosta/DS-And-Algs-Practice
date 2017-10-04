package ds.Graph.BFS.BasicBFS1;
import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private int data;
    private boolean visited;
    private List<Vertex> neighborList;

    public Vertex(int data) {
        this.data = data;
        neighborList = new ArrayList<>();

    }

    public int getData() {
        return data;
    }

    public boolean isVisited() {
        return visited;
    }

    public List<Vertex> getNeighborList() {
        return neighborList;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setNeighborList(List<Vertex> neighborList) {
        this.neighborList = neighborList;
    }

    public void addNeighborVertex(Vertex vertex) {
        this.neighborList.add(vertex);
    }

    @Override
    public String toString() {
        return "" + this.data;
    }
}
