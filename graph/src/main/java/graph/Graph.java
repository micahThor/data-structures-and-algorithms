package graph;

import java.util.HashMap;
import java.util.List;

public class Graph<E> {

    private HashMap<E, GraphNode<E>> nodeHashMap;

    public Graph() {
        this.nodeHashMap = new HashMap<>();
    }

    public GraphNode<E> addNode(E value) {
        GraphNode<E> node = new GraphNode<>(value);
        this.nodeHashMap.put(value, node);
        return node;
    }

    public boolean addEdge(E nodeKey1, E nodeKey2, double weight) {
        if (nodeHashMap.containsKey(nodeKey1) && nodeHashMap.containsKey(nodeKey2)) {
            GraphNode<E> node1 = nodeHashMap.get(nodeKey1);
            GraphNode<E> node2 = nodeHashMap.get(nodeKey2);
            // self referencing edge
            if (nodeKey1 == nodeKey2) {
                node1.addEdge(node1, weight);
            } else {
                node1.addEdge(node2, weight);
                node2.addEdge(node1, weight);
            }
            return true;
        }
        return false;
    }

    public List<Edge> getNeighbors(GraphNode<E> node) {
        if (this.nodeHashMap.containsKey(node.getValue())) {
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



