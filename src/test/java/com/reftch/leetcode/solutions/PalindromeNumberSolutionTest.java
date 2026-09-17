package com.reftch.leetcode.solutions;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Tests for LeetCode PalindromeNumberSolution.
 */
class PalindromeNumberSolutionTest {

    private final PalindromeNumberSolution solution = new PalindromeNumberSolution();

    @Test
    @DisplayName("PalindromeNumber: TODO")
    void isPalindrome_test() {
        assertThat(solution.isPalindrome(121)).isTrue();
        assertThat(solution.isPalindrome(-121)).isFalse();
        assertThat(solution.isPalindrome(10)).isFalse();
        assertThat(solution.isPalindrome(1456541)).isTrue();
    }
}
