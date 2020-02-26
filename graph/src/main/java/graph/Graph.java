package graph;

import java.util.HashMap;
import java.util.LinkedList;
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
        if (this.nodeHashMap.containsKey(nodeKey1) && this.nodeHashMap.containsKey(nodeKey2)) {
            GraphNode<E> node1 = this.nodeHashMap.get(nodeKey1);
            GraphNode<E> node2 = this.nodeHashMap.get(nodeKey2);
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

    public boolean contains(E key) {
        return this.nodeHashMap.containsKey(key);
    }

    public GraphNode<E> getNode(E key) {
        return this.nodeHashMap.get(key);
    }

    public int size() {
        return this.nodeHashMap.size();
    }

    public List<GraphNode> getNodes_BreadthFirstTraversal(E nodeKey) {
        List<GraphNode> graphNodes = new LinkedList<>();

        if (!this.nodeHashMap.containsKey(nodeKey)) {
            return graphNodes;
        }

        LinkedList<GraphNode> queueOfNodes = new LinkedList<>();

        GraphNode<E> node = this.nodeHashMap.get(nodeKey);
        graphNodes.add(node);
        queueOfNodes.add(node);
        node.setVisited(true);

        while (!queueOfNodes.isEmpty()) {

            GraphNode<E> temp = queueOfNodes.removeFirst();

            if (temp.getEdgesList() != null) {
                for (Edge edge : temp.getEdgesList()) {
                    GraphNode<E> edgeListNode = edge.getDestination();
                    if (edgeListNode.isVisited() == false) {
                        graphNodes.add(edgeListNode);
                        queueOfNodes.add(edgeListNode);
                        edgeListNode.setVisited(true);
                    }
                }
            }
        }
        return graphNodes;
    }
}



