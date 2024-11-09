# Merge Sorted Arrays

You are given two integer arrays sorted in ascending order. Write a program to merge their contents into a single sorted array. You are NOT allowed to use any standard sorting function (ex: `Arrays.sort()`) in your solution.

**Input**: Two sorted integer arrays `arr1[]` of size `n` and `arr2[]` of size `m` (0 ≤ n, m ≤ 1000).<br>
Note m and n may NOT necessarily be the same length.

**Output**: Return the merged sorted array.

**Example 1**:
- Input: `arr1 = [1, 3, 5]`, `arr2 = [2, 4, 6]`
- Output: `[1, 2, 3, 4, 5, 6]`

**Example 2**:
- Input: `arr1 = [0, 2]`, `arr2 = []`
- Output: `[0, 2]`

Please write your solution in [MergeArrays.java](../src/main/java/edu/ucsd/cse216/MergeArrays.java).