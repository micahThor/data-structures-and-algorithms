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
 
 ---
 ---
 
 # Code Challenge 11 - 20 JAN 2020
 ## Challenge Summary
<!-- Short summary or background information -->
Write a class that utilizes two stack data structures to imitate a queue data structure.

## Challenge Description
<!-- Description of the challenge -->
1. Create a brand new **PseudoQueue class**. Do not use an existing Queue. Instead, this PseudoQueue class will implement our standard queue interface (the two methods listed below), but will internally only utilize 2 Stack objects. Ensure that you create your class with the following methods:  

- **enqueue(value)** which inserts value into the PseudoQueue, using a first-in, first-out approach.  

- **dequeue()** which extracts a value from the PseudoQueue, using a first-in, first-out approach.
The Stack instances have only push, pop, and peek methods. You should use your own Stack implementation. Instantiate these Stack objects in your PseudoQueue constructor.  

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
- **enqueue(value)** : Time and Space are Big O(1).  Adding to my new class includes pushing the new element to the main stack.

- **dequeue()** : Time is Big O(1) and Space is Big O(n * n).  The time complexity is such that I have to make a pass thru main stack, popping values into the auxiliary stack.  Then I pop off the return value.  To return the main stack to its state, I have to make a pass thru auxiliary stack, popping values back into the main stack.  I then return the return value.  

## Solution
<!-- Embedded whiteboard image -->
[CLICK HERE TO SEE MY IMPLEMENTATION](https://github.com/micahThor/data-structures-and-algorithms/blob/master/stacksandqueues/src/main/java/stacksandqueues/PseudoQueue.java)
![](https://github.com/micahThor/data-structures-and-algorithms/blob/master/assets/Code%20challenge%2011.jpg)

---
---
# Code Challenge 12 - 21 JAN 2020
# Challenge Summary
<!-- Short summary or background information -->
Create a class AnimalShelter that maintains a queue of cats and dogs.    
Patrons of the shelter are able to state their preference for either cat or dog.   
The patrons preference will return the first type of that animal, and remove them from the shelter.

## Challenge Description
<!-- Description of the challenge -->
- Create a class called AnimalShelter which holds only dogs and cats. The shelter operates using a first-in, first-out approach.
- Implement the following methods:
```
enqueue(animal) : adds animal to the shelter. animal can be either a dog or a cat object.  
dequeue(pref)   : returns either a dog or a cat. If pref is not "dog" or "cat" then return null.
```

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I decided in my white boarding session that I will have to use a combination of two queues to maintain the order.    
Because I only have access to remove from the end of a queue, and since there is the potential for elements to be skipped over, I realized that I could use the auxiliary queue to maintain the order.  

```
Designate an Animal variable to null

My solution scans the queue for the preference
If the preference is found, that value is popped and assigned to designated variable
Else the element is added to auxiliary queue

The auxiliary queue is added back to the main queue.

Return the designated variable
```

## Solution
<!-- Embedded whiteboard image -->
![](https://github.com/micahThor/data-structures-and-algorithms/blob/master/assets/adoptedPets.jpg)

---
---
 
 # Code Challenge 13 - 22 JAN 2020
 ## Challenge Summary
<!-- Short summary or background information -->
Write a class MultiBracketValidation that is capable of returning true or false if an input string has correct brackets.    Correct bracket orientation includes:  
        1. For every bracket type ('()', '[]', '{}') there must be a corresponding opening and closing bracket.
        2. Order matters.  For every opening bracket, there must be an applicable closing bracket before encountering a differen type of closing bracket.

## Challenge Description
<!-- Description of the challenge -->
1.  Write a method *public static boolean multiBracketValidation(String input)*  
        Your function should take a string as its only argument, and should return a boolean representing whether or not the brackets in the string are balanced. There are 3 types of brackets:

        Round Brackets : ()
        Square Brackets : []
        Curly Brackets : {}

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
- My approach involved tracking two different queues.  One queue contained all opening brackets, and the other contained all closing brackets.  While iterating over the opening bracket queue, I attempt to find a closing bracket for every opening bracket.  If the queue's are empty at the end of the iteration, that means that every bracket found their match. Otherwise the input String does not contain valid brackets.


## Solution
<!-- Embedded whiteboard image -->
[CLICK HERE TO SEE MY IMPLEMENTATION](https://github.com/micahThor/data-structures-and-algorithms/blob/master/stacksandqueues/src/main/java/stacksandqueues/MultiBracketValidation.java)
![](https://github.com/micahThor/data-structures-and-algorithms/blob/master/assets/lab%2013%20brackets.jpg)
