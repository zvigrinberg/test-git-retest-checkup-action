package com.redhat.zgrinber;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromesAnagramsTest {

    private PalindromesAnagrams palindromesAnagrams;
    @BeforeEach
    public void setupTests()
    {
        palindromesAnagrams = new PalindromesAnagrams();
    }

    @Test
    void test_is_PalindromeAndAnagram() {
        assertTrue(palindromesAnagrams.isPalindromeAndPalindromeAnagram("abba"));
        assertFalse(palindromesAnagrams.isPalindromeAndPalindromeAnagram("aabb"));
    }

    @Test
    public void TestisPalindromeAnagram() {
        assertTrue(palindromesAnagrams.isPalindromeAnagram("aabb"));
        assertTrue(palindromesAnagrams.isPalindromeAnagram("aabbb"));
        assertFalse(palindromesAnagrams.isPalindromeAnagram("aabbbccc"));
        assertTrue(palindromesAnagrams.isPalindromeAnagram("aabbbcc"));
        assertFalse(palindromesAnagrams.isPalindromeAnagram("aaabbb"));
        assertFalse(palindromesAnagrams.isPalindromeAnagram("199244593"));


    }

}