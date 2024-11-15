// package edu.ucsd.cse216;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// public class RemoveDuplicatesTest {
//     private RemoveDuplicates sol = new RemoveDuplicates();

//     @Test
//     void simpleDuplicates() {
//         assertEquals("helo", sol.removeDups("hello"));
//         assertEquals("ban", sol.removeDups("banana"));
//     }

//     @Test
//     void noDuplicates() {
//         assertEquals("abc", sol.removeDups("abc"));
//         assertEquals("arqcze", sol.removeDups("arqcze"));
//     }

//     @Test
//     void allUniqueCharacters() {
//         assertEquals(
//             "abcdefghijklmnopqrstuvwxyz",
//             sol.removeDups("abcdefghijklmnopqrstuvwxyz")
//         );
//     }

//     @Test
//     void oneTypeRepeated() {
//         assertEquals("a", sol.removeDups("aaaaa"));
//         assertEquals("b", sol.removeDups("bb"));
//     }

//     @Test
//     void singleCharacter() {
//         assertEquals("a", sol.removeDups("a"));
//         assertEquals("b", sol.removeDups("b"));
//     }

//     @Test
//     void emptyInput() {
//         assertEquals("", sol.removeDups(""));
//     }

//     @Test
//     void longInputRepetitive() {
//         assertEquals("ab", sol.removeDups("ababababababababab"));
//         assertEquals("abcd", sol.removeDups("abcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcd"));
//     }

//     @Test
//     void sequentialDuplicates() {
//         assertEquals("abcd", sol.removeDups("aabbccdd"));
//     }

//     @Test
//     void alternatingCharacters() {
//         assertEquals("ab", sol.removeDups("abababab"));
//     }

//     @Test
//     void palindromes() {
//         assertEquals("race", sol.removeDups("racecar"));
//         assertEquals("lev", sol.removeDups("level"));
//     }

//     @Test
//     void nonSequentialDuplicates() {
//         assertEquals("abcd", sol.removeDups("abacabadabacaba"));
//     }
// }
