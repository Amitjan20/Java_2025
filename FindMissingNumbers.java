package com.esi.cgs.security.common.cache.stats;

public class FindMissingNumbers {

    public static void main(String[] args) {

        int arr[] = {1,2,4,5,5};
        int freq[] = new int[arr.length+1];
        int miss = 0;
        int frequency = 0;

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] > 1) {
                frequency = i;
            }
            if (freq[i] == 0) {
                miss = i;
            }
        }

        System.out.println(miss);
        System.out.println(frequency);
    }
}
