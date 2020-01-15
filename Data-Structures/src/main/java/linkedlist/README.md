# Code Challenge Summary - Code Challenge 6 on Jan 13. 

Extend the current Linked List implementation to include these three insert methods

## Approach & Efficiency
I believe that my methods are O(n) because my insertions require a current link list traversal to insert new nodes.  In the best cases of my insertBefore and insertAfter, my methods are O(1) if the first value is the target value, and worst, O(n) if the target value isn't in the linked list.  My append method will be O(n) because I need to find the end of the linked list to add the new node. 

## Solution
.append:

    Get the current head node and traverse through linked list while current.next doesn't equal null.
    Set the current.next to the new node.
.insertBefore:

    Get the current head node and traverse through linked list while current.next doesn't equal null.
    If the input value equals the current.next value, then insert new node.
    Set new node.next to current node.next.
    Set current node.next to new Node.
.insertAfter

    Get the current head node and traverse through linked list while current.next doesn't equal null.
    If the input value equals the current value, then insert new node.
    Set new node.next to current node.next.
    Set current node.next to new Node.


## Feature Tasks
-- .append(value) which adds a new node with the given value to the end of the list

-- .insertBefore(value, newVal) which add a new node with the given newValue immediately before the first value node

-- .insertAfter(value, newVal) which add a new node with the given newValue immediately after the first value node

![](https://github.com/micahThor/data-structures-and-algorithms/blob/master/assets/threeLLinsert.jpg)
---
---
---
---
---


# LAB 05 - JAN 13 2019

## Singly Linked List
Create a singly linked list capable of O(1) insertions.  


## Challenge
Within your LinkedList class, include a head property. Upon instantiation, an empty Linked List should be created.

Define a method called **insert** which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.

Define a method called **includes** which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.

Define a method called **toString** which takes in no arguments and returns a string representing all the values in the Linked List, formatted as:
"{ a } -> { b } -> { c } -> NULL"

Any exceptions or errors that come from your code should be semantic, capturable errors. For example, rather than a default error thrown by your language, your code should raise/throw a custom, semantic error that describes what went wrong in calling the methods you wrote for this lab.

## Approach & Efficiency

LinkedList class :  Class contains a reference to a head Node and a static size counter.  Every inserted value is inserted into the head of the linked list.

Node Class       :  Class contains a reference to the Node value and the Node's next Node.

insert   : Time - O(1) / Space - O(1)

includes : Time - O(n) / Space - O(1)

getSize  : Time - O(1) / Space - O(1)

toArray  : Time - O(n) / Space - O(n)

toString : Time - O(n) / Space - O(n)

## API
<!-- Description of each method publicly available to your Linked List -->
insert     : Takes in a value of any type.  Assigns value to a new Node and inserts that node at the head of the Linked List

includes   : Takes in a value of any type.  Iterates throughout linked list until a match is found.  If input value exists in linked list, return true.  Otherwise returns false.

getSize    : Returns the amount of nodes currently in Linked List

toArray    : Returns an array of all the values in the Linked List

toString   : Returns a String representation of the Linked List

![](https://github.com/micahThor/data-structures-and-algorithms/blob/master/assets/code%20ch%207.jpg)

---
---
---
---
---

# Code Challenge Summary - Code Challenge 7 on Jan 14. 

Extend the current Linked List implementation to include a method capable of returning a node value from the end of the linked list specified by the kth value.

## Approach & Efficiency

During out whiteboarding session (Sergey and Josh) we decided to share the properties and methods available to all of our linked list projects.  We decided in the end that it would be prudent to find the length of our linked lists and use that value to be able to count backwards from the end of our lists.  Since I have a size method defined, I use that method to subtract from the input **k** value.  I can then iterate through my list with that value, decreasing that value with every iteration, until that value is greater than zero.  At the same time I have a Node initialized to head, and within the while loop, I set that node to the next node.  When the while loop breaks out, I am ready to return that Node's value.


## Solution

-- kthFromEnd(int k)
        Get target integer equal to the size of the linked list minus input k value minus 1
        
        If integer is less than 0 throw indexoutofboundsexception
        
        Set current node to head
        
        While target is greater than zero:
            set current to current.next
            decrement target counter
         
        return current node value

## Feature Tasks

-- kthFromEnd(int k) : returns the Node value of the Linked List at the kth location.  The kth location is specified by the amount of node's counting backwards from the end of the linked list.

![](https://github.com/micahThor/data-structures-and-algorithms/blob/master/assets/threeLLinsert.jpg)

---
---
---
---
---
