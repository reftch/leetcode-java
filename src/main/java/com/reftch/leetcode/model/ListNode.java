package com.reftch.leetcode.model;

import java.util.Objects;

/**
 * LeetCode definition for singly-linked list.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode of(int... values) {
        if (values == null || values.length == 0) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for (int v : values) {
            cur.next = new ListNode(v);
            cur = cur.next;
        }
        return dummy.next;
    }

    public int[] toArray() {
        int size = 0;
        for (ListNode n = this; n != null; n = n.next) size++;
        int[] arr = new int[size];
        int i = 0;
        for (ListNode n = this; n != null; n = n.next) arr[i++] = n.val;
        return arr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListNode other)) return false;
        ListNode a = this;
        ListNode b = other;
        while (a != null && b != null) {
            if (a.val != b.val) return false;
            a = a.next;
            b = b.next;
        }
        return a == null && b == null;
    }

    @Override
    public int hashCode() {
        int h = 1;
        for (ListNode n = this; n != null; n = n.next) {
            h = 31 * h + n.val;
        }
        return h;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (ListNode n = this; n != null; n = n.next) {
            if (sb.length() > 1) sb.append(",");
            sb.append(n.val);
        }
        sb.append("]");
        return sb.toString();
    }
}
