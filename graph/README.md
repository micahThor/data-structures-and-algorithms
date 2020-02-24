# Code Challenge 35
<!-- Short summary or background information -->
A graph is useful for making connections between data.  In my implementation, a piece of data is saved in a node structure.  Each node is capable of creating edges that are references or connections between two nodes.  
My graph is generic, capable of storing any valid Java type.  The graph declaration type is also the node type.

## Challenge
<!-- Description of the challenge -->

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

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
