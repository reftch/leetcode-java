package com.reftch.leetcode.solutions;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Tests LeetCode 1. Two Sum (instance method).
 */
class TwoSumSolutionTest {

    private final TwoSumSolution solution = new TwoSumSolution();

    @Test
    @DisplayName("twoSum: basic case [2,7,11,15] target 9 -> [0,1]")
    void twoSum_basicCase() {
        int[] result = solution.twoSum(new int[] { 2, 7, 11, 15 }, 9);
        assertThat(result).containsExactly(0, 1);
    }

    @Test
    @DisplayName("twoSum: with duplicates [3,3] target 6 -> [0,1]")
    void twoSum_withDuplicates() {
        int[] result = solution.twoSum(new int[] { 3, 3 }, 6);
        assertThat(result).containsExactly(0, 1);
    }

    @Test
    @DisplayName("twoSum: negative numbers")
    void twoSum_negativeNumbers() {
        int[] result = solution.twoSum(new int[] { -1, -2, -3, -4, -5 }, -8);
        assertThat(result).containsExactly(2, 4);
    }

    @Test
    @DisplayName("twoSum: throws when no solution exists")
    void twoSum_noSolution() {
        assertThatThrownBy(() -> solution.twoSum(new int[] { 1, 2, 3 }, 10))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
