package com.reftch.leetcode.solutions;

/**
 * LeetCode 9. Palindrome Number
 *
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 *
 * Example 1:
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 *
 * Example 2:
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it
 * becomes 121-. Therefore it is not a palindrome.
 *
 * Example 3:
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a
 * palindrome.
 */
public final class PalindromeNumberSolution {

    public boolean isPalindrome(int x) {
        // Single digit numbers (0-9) are always palindromes
        if (x >= 0 && x < 10)
            return true;

        // Negative numbers and numbers ending in 0 (except 0 itself) cannot be
        // palindromes
        if (x < 0 || x % 10 == 0)
            return false;

        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = (reversedHalf * 10) + (x % 10);
            x /= 10;
        }

        return (x == reversedHalf) || (x == reversedHalf / 10);
    }
}
