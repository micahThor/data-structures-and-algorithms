# Code Challenge 35
<!-- Short summary or background information -->
A graph is useful for making connections between data.  In my implementation, a piece of data is saved in a node structure.  Each node is capable of creating edges that are references or connections between two nodes.  
My graph is generic, capable of storing any valid Java type.  The graph declaration type is also the node type.

## Challenge
<!-- Description of the challenge -->
Create a Graph class capable of storing Nodes.  Nodes contain a value and a list of Edges.  Edges contain a weight and a list of referenced Nodes.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
My Graph class uses an HashMap to store Nodes.  Each Node is capable of being retrieved/added in Big O(1) time.  Each Node contains a list of Edges, which can be accessed in Big O(n) time at worst. 

## API
<!-- Description of each method publicly available in your Graph -->
- AddNode()   
        Adds a new node to the graph. 
        Takes in the value of that node.  
        Returns the added node.  
- AddEdge()   
        Adds a new edge between two nodes in the graph. 
        Include the ability to have a “weight”  
        Takes in the two nodes to be connected by the edge. 
        Both nodes should already be in the Graph. 
- GetNodes()    
        Returns all of the nodes in the graph as a collection (set, list, or similar)
- GetNeighbors()    
        Returns a collection of nodes connected to the given node. 
        Takes in a given node. 
        Include the weight of the connection in the returned collection  
- Size()    
        Returns the total number of nodes in the graph. 

---

# Challenge Summary - Code Challenge 36 24 FEB 2020
<!-- Short summary or background information -->
Given a Graph, return a collection of the nodes that represent a **breadth-first traversal**

## Challenge Description
<!-- Description of the challenge -->
- Extend your graph object with a breadth-first traversal method that accepts a starting node. Without utilizing any of the built-in methods available to your language, return a collection of nodes in the order they were visited. Display the collection.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
My approach included modifying the GraphNode class to include the ability to return whether that node had been visited.  In this case, I wanted to keep track of which nodes had been visited in order to not duplicate values in my result array.  

In my method I add each node to a Linked list that acts like a queueu.  Everytime I add to the queueu I check to see if that node has any edges that haven't been visited.  If they haven't been visited, I add them to the queueu.  Everytime I remove from the queueu, I add to the result list.

| Method | Big O time | Big O space
| ----------- | ----------- | ----------- |
| breadthFirstTraversal | O(n) | O(n)

## Solution
<!-- Embedded whiteboard image -->
![](https://github.com/micahThor/data-structures-and-algorithms/blob/master/assets/Graph%20-%20BF.jpg)]


---

# Challenge Summary - Code Challenge 37 25 FEB 2020
<!-- Short summary or background information -->
Utilize Graph implementation to determine if a direct route is possible given a list of graph key values.

## Challenge Description
<!-- Description of the challenge -->
- Write a function based on the specifications above, which takes in a graph, and an array of city names. Without utilizing any of the built-in methods available to your language, return whether the full trip is possible with direct flights, and how much it would cost.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
In this challenge I created a helper class, DirectFlight.  DirectFlight has a boolean value representing if a shared edge(s) and a double value representing the cumulative value of the edge(s) weight.

My approach includes iterating over key values to determine if they have edges that exist as other key values in the input array.  If there are shared edges, those key values are marked as seen.  Seen in this context means that a direct route is possible.  At the end of the iteration logic I iterate again over the keys to see if any key returns false for having been seen.  This would indicate that a direct route is not possible.  Otherwise, return the accumulative value of the shared edges weight and true.

| Method | Big O time | Big O space
| ----------- | ----------- | ----------- |
| isDirect | O(n) | O(1)

## Solution
<!-- Embedded whiteboard image -->
![](https://github.com/micahThor/data-structures-and-algorithms/blob/master/assets/graph%20isdirect.jpg)

---

# Challenge Summary - Code Challenge 38 26 FEB 2020
<!-- Short summary or background information -->
Given a Graph, return a collection of the nodes that represent a **depth-first traversal**

## Challenge Description
<!-- Description of the challenge -->
- Create a function that accepts an adjacency list as a graph, and conducts a depth first traversal. Without utilizing any of the built-in methods available to your language, return a collection of nodes in their pre-order depth-first traversal order.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
My approach involves a traversal that adds unseen nodes to a stack.  Until that stack is empty, nodes will continue checking their edges for other unseen nodes.  If an shared edge node is unvisited, it is added to stack.

| Method | Big O time | Big O space
| ----------- | ----------- | ----------- |
| depthFirstTraversal | O(n) | O(n)

## Solution
<!-- Embedded whiteboard image -->
![](https://github.com/micahThor/data-structures-and-algorithms/blob/master/assets/graph%20DFS1.JPG)
![](https://github.com/micahThor/data-structures-and-algorithms/blob/master/assets/graph%20DFS2.JPG)
![](https://github.com/micahThor/data-structures-and-algorithms/blob/master/assets/graph%20DFS3.JPG)
