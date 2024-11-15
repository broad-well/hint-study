// package edu.ucsd.cse216;

// import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// import org.junit.jupiter.api.Test;

// public class MergeArraysTest {
//     private MergeArrays sol = new MergeArrays();

//     @Test
//     void nonEmptyNoOverlap() {
//         assertArrayEquals(
//             new int[]{1, 2, 3, 4, 5, 6},
//             sol.mergeArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6})
//         );
//     }

//     @Test
//     void oneArrayIsEmpty() {
//         assertArrayEquals(
//             new int[]{0, 2},
//             sol.mergeArrays(new int[]{0, 2}, new int[]{})
//         );
//     }

//     @Test
//     void bothArraysAreEmpty() {
//         assertArrayEquals(
//             new int[]{},
//             sol.mergeArrays(new int[]{}, new int[]{})
//         );
//     }

//     @Test
//     void arraysOfDifferentLengthsNoOverlap() {
//         assertArrayEquals(
//             new int[]{1, 2, 3, 4, 5, 7},
//             sol.mergeArrays(new int[]{1, 3, 5, 7}, new int[]{2, 4})
//         );
//     }

//     @Test
//     void arraysOfDifferentLengthsOneFullySmaller() {
//         assertArrayEquals(
//             new int[]{1, 2, 3, 10, 11, 12},
//             sol.mergeArrays(new int[]{1, 2, 3}, new int[]{10, 11, 12})
//         );
//     }

//     @Test
//     void arraysWithDuplicateValues() {
//         assertArrayEquals(
//             new int[]{1, 2, 3, 5, 5, 5, 6},
//             sol.mergeArrays(new int[]{1, 3, 5, 5}, new int[]{2, 5, 6})
//         );
//     }

//     @Test
//     void arraysWithIdenticalValues() {
//         assertArrayEquals(
//             new int[]{3, 3, 3, 3, 3, 3},
//             sol.mergeArrays(new int[]{3, 3, 3}, new int[]{3, 3, 3})
//         );
//     }

//     @Test
//     void singleElementInEachArray() {
//         assertArrayEquals(
//             new int[]{1, 2},
//             sol.mergeArrays(new int[]{1}, new int[]{2})
//         );
//     }

//     @Test
//     void singleElementInOneArrayMultipleInOther() {
//         assertArrayEquals(
//             new int[]{1, 2, 3, 4},
//             sol.mergeArrays(new int[]{1}, new int[]{2, 3, 4})
//         );
//     }

//     @Test
//     void negativeAndPositiveValues() {
//         assertArrayEquals(
//             new int[]{-5, -3, -1, 1, 3, 5},
//             sol.mergeArrays(new int[]{-5, -3, -1}, new int[]{1, 3, 5})
//         );
//     }

//     @Test
//     void arraysWithAllElementsTheSameInOneArray() {
//         assertArrayEquals(
//             new int[]{1, 2, 2, 2, 3, 4},
//             sol.mergeArrays(new int[]{2, 2, 2}, new int[]{1, 3, 4})
//         );
//     }

//     @Test
//     void arraysWithZeroIncluded() {
//         assertArrayEquals(
//             new int[]{-2, -1, 0, 1, 2, 3},
//             sol.mergeArrays(new int[]{-2, 0, 2}, new int[]{-1, 1, 3})
//         );
//     }

//     @Test
//     void bothArraysContainLargeElements() {
//         assertArrayEquals(
//             new int[]{1000, 1500, 2000, 2500, 3000, 3500},
//             sol.mergeArrays(new int[]{1000, 2000, 3000}, new int[]{1500, 2500, 3500})
//         );
//     }
// }
