package com.esi;

public class LongestOnes {

    public static void main(String[] args) {
        int longestOnes = 2;
        int arr[] = {1, 0, 0, 1, 0, 1, 0, 1};
        int length = longestOnes(arr,longestOnes);
        System.out.println(length);
    }
        public static int longestOnes(int[] nums, int k) {
            int left = 0;
            int right = 0;

            while (right < nums.length) {
                if (nums[right] == 0) {
                    k--;
                }

                if (k < 0) {
                    if (nums[left] == 0) {
                        k++;
                    }
                    left++;
                }
                right++;
            }
            return right - left;
        }

}
