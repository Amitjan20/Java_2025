package com.esi.cgs.security.common.cache.stats;

public class PlusOne {

    public static void main(String[] args) {
        int arr[] = {9,9,9};
        int carry = 1;

        for(int i=arr.length-1;i>=0;i--){
            int sum = arr[i]+carry;
            arr[i] = sum%10;
            carry = sum/10;
        }
        if(carry >= 1){
            int newArr[] = new int[arr.length+1];
            newArr[0] = carry;
            System.arraycopy(arr,0,newArr,1,arr.length);
            for(int i=0;i<newArr.length;i++){
                System.out.print(newArr[i]+" ");
            }

        }else{
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
