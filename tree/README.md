# CODE CHALLENGE 15: 27 JAN 2020

## Trees
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
    
    
---
---

# CODE CHALLENGE 16: 27 JAN 2020

## Challenge Summary
<!-- Short summary or background information -->
Create a class FizzBuzzTree that is a binary tree of String nodes.  FizzBuzzTree contains a method capable of accepting an integer tree, copying the values into a string, and changing those values to typical FizzBuzz requirements.  Requirements are stated as:

              
              if current node's inter value equivalent is evenly divisible by 5 or 3 : change to FIZZBUZZ
              if current node's inter value equivalent is evenly divisible by 5      : change to FIZZ
              if current node's inter value equivalent is evenly divisible by 3      : change to BUZZ
              else retain that value
              

## Challenge Description
<!-- Description of the challenge -->
1. Write a function called FizzBuzzTree which takes a tree as an argument.
2. Without utilizing any of the built-in methods available to your language, determine whether or not the value of each node is divisible by 3, 5 or both. Create a new tree with the same structure as the original, but the values modified as follows:
       - If the value is divisible by 3, replace the value with “Fizz”
       - If the value is divisible by 5, replace the value with “Buzz”
       - If the value is divisible by 3 and 5, replace the value with “FizzBuzz”
       - If the value is not divisible by 3 or 5, simply turn the number into a String.
3. Return the new tree.

## Approach & Efficiency
My approach was to use adapt methods I wrote in code challenge 15.  To start this lab I had a way of adding values to a tree and traversing that tree in order.  Combining those two mutators, I had a way of first turning an integer tree into a string tree.  Then I had a way of checking all values in my string tree to see if they were divisible by fizz buzz rules.

Overall my time complexity is reduced to O(n).  I know that I must visit every node in my integer tree.  I also make a second pass through my newly created string tree, costing another O(n) operation.

My space complexity is O(n) because for every node in the input integer tree, I must create a corresponding String node.

## Solution
<!-- Embedded whiteboard image -->
[Click here to see my FizzBuzzTree](https://github.com/micahThor/data-structures-and-algorithms/blob/master/tree/src/main/java/fizzbuzz/FizzBuzzTree.java)
![](https://github.com/micahThor/data-structures-and-algorithms/blob/master/assets/fizzbuzz%20tree.jpg)

---
---

# CODE CHALLENGE 17: 28 JAN 2020

## Challenge Summary
<!-- Short summary or background information -->
Create a breadthFirstSearch method capable of returning an array of tree node values.  Array will be ordered by the breadth-first traversal of a tree.
              

## Challenge Description
<!-- Description of the challenge -->
1. Write a breadth first traversal method which takes a Binary Tree as its unique input. Without utilizing any of the built-in methods available to your language, traverse the input tree using a Breadth-first approach, and return a list of the values in the tree in the order they were encountered.

## Approach & Efficiency
My implementation uses an iterative approach to visit each node in the Binary Search Tree.  I used a Queue class to ensure the ArrayList that I am returning will be ordered in a breadth-first traversal of the tree.  The nodes are passed into the Queue one at a time until the tree is exhausted.  With each iteration, the current node's value is added to the ArrayList and removed from the front of the Queue.

## Solution
<!-- Embedded whiteboard image -->
[Click here to see my Breadth First method](https://github.com/micahThor/data-structures-and-algorithms/blob/master/tree/src/main/java/tree/BinarySearchTree.java)
![](https://github.com/micahThor/data-structures-and-algorithms/blob/master/assets/breadthfirst%20tree%20traversal.jpg)

---
---

# CODE CHALLENGE 17: 28 JAN 2020

## Challenge Summary
<!-- Short summary or background information -->
Create a breadthFirstSearch method capable of returning the maximum integer value in that tree. 
              
## Challenge Description
<!-- Description of the challenge -->
1. Write an instance method called find-maximum-value. Without utilizing any of the built-in methods available to your language, return the maximum value stored in the tree. You can assume that the values stored in the Binary Tree will be numeric.

## Approach & Efficiency
My implementation uses an iterative approach to visit each node in the Binary Search Tree.  With each iteration, the current node's value is checked against the current max integer value.  If current is greater, set the max integer variable to current value.  Then dequeue that node, and keep going until you have visited each node.  Then return the max integer varible.

## Solution
<!-- Embedded whiteboard image -->
[Click here to see my get max value method](https://github.com/micahThor/data-structures-and-algorithms/blob/master/tree/src/main/java/tree/Tree.java)
![](https://github.com/micahThor/data-structures-and-algorithms/blob/master/assets/max%20value%20in%20tree.jpg)
