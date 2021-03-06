package graph;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class GraphTest {

    Graph<Integer> testGraph;
    Graph<String> flightRoutes;

    @Before
    public void initGraph() {
        testGraph = new Graph<Integer>();
        testGraph.addNode(17);
        testGraph.addNode(19);
        testGraph.addNode(11);
    }

    @Before
    public void initFlightMap() {
        flightRoutes = new Graph<>();
        flightRoutes.addNode("pandora");
        flightRoutes.addNode("arendelle");
        flightRoutes.addNode("metroville");
        flightRoutes.addNode("monstropolis");
        flightRoutes.addNode("naboo");
        flightRoutes.addNode("narnia");

        flightRoutes.addEdge("pandora", "arendelle", 150.0);
        flightRoutes.addEdge("arendelle", "monstropolis", 42.0);
        flightRoutes.addEdge("monstropolis", "naboo", 73.0);
        flightRoutes.addEdge("naboo", "narnia", 250.0);
        flightRoutes.addEdge("metroville", "pandora", 82.0);
        flightRoutes.addEdge("metroville", "arendelle", 99.0);
        flightRoutes.addEdge("metroville", "monstropolis", 105.0);
        flightRoutes.addEdge("metroville", "naboo", 26.0);
        flightRoutes.addEdge("metroville", "narnia", 37.0);
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

    @Test
    public void graph_TestBreadthFirstTraverse() {
        Graph<Integer> testGraph2 = new Graph<>();
        testGraph2.addNode(22);
        testGraph2.addNode(90);
        testGraph2.addNode(60);

        // add edges to this node
        GraphNode<Integer> newNode4 = testGraph2.addNode(33);
        testGraph2.addEdge(33, 22, 1.0);
        testGraph2.addEdge(33, 90, 2.0);
        testGraph2.addEdge(33, 60, 3.0);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(33);
        expected.add(22);
        expected.add(90);
        expected.add(60);

        LinkedList<GraphNode> actualNodes = (LinkedList<GraphNode>)testGraph2.getNodes_BreadthFirstTraversal(33);
        ArrayList<Integer> actualValues = new ArrayList<>();
        for (GraphNode node : actualNodes) {
            actualValues.add((Integer)node.getValue());
        }

        assertArrayEquals(expected.toArray(), actualValues.toArray());
    }

    @Test
    public void graph_TestBreadthFirstTraverse2() {
        Graph<Integer> testGraph2 = new Graph<>();
        testGraph2.addNode(22);
        testGraph2.addNode(90);
        testGraph2.addNode(60);
        testGraph2.addNode(45);
        testGraph2.addNode(88);

        // add edges to this node
        testGraph2.addNode(33);
        testGraph2.addEdge(33, 22, 1.0);
        testGraph2.addEdge(33, 90, 2.0);
        testGraph2.addEdge(33, 60, 3.0);

        testGraph2.addNode(34);
        testGraph2.addEdge(34, 22, 1.0);
        testGraph2.addEdge(34, 90, 2.0);
        testGraph2.addEdge(34, 60, 3.0);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(33);
        expected.add(22);
        expected.add(90);
        expected.add(60);
        expected.add(34);

        LinkedList<GraphNode> actualNodes = (LinkedList<GraphNode>)testGraph2.getNodes_BreadthFirstTraversal(33);
        ArrayList<Integer> actualValues = new ArrayList<>();
        for (GraphNode node : actualNodes) {
            actualValues.add((Integer)node.getValue());
        }

        assertArrayEquals(expected.toArray(), actualValues.toArray());
    }

    @Test
    public void graph_TestIDirectFlight_HappyPath1() {
        String[] cities = new String[]{"metroville", "pandora"};
        DirectFlight actualDirect = DirectFlight.isDirect(flightRoutes, cities);

        assertTrue(actualDirect.isDirect);
        assertEquals(82.0, actualDirect.price, 0.001);
    }

    @Test
    public void graph_TestIDirectFlight_HappyPath2() {
        String[] cities = new String[]{"arendelle", "monstropolis", "naboo"};
        DirectFlight actualDirect = DirectFlight.isDirect(flightRoutes, cities);

        assertTrue(actualDirect.isDirect);
        assertEquals(115.0, actualDirect.price, 0.001);
    }

    @Test
    public void graph_TestIDirectFlight_HappyPath3() {
        String[] cities = new String[]{"pandora", "arendelle", "monstropolis", "naboo", "narnia"};
        DirectFlight actualDirect = DirectFlight.isDirect(flightRoutes, cities);

        assertTrue(actualDirect.isDirect);
        assertEquals(515.0, actualDirect.price, 0.001);
    }

    @Test
    public void graph_TestIDirectFlight_False1() {
        String[] cities = new String[]{"pandora", "nowhereville"};
        DirectFlight actualDirect = DirectFlight.isDirect(flightRoutes, cities);

        assertFalse(actualDirect.isDirect);
    }

    @Test
    public void graph_TestIDirectFlight_False2() {
        String[] cities = new String[]{"pandora", "monstropolis"};
        DirectFlight actualDirect = DirectFlight.isDirect(flightRoutes, cities);

        assertFalse(actualDirect.isDirect);
    }

    @Test
    public void graph_TestDepthFirstTraversal() {
        Graph<String> graph = new Graph<>();
        GraphNode gn0 = graph.addNode("a");
        GraphNode gn1 = graph.addNode("b");
        GraphNode gn2 = graph.addNode("c");
        GraphNode gn3 =  graph.addNode("g");
        GraphNode gn4 = graph.addNode("d");
        GraphNode gn5 = graph.addNode("e");
        GraphNode gn6 = graph.addNode("h");
        GraphNode gn7 = graph.addNode("f");

        graph.addEdge("a", "b", 1.0);
        graph.addEdge("b", "c", 1.0);
        graph.addEdge("c", "g", 1.0);
        graph.addEdge("b", "d", 1.0);
        graph.addEdge("a", "d", 1.0);
        graph.addEdge("d", "e", 1.0);
        graph.addEdge("d", "h", 1.0);
        graph.addEdge("d", "f", 1.0);
        graph.addEdge("f", "h", 1.0);

        List<GraphNode> actual = graph.getNodes_DepthFirstTraversal("a");
        System.out.println(actual.toString());
        assertEquals(gn0, actual.get(0));
        assertEquals(gn4, actual.get(1));
        assertEquals(gn7, actual.get(2));
        assertEquals(gn6, actual.get(3));
        assertEquals(gn5, actual.get(4));
        assertEquals(gn1, actual.get(5));
        assertEquals(gn2, actual.get(6));
        assertEquals(gn3, actual.get(7));


    }
}
