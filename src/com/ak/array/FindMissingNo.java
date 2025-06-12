package com.ak.array;

public class FindMissingNo {
    public static void main(String[] args) {

                int[] ar = {2, 3, 5, 6};

                int max = Integer.MIN_VALUE;
                int sum = 0;

                for (int j : ar) {
                    sum += j;
                    if (j > max) {
                        max = j;
                    }
                }

                int expectedSum = (max * (max + 1)) / 2;
                int missingNo = expectedSum - sum;

                System.out.println("Missing number: " + missingNo); // Output: 1
            }
        }


