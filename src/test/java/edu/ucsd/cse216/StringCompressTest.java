package edu.ucsd.cse216;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringCompressTest {
    private StringCompress sol = new StringCompress();

    @Test
    void basicCompressionWithRepeatedCharacters() {
        assertEquals("a2b1c5a3", sol.compress("aabcccccaaa"));
    }

    @Test
    void stringWhereCompressionDoesNotReduceLength() {
        assertEquals("abc", sol.compress("abc"));
    }

    @Test
    void singleCharacterString() {
        assertEquals("a", sol.compress("a"));
    }

    @Test
    void stringWithAllCharactersTheSame() {
        assertEquals("a5", sol.compress("aaaaa"));
    }

    @Test
    void alternatingCharactersThatCannotBeCompressedEffectively() {
        assertEquals("abababab", sol.compress("abababab"));
    }

    @Test
    void twoConsecutiveRepeatingCharacters() {
        assertEquals("aa", sol.compress("aa"));
    }

    @Test
    void stringWithMixedRepeatingAndUniqueCharacters() {
        assertEquals("a2b2c2d2e3", sol.compress("aabbccddeee"));
    }

    @Test
    void stringWithSingleRepetitionsOfMultipleCharacters() {
        assertEquals("abcdef", sol.compress("abcdef"));
    }

    @Test
    void longerSequenceOfRepeatedCharactersThatShouldBeCompressed() {
        assertEquals("z16", sol.compress("zzzzzzzzzzzzzzzz"));
    }

    @Test
    void stringWithDifferentConsecutiveRepeatingCharacters() {
        assertEquals("a2b3a3", sol.compress("aabbbaaa"));
    }

    @Test
    void stringWithAVeryLargeRepeatingCharacterCount() {
        assertEquals("a1000", sol.compress("a".repeat(1000)));  // Edge case with 1000 'a' characters
    }

    @Test
    void stringWhereOneSegmentCompressedLengthEqualsTheSegmentItself() {
        assertEquals("a2b2c4", sol.compress("aabbcccc"));
    }
}
