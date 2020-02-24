package graph;

import java.util.HashMap;
import java.util.List;

public class Graph<E> {

    private HashMap<GraphNode<E>, GraphNode<E>> nodeHashMap;

    public Graph() {
        this.nodeHashMap = new HashMap<>();
    }

    public GraphNode<E> addNode(E value) {
        GraphNode<E> node = new GraphNode<>(value);
        this.nodeHashMap.put(node, node);
        return node;
    }

    public boolean addEdge(GraphNode<E> node1, GraphNode<E> node2, double weight) {
        if (nodeHashMap.containsValue(node1) && nodeHashMap.containsValue(node2)) {
            // self referencing edge
            if (node1 == node2) {
                nodeHashMap.get(node1).addEdge(node1, weight);
            } else {
                nodeHashMap.get(node1).addEdge(node2, weight);
                nodeHashMap.get(node2).addEdge(node1, weight);
            }
            return true;
        }
        return false;
    }

    public List<Edge> getNeighbors(GraphNode<E> node) {
        if (this.nodeHashMap.containsKey(node)) {
            return node.getEdgesList();
        }
        return null;
    }

    public GraphNode<E>[] getNodes() {
        Object[] nodesInMap = this.nodeHashMap.values().toArray();

        // return null if empty
        if (nodesInMap.length == 0) {
            return null;
        }
        // populate nodes array with casted values and return
        GraphNode<E>[] nodes = new GraphNode[nodesInMap.length];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = (GraphNode<E>) nodesInMap[i];
        }
        return nodes;
    }

    public int size() {
        return this.nodeHashMap.size();
    }

    public boolean containsValue(E value) {
        return this.nodeHashMap.containsValue(value);
    }

}



