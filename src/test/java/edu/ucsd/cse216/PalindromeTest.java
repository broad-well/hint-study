// package edu.ucsd.cse216;

// import static org.junit.jupiter.api.Assertions.assertFalse;
// import static org.junit.jupiter.api.Assertions.assertTrue;

// import org.junit.jupiter.api.Test;

// public class PalindromeTest {
//     private Palindrome sol = new Palindrome();

//     @Test
//     public void testBasicCases() {
//         assertTrue(sol.isPalindrome("abba"));
//     }

//     @Test
//     public void testCaseInsensitivity() {
//         assertTrue(sol.isPalindrome("RaceCar"));
//         assertTrue(sol.isPalindrome("AToyota"));
//         assertFalse(sol.isPalindrome("HelloWorld"));
//     }

//     @Test
//     public void testSingleCharacter() {
//         assertTrue(sol.isPalindrome("a"));
//         assertTrue(sol.isPalindrome("Z"));
//     }

//     @Test
//     public void testEmptyString() {
//         assertTrue(sol.isPalindrome(""));
//     }

//     @Test
//     public void testLongStrings() {
//         assertTrue(sol.isPalindrome("abccbaabccbaabccba"));
//         StringBuilder longString = new StringBuilder();
//         for (int i = 0; i < 100; ++i) {
//             longString.append("abcdefghij");
//         }
//         assertFalse(sol.isPalindrome(longString.toString()));
//     }

//     @Test
//     public void testSpecialPatterns() {
//         assertTrue(sol.isPalindrome("aaaaaa"));
//         assertFalse(sol.isPalindrome("abababab"));
//         assertTrue(sol.isPalindrome("abcddcba"));
//     }

//     @Test
//     public void testNonSequentialRepeatingCharacters() {
//         assertFalse(sol.isPalindrome("abab"));
//         assertFalse(sol.isPalindrome("abcdecba"));
//     }

//     @Test
//     public void testComplexPalindromes() {
//         assertTrue(sol.isPalindrome("NoonnooN"));
//         assertTrue(sol.isPalindrome("Redivider"));
//     }
// }