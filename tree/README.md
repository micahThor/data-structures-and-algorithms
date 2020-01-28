# Trees
<!-- Short summary or background information -->
Create a Tree and BinarySearchTree class.  Both tree's are binary in the sense that they contain references to two nodes.

## Challenge
<!-- Description of the challenge -->
1. Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.

2. Create a BinaryTree class
       - Define a method for each of the depth first traversals called preOrder, inOrder, and postOrder which returns an array of the values, ordered appropriately.
       - Any exceptions or errors that come from your code should be semantic, capturable errors. For example, rather than a default error thrown by your language, your code should raise/throw a custom, semantic error that describes what went wrong in calling the methods you wrote for this lab.

3. Create a BinarySearchTree class
       - Define a method named add that accepts a value, and adds a new node with that value in the correct location in the binary search tree.
       - Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
In my Tree classes I used the public/private method pattern to solve the recusive problem.  I decided the calling side code looked cleaner when I didn't have to pass in each object's own root.  Since that is a common feature to all nodes, I passed it along in the private method.

My Node class keeps reference to a left and right node along with its value.

My Tree class has a reference to a root node and the ability to traverse in three distinct orders.

My BinarySearchTree has a reference to a root node and the ability to verify if a value is within the current tree.

## API
<!-- Description of each method publicly available in each of your trees -->
#### Tree API
    preOrder()   : Returns an ArrayList<Integer> of the Tree's pre order traversal   (get data, traverse left, traverse right)
    inOrder()    : Returns an ArrayList<Integer> of the Tree's in order traversal    (traverse left, get data, traverse right)
    postOrder()  : Returns an ArrayList<Integer> of the Tree's post order traversal  (traverse left, traverse right, get data)
    
#### BinarySearchTree API
    add(int value)          : Adds an integer to the tree in the appropriate node location.  Node location is determined by the input value verses the current node value.  Natural ordering.
    contains(int value)     : Returns true if integer is within the tree
