package ds.Graph.DFS.BasicDFS1;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private List<Vertex> neighborList;
    private boolean isVisited;

    public Vertex(String name) {
        this.name = name;
        this.neighborList = new ArrayList<>();
    }

    public void addNeighbor(Vertex vertex) {
        this.neighborList.add(vertex);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNeighborList(List<Vertex> neighborList) {
        this.neighborList = neighborList;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public String getName() {

        return name;
    }

    public List<Vertex> getNeighborList() {
        return neighborList;
    }

    public boolean isVisited() {
        return isVisited;
    }

    @Override
    public String toString() {
        return this.name;

    }
}
