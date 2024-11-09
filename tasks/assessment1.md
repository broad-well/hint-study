# Palindrome Checker

Write a program that checks if a string forms a palindrome. A palindrome is a sequence that reads the same forward and backward. The check should be case-insensitive (meaning `"Racecar"` and `"raceCAR"` are palindromes, despite differences in capitalization).

**Input**: A string `s` of size `n` (1 ≤ n ≤ 1000). You may assume the string will only contain alphabetic characters (i.e. it has no spaces or numbers)

**Output**: Return `true` if the string forms a palindrome, ignoring case and non-alphabetic characters; otherwise, return `false`.

**Example 1**:
- Input: `"AToyota"`
- Output: `true`
- Explanation: "AToyota" is a palindrome

**Example 2**:
- Input: `"raceacar"`
- Output: `false`
- Explanation: "raceacar" is not a palindrome

**Example 3**:
- Input: `"h"`
- Output: `true`
- Explanation: Every single character remains unchanged when read forward vs. backward

Please write your solution in [Palindrome.java](../src/main/java/edu/ucsd/cse216/Palindrome.java).