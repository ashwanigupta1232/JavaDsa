package com.leetcode150;

public class FindSubstring {

    public static int findSubstring(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        int hLen = haystack.length();
        int nLen = needle.length();

        for (int i = 0; i <= hLen - nLen; i++) {
            int j = 0;
            while (j < nLen && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == nLen) return i;
        }
        return -1; // not found
    }
//////////////////////

    public static void main(String[] args) {
        String haystack = "hello world";
        String needle = "world";
        System.out.println(findSubstring(haystack, needle));

    }
}
