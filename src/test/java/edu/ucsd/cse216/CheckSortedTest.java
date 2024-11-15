// package edu.ucsd.cse216;

// import static org.junit.jupiter.api.Assertions.assertFalse;
// import static org.junit.jupiter.api.Assertions.assertTrue;

// import java.util.stream.IntStream;
// import java.util.Collections;
// import org.junit.jupiter.api.Test;

// public class CheckSortedTest {
//     private CheckSorted sol = new CheckSorted();

//     @Test
//     public void testBasicCases() {
//         assertTrue(sol.isNonDecreasing(new int[]{1, 2, 3, 4, 5}));
//         assertTrue(sol.isNonDecreasing(new int[]{1, 2, 2, 3, 4}));
//         assertFalse(sol.isNonDecreasing(new int[]{5, 4, 3, 2, 1}));
//     }

//     @Test
//     public void testSingleElementAndEmptyArray() {
//         assertTrue(sol.isNonDecreasing(new int[]{3}));
//     }

//     @Test
//     public void testAllElementsSame() {
//         assertTrue(sol.isNonDecreasing(new int[]{7, 7, 7, 7}));
//     }

//     @Test
//     public void testEdgeCasesWithTwoElements() {
//         assertTrue(sol.isNonDecreasing(new int[]{1, 2}));
//         assertFalse(sol.isNonDecreasing(new int[]{2, 1}));
//         assertTrue(sol.isNonDecreasing(new int[]{5, 5}));
//     }

//     @Test
//     public void testLongerArraysWithPatterns() {
//         assertFalse(sol.isNonDecreasing(new int[]{1, 2, 3, 5, 4}));
//         assertFalse(sol.isNonDecreasing(new int[]{5, 4, 3, 2, 3}));
//         assertFalse(sol.isNonDecreasing(new int[]{1, 2, 4, 3, 5, 6}));
//     }

//     @Test
//     public void testLargeInputSizes() {
//         assertTrue(sol.isNonDecreasing(IntStream.range(0, 1000).toArray()));
//         assertFalse(sol.isNonDecreasing(IntStream.iterate(1000, (s) -> s - 1).limit(1000).toArray()));
//     }

//     @Test
//     public void testAlternatingPatterns() {
//         assertFalse(sol.isNonDecreasing(new int[]{1, 2, 1, 2, 1}));
//         assertTrue(sol.isNonDecreasing(new int[]{1, 1, 2, 2, 3, 3}));
//     }

//     @Test
//     public void testNegativeAndPositiveIntegers() {
//         assertTrue(sol.isNonDecreasing(new int[]{-5, -3, -1, 0}));
//         assertTrue(sol.isNonDecreasing(new int[]{-3, -1, 0, 1, 2}));
//         assertFalse(sol.isNonDecreasing(new int[]{-3, -1, 2, 1, 4}));
//     }
// }
