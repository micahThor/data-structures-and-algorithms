# Hashtables

# Code Challenge 30 - HashTable Implementation
<!-- Short summary or background information -->
A hashtable can utilizes a key/value pair paradigm to store data in a single collection.  Values are stored in a hashtable according to their corresponding key values.  The key value are hashed into an integer value that represents an index in the underlying array structure.

## Challenge
<!-- Description of the challenge -->
Implement a Hashtable capable of adding, getting, and checking if a key exists in the hashtable.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
My approach includes using an ArrayList as the underlying collection.  Within each element there is the potential for a chain of nodes.  Each node contains the key/value data as well as a pointer to the next node.  This safegaurds the hashtable against collisions.

| Method | Big O time | Big O space
| ----------- | ----------- | ----------- |
| add | O(n) | O(n)
| get |  O(1) to O(c)* | O(1) 
| contains |  O(1) | O(1) 

* Where 'c' represents the nodes in a particular element chain

## API
<!-- Description of each method publicly available in each of your hashtable -->
**add**:      takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.  
**get**:      takes in the key and returns the value from the table.  
**contains**: takes in the key and returns a boolean, indicating if the key exists in the table already.  
**hash**:     takes in an arbitrary key and returns an index in the collection.    

----

# Challenge Summary - Code Challenge 32 18 FEB 2020
<!-- Short summary or background information -->
Utilize my HashTable implementation, create a method that will return the first repeated word in a long paragraph of words.

## Challenge Description
<!-- Description of the challenge -->
-Write a function that accepts a lengthy string parameter.  
-Without utilizing any of the built-in library methods available to your language, return the first word to occur more than once in that provided string.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
My approach involves creating an array of words from the input String.  Then I will iterate through the array, checking to see if that word is already in my hashtable.  If it is in my hashtable, I return that String.  Otherwise I add it to the hashtable and continue iterating.

| Method | Big O time | Big O space
| ----------- | ----------- | ----------- |
| getRepeated | O(n) | O(n)

## Solution
<!-- Embedded whiteboard image -->
![Whiteboard for code challenge 32](https://github.com/micahThor/data-structures-and-algorithms/blob/master/assets/repeated%20word.jpg)

----

# Challenge Summary - Code Challenge 33 19 FEB 2020
<!-- Short summary or background information -->
Utilize my HashTable implementation, create a method that will return the shared values between two binary search trees.

## Challenge Description
<!-- Description of the challenge -->
-Write a function called tree_intersection that takes two binary tree parameters.
-Without utilizing any of the built-in library methods available to your language, return a set of values found in both trees.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
My approach is to recurse over the first tree, adding all values to the hashtable.  Then I recurse over the second tree, checking if the value is contained within hashtable.  If in hashtable, add to result array.  Then return that array.

| Method | Big O time | Big O space
| ----------- | ----------- | ----------- |
| treeIntersection | O(n) | O(n)

## Solution
<!-- Embedded whiteboard image -->
![Whiteboard for code challenge 33](https://github.com/micahThor/data-structures-and-algorithms/blob/master/assets/tree%20Intersection.jpg)
