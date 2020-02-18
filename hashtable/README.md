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
| Header | Title |
| Paragraph | Text |

## API
<!-- Description of each method publicly available in each of your hashtable -->
**add**:      takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
**get**:      takes in the key and returns the value from the table.
**contains**: takes in the key and returns a boolean, indicating if the key exists in the table already.
**hash**:     takes in an arbitrary key and returns an index in the collection.
