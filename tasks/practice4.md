# Two Largest Numbers

Write a program that takes a 2D nonnegative integer array of `m` rows and `n` columns, printing the largest and second largest elements in the array. If there is only one element in the 2D array, print that element and print the second largest element as -1. If there are no elements in the 2D array, print a message stating there are no elements.

**Input**: A 2D integer array `arr[][]` with `m` rows and `n` columns. `m` and `n` may not necessarily be the same. Assume any element in `arr` is at least 0.

**Output**: Print the largest and second-largest integer in the 2D array. If the array has only one element, print the second element as -1. If the array has no elements, print "No elements".

**Example 1**:
- Input: `[[1, 2, 3], [4, 5, 6], [7, 8, 9]]`
- Output:
```
9
8
```

**Example 2**:
- Input: `[[]]`
- Output: `No elements`

Please write your solution in [TwoLargest.java](../src/main/java/edu/ucsd/cse216/TwoLargest.java).