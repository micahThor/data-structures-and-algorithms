# Stacks and Queues
<!-- Short summary or background information -->
Create a Stack and Queue class that utilizes Nodes to achieve:  
**STACK:**  Last in First Out data structure  
**QUEUE:**  First in First Out data structure

## Challenge
<!-- Description of the challenge -->
1. Create a Node class that has properties for the value stored in the Node, and a pointer to the next node.  

2. Create a Stack class that has a top property. It creates an empty Stack when instantiated.
    This object should be aware of a default empty value assigned to top when the stack is created.  
    Define a method called push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.  
    Define a method called pop that does not take any argument, removes the node from the top of the stack, and returns the node’s value.  
    Define a method called peek that does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.  
    Define a method called isEmpty that does not take an argument, and returns a boolean indicating whether or not the stack is empty.  
  
3. Create a Queue class that has a front property. It creates an empty Queue when instantiated.    
    This object should be aware of a default empty value assigned to front when the queue is created.  
    Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.  
    Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.  
    Define a method called peek that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.  
    Define a method called isEmpty that does not take an argument, and returns a boolean indicating whether or not the queue is empty.  
  
4. Any exceptions or errors that come from your code should be semantic, capturable errors. For example, rather than a default error thrown by your language, your code should raise/throw a custom, semantic error that describes what went wrong in calling the methods you wrote for this lab.    
5. Be sure to follow your languages best practices for naming conventions.  

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
 **Stack:**  
 - All Stack operations (push, pop, peek, isEmpty) are Big O(1) because all values can be accessed directly and do not require iteration.  To achieve this I created a *top* node which has access to the first manipulatable value.  
 
 **Queue:**  
 - All Queue operations (enqueu, dequeue, peek, isEmpty) are Big O(1) because all values can be accessed directly and do not require iteration.  To achieve this I created a *front* and *back* nodes which has access to the applicable manipulatable value.
 
 
## API
<!-- Description of each method publicly available to your Stack and Queue-->
 **Stack:**  
 - *push(E val)* : Creates a new Node with val and adds to stop of Stack  
 - *pop()* : Removes current Node from top of Stack and returns that node's value  
 - *peek()* : Returns current Node's value from the top of the Stack  
 - *isEmpty()* : Returns boolean value for if the Stack has Nodes  
 - *toString()* : Returns a String representing the Stack's Node values  

 ---

 **Queue:**  
 - *enqueue(E val)* : Creates a new Node with val and adds to back of Queue  
 - *dequeue()* : Removes current Node from front of Queue and returns that node's value  
 - *peek()* : Returns current Node's value from the front of the Queue  
 - *isEmpty()* : Returns boolean value for if the Queue has Nodes  
 - *toString()* : Returns a String representing the Queue's Node values 
