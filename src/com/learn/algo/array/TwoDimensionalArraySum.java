package com.learn.algo.array;

import java.util.Arrays;

public class TwoDimensionalArraySum {
    public static void main(String[] args) {
        TwoDimensionalArraySum twoDimensionalArraySum=new TwoDimensionalArraySum();
        int[][] num1={{2,4},{3,6},{5,5}};
        int[][] num2={{1,3},{4,3}};
        int[][] merged=twoDimensionalArraySum.mergeTwoDimArray(num1, num2);
        System.out.println("Merged"+merged);
    }
    public int[][] mergeTwoDimArray(int[][] num1,int[][] num2){
        int totalSize=num1.length+num2.length;
        int[][] merged=new int[totalSize][2];
        int firstPos=0;
        int secondPos=0;
        boolean isLoopRequired=true;
        int currPos=0;
        while (isLoopRequired) { 
            System.out.println("True");
            if (firstPos==num1.length||secondPos==num2.length) {
                isLoopRequired=false;
                break;
            }
            int[] firstArry=num1[firstPos];
            int[] secondArray=num2[secondPos];
            int[] newArray=new int[2];
            if (firstArry[0]==secondArray[0]) {
                newArray[0]=firstArry[0];
                newArray[1]=firstArry[1]+secondArray[1];
                firstPos++;
                secondPos++;
            }else if (firstArry[0]<secondArray[0]) {
                newArray=firstArry;
                firstPos++;
            }else{
                newArray=secondArray;
                secondPos++;

            }
            merged[currPos]=newArray;
            currPos++;


        }
        if (firstPos==num1.length&&secondPos!=num2.length) {
            for(int j=secondPos;j<num2.length;j++){
                merged[currPos]=num2[j];
                currPos++;
            }
        }else if (firstPos!=num1.length&&secondPos==num2.length) {
            for(int j=firstPos;j<num1.length;j++){
                merged[currPos]=num1[j];
                currPos++;
            }
        }
        return Arrays.copyOfRange(merged, 0, currPos);


    }

}
