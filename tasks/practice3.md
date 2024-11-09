# String Compress

You are given a String `s`, which must be compressed such that when a unique character is encountered, any consecutive repeating characters after it are replaced with the number of repetitions of that character. If the compressed string is not shorter than the original, just return the original string.

**Input**: A String `s` (1 ≤ `s.length` ≤ 1000). You may assume all characters in `s` are lowercase letters.

**Output**: The compressed string or the original string if compression doesn't reduce its length.

**Example 1**:
- Input: `"aabcccccaaa"`
- Output: `"a2b1c5a3"`

**Example 2**:
- Input: `"abc"`
- Output: `"abc"`

Please write your solution in [StringCompress.java](../src/main/java/edu/ucsd/cse216/StringCompress.java).