# Challenge Summary - Code Challenge 1 on Jan 6. 

Given an array of integers, write a method that will reverse the order of the integers.

## Approach & Efficiency
I believe that my method is O(n) time because I have to visit each element with every swap.  

## Solution
1. Given an array, create two integer variables that represent the beginning and the end of the array.  

2. As you iterate through the array, swap the indexes of the beginning and the end values.  With each iteration, increase the beginning value variable and decrease the end value variable.

3. Return the same input array.


![](https://github.com/micahThor/data-structures-and-algorithms/blob/master/assets/array-reversed.jpg)

## Feature Tasks
-[x] Write a function called reverseArray which takes an array as an argument. Without utilizing any of the built-in methods available to your language, return an array with elements in reversed order.


---
---
---

# Challenge Summary- Code Challenge 2 on Jan 7. 
1. Given an array of integers as input, insert integer input at the center of the array.  Return that array.

2. Create test cases to test method.  Use an even and odd lengthed array.

## Challenge Description
Write a function called insertShiftArray which takes in an array and the value to be added. Without utilizing any of the built-in methods available to your language, return an array with the new value added at the middle index. 

## Approach & Efficiency
In this method I start by getting the element position (at center) for the input integer.  If the array length is odd, I add one value to this position.  Then I create a new array to store my data with a length one greater than input array length.  

As I iterate through my input array, I want to add values in the order that they came in.  I first add all elements that exist before my new position value.  Then I add my input integer at the position value.  Then I populate the rest of the array with everything that exists beyond the position value.

Then that new array is returned with the input integer inserted into the center of the array.

## Solution
![](https://github.com/micahThor/data-structures-and-algorithms/blob/master/assets/Array-Shift.JPG)
---
---
---

# Challenge Summary- Code Challenge 3 on Jan 8. 
Implement a binary search capable of O(log n) time complexity.

## Challenge Description
Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. Without utilizing any of the built-in methods available to your language, return the index of the array’s element that is equal to the search key, or -1 if the element does not exist.

Use Junit tests to ensure quality code.

## Approach & Efficiency
In my whiteboarding session with Ellen, we realized that we could keep track of the search range that represented a halved portion of the input array.  We decided that our while loop depeneded upon these two values never converging.  Overall our whiteboard solution was close, and helped tremendously as I implemented my own solution,

In my solution I kept track of the head, middle, and tail indexes of the search range.  The middle target seeks to match the key value.  If the middle index matches the key, return that index value.  If the middle target is less or greater than the key, the head and tail indexes of the search range adjust accordingly.  I ensured that even and odd arrays are compatible with this method by adjusting the midpoint value.  If the middle index never matches the key, the method returns negative one.

## Solution
![](https://github.com/micahThor/data-structures-and-algorithms/blob/master/assets/binarySearch.jpg)
