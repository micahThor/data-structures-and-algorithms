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
