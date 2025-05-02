package com.esi.cgs.security.common.cache.stats;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeperateNegativePositive {

    public static void main(String[] args) {
        List<Integer> positive = new ArrayList<Integer>();
        List<Integer> negative = new ArrayList<Integer>();

        int arr[] = {1,2,3,4,-9,-10,-11,-12};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negative.add(arr[i]);
            }else {
                positive.add(arr[i]);
            }
        }
        int positiveIndex = 0;
        int negativeIndex = 0;
        int i = 0;
        int result[] = new int[arr.length];
        int ptr = 0;

        while (positiveIndex < positive.size() && negativeIndex < negative.size()) {
            if(ptr == 0){
                result[i] = positive.get(positiveIndex);
                positiveIndex++;
                ptr = 1;
            }else if(ptr == 1){
                result[i] = negative.get(negativeIndex);
                negativeIndex++;
                ptr = 0;
            }
            i++;
        }

        while (positiveIndex < positive.size()) {
            result[i] = positive.get(positiveIndex);
            positiveIndex++;
        }
        while (negativeIndex < negative.size()) {
            result[i] = negative.get(negativeIndex);
            negativeIndex++;
        }

        for(int e : result){
            System.out.print(e + " ");
        }
    }
}
