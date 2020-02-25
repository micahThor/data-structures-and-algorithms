package graph;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class GraphTest {

    Graph<Integer> testGraph;

    @Before
    public void initGraph() {
        testGraph = new Graph<Integer>();
        testGraph.addNode(17);
        testGraph.addNode(19);
        testGraph.addNode(11);
    }

    @Test
    public void graph_TestAddNode() {
        testGraph.containsValue(17);
        testGraph.containsValue(19);
        testGraph.containsValue(11);
    }

    @Test
    public void graph_TestAddEdge() {
        GraphNode<Integer> newNode1 = testGraph.addNode(33);
        GraphNode<Integer> newNode2 = testGraph.addNode(27);
        boolean result = testGraph.addEdge(33, 27, 17.5);
        // test for adding edges to each node
        assertTrue(result);
        // test that node2 was added to node1's edge list
        LinkedList<Edge> edgeList1 = (LinkedList<Edge>) testGraph.getNeighbors(newNode1);
        assertEquals(newNode2, edgeList1.get(0).getDestination());
        // test that node1 was added to node2's edge list
        LinkedList<Edge> edgeList2 = (LinkedList<Edge>) testGraph.getNeighbors(newNode2);
        assertEquals(newNode1, edgeList2.get(0).getDestination());
    }

    @Test
    public void graph_TestGetAllNodes() {
        GraphNode[] actualNodeList = testGraph.getNodes();
        GraphNode[] expectedNodeList = new GraphNode[3];
        for (int i = 0; i < actualNodeList.length; i++) {
            expectedNodeList[i] = actualNodeList[i];
        }
        for (int i = 0; i < actualNodeList.length; i++) {
            assertEquals(expectedNodeList[i].getValue(), actualNodeList[i].getValue());
        }
    }

    @Test
    public void graph_TestGetNeighbors() {
        GraphNode<Integer> newNode1 = testGraph.addNode(22);
        GraphNode<Integer> newNode2 = testGraph.addNode(90);
        GraphNode<Integer> newNode3 = testGraph.addNode(60);

        // add edges to this node
        GraphNode<Integer> newNode4 = testGraph.addNode(33);
        testGraph.addEdge(33, 22, 1.0);
        testGraph.addEdge(33, 90, 2.0);
        testGraph.addEdge(33, 60, 3.0);
        // create list of edges from newNode4
        List<Edge> list =  testGraph.getNeighbors(newNode4);
        // test that each node is referenced in edge list
        assertEquals(newNode1, list.get(0).getDestination());
        assertEquals(newNode2, list.get(1).getDestination());
        assertEquals(newNode3, list.get(2).getDestination());
    }

    @Test
    public void graph_TestGetNeighborsWeight() {
        GraphNode<Integer> newNode1 = testGraph.addNode(22);
        GraphNode<Integer> newNode2 = testGraph.addNode(90);
        GraphNode<Integer> newNode3 = testGraph.addNode(60);

        // add edges to this node
        GraphNode<Integer> newNode4 = testGraph.addNode(33);
        testGraph.addEdge(33, 22, 1.0);
        testGraph.addEdge(33, 90, 2.0);
        testGraph.addEdge(33, 60, 3.0);
        // create list of edges from newNode4
        List<Edge> list =  testGraph.getNeighbors(newNode4);
        // test that each node is referenced in edge list
        assertEquals(1.0, list.get(0).getWeight(), 0.001);
        assertEquals(2.0, list.get(1).getWeight(), 0.001);
        assertEquals(3.0, list.get(2).getWeight(), 0.001);
    }

    @Test
    public void graph_TestSize() {
        assertEquals(3, testGraph.size());
    }

    @Test
    public void graph_TestAddNodeThatIsItsOwnEdge() {
        // add node to this node
        GraphNode<Integer> newNode4 = testGraph.addNode(33);
        // make node self reference with edge
        testGraph.addEdge(33, 33, 1.0);
        // create list of edges from newNode4
        List<Edge> list =  testGraph.getNeighbors(newNode4);
        // test that node is referenced to itself
        assertEquals(newNode4, list.get(0).getDestination());
    }

    @Test
    public void graph_TestEmtpyGraphForNull() {
        Graph<Integer> emptyGraph = new Graph<>();
        assertNull(emptyGraph.getNodes());
    }
}
