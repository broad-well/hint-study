package edu.ucsd.cse216;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwoLargestTest {
    private final PrintStream origOut = System.out;
    private final ByteArrayOutputStream captOut = new ByteArrayOutputStream();
    private TwoLargest sol = new TwoLargest();

    @BeforeEach
    void captureStdOut() {
        System.setOut(new PrintStream(captOut));
    }

    @AfterEach
    void restoreStdOut() {
        System.setOut(origOut);
    }

    @Test
    void twoLargestElementsInMatrix() {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        sol.twoLargest(matrix);
        assertEquals("9\n8\n", captOut.toString());
    }

    @Test
    void twoLargestElementsInSingleRowMatrix() {
        int[][] matrix = {
            {10, 20, 30, 40}
        };
        sol.twoLargest(matrix);
        assertEquals("40\n30\n", captOut.toString());
    }

    @Test
    void twoLargestElementsInSingleColumnMatrix() {
        int[][] matrix = {
            {3},
            {7},
            {5}
        };
        sol.twoLargest(matrix);
        assertEquals("7\n5\n", captOut.toString());
    }

    @Test
    void singleElementMatrix() {
        int[][] matrix = {
            {100}
        };
        sol.twoLargest(matrix);
        assertEquals("100\n-1\n", captOut.toString());
    }

    @Test
    void emptyMatrix() {
        int[][] matrix = {};
        sol.twoLargest(matrix);
        assertEquals("No elements\n", captOut.toString());
    }

    @Test
    void matrixWithEmptyRow() {
        int[][] matrix = {{}};
        sol.twoLargest(matrix);
        assertEquals("No elements\n", captOut.toString());
    }

    @Test
    void twoLargestElementsInUniformMatrix() {
        int[][] matrix = {
            {4, 4, 4},
            {4, 4, 4}
        };
        sol.twoLargest(matrix);
        assertEquals("4\n4\n", captOut.toString());
    }

    @Test
    void twoLargestElementsInMixedMatrix() {
        int[][] matrix = {
            {5, 2, 8, 4},
            {3, 7, 9, 1}
        };
        sol.twoLargest(matrix);
        assertEquals("9\n8\n", captOut.toString());
    }

    @Test
    void twoLargestElementsInLargeValuesMatrix() {
        int[][] matrix = {
            {1000, 2000},
            {3000, 4000}
        };
        sol.twoLargest(matrix);
        assertEquals("4000\n3000\n", captOut.toString());
    }

}
