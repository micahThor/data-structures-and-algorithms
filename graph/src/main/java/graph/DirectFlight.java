package graph;

public class DirectFlight {

    public boolean isDirect;
    public double price;

    public DirectFlight(boolean isDirect, double price) {
        this.isDirect = isDirect;
        this.price = price;
    }

    public static DirectFlight isDirect(Graph<String> routes, String[] cities) {
        // if any value in cities doesn't exist return false result
        for (String city : cities) {
            if (routes.contains(city) == false) {
                return new DirectFlight(false, 0.0);
            }
        }
        // total weight of the edges representing total cost of route
        double costCounter = 0.0;
        // traverse input array and check each node's edges
        for (String city : cities) {
            GraphNode<String> temp = routes.getNode(city);
            for (Edge edge : temp.getEdgesList()) {
                // traverse input array again and check to see if any share edges
                for (String cityWithSharedEdge : cities) {
                    if (edge.getDestination() == routes.getNode(cityWithSharedEdge) && routes.getNode(cityWithSharedEdge).isVisited() == false) {
                        // if they share edge, set visited and increase cost of route
                        temp.setVisited(true);
                        routes.getNode(cityWithSharedEdge).setVisited(true);
                        costCounter += edge.getWeight();
                    }
                }
            }
        }
        // if any cities weren't visited, no possible direct route between
        for (String city : cities) {
            if (routes.getNode(city).isVisited() == false) {
                return new DirectFlight(false, 0.0);
            }
        }
        // at this point, all routes have been visited and verified as direct path
        return new DirectFlight(true, costCounter);
    }
}
