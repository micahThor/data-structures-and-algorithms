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
enqueue(animal): adds animal to the shelter. animal can be either a dog or a cat object.  
dequeue(pref): returns either a dog or a cat. If pref is not "dog" or "cat" then return null.
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
