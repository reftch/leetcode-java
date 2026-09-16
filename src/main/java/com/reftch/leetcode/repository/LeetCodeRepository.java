package com.reftch.leetcode.repository;

import com.reftch.leetcode.model.ListNode;

/**
 * Repository providing typed methods for LeetCode solutions.
 * Each method corresponds to a LeetCode problem and delegates to
 * a dedicated solution class in {@code com.reftch.leetcode.solutions}.
 *
 * <p>Usage:</p>
 * <pre>{@code
 * LeetCodeRepository repo = new InMemoryLeetCodeRepository();
 * int[] indices = repo.twoSum(new int[]{2,7,11,15}, 9);
 * }</pre>
 */
public interface LeetCodeRepository {

    /**
     * LeetCode 1. Two Sum
     * @return indices of the two numbers such that they add up to target
     */
    int[] twoSum(int[] nums, int target);

    /**
     * LeetCode 7. Reverse Integer
     * @return reversed integer, or 0 on overflow
     */
    int reverseInteger(int x);

    /**
     * LeetCode 9. Palindrome Number
     */
    boolean isPalindrome(int x);

    /**
     * LeetCode 14. Longest Common Prefix
     */
    String longestCommonPrefix(String[] strs);

    /**
     * LeetCode 20. Valid Parentheses
     */
    boolean isValidParentheses(String s);

    /**
     * LeetCode 21. Merge Two Sorted Lists
     */
    ListNode mergeTwoSortedLists(ListNode list1, ListNode list2);
}
