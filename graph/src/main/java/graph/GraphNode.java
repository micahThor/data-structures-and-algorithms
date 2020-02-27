package graph;

import java.util.LinkedList;
import java.util.List;

public class GraphNode<E> {
    private E value;
    private List<Edge> edgesList;

    private boolean visited;

    public GraphNode(E value) {
        this.value = value;
        this.edgesList = new LinkedList<Edge>();
    }

    public E getValue() {
        return value;
    }

    public void addEdge(GraphNode node, double weight) {
        this.edgesList.add(new Edge(node, weight));
    }

    public List<Edge> getEdgesList() {
        return this.edgesList;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
