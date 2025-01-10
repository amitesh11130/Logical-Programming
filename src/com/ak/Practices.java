package com.ak;

public class Practices {
    public static int largestinmountainarray(int[] arr){
        int start = 0;
        int end =arr.length-1;
        while(start<end){
            int mid= start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,6,1,2,4,3,5};
       // int a[]={1,7,1,3,5,6,4};
       // int a[]={1,2,3,4,1,2,2,1,2,2};
        System.out.println(  largestinmountainarray(a));

    }
    }
