# Singly Linked List
<!-- Short summary or background information -->


## Challenge
Within your LinkedList class, include a head property. Upon instantiation, an empty Linked List should be created.
Define a method called **insert** which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.
Define a method called **includes** which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
Define a method called **toString** which takes in no arguments and returns a string representing all the values in the Linked List, formatted as:
"{ a } -> { b } -> { c } -> NULL"
Any exceptions or errors that come from your code should be semantic, capturable errors. For example, rather than a default error thrown by your language, your code should raise/throw a custom, semantic error that describes what went wrong in calling the methods you wrote for this lab.
Be sure to follow your language/frameworks standard naming conventions (e.g. C# uses PascalCasing for all method and class names).

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Method insert   : Time - O(1) / Space - O(1)

Method includes : Time - O(n) / Space - O(1)

Method getSize  : Time - O(1) / Space - O(1)

Method toArray  : Time - O(n) / Space - O(n)

Method toString : Time - O(n) / Space - O(n)

## API
<!-- Description of each method publicly available to your Linked List -->
Method insert     : Takes in a value of any type.  Assigns value to a new Node and inserts that node at the head of the Linked List

Method includes   : Takes in a value of any type.  Iterates throughout linked list until a match is found.  If input value exists in linked list, return true.  Otherwise returns false.

Method getSize    : Returns the amount of nodes currently in Linked List

Method toArray()  : Returns an array of all the values in the Linked List

Method toString() : Returns a String representation of the Linked List

