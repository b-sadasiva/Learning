package com.learn.algo.array;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] input={847,847,0,0,0,399,416,416,879,879,206,206,206,272};
        System.out.println("Pre operation array");
        for (int i : input) {
            System.out.print(" "+i);
        }
        ArrayOperations arrayOperations=new ArrayOperations();
        arrayOperations.arrayOperation(input);
        System.out.println("Post operation array");

        for (int i : input) {
            System.out.print(" "+i);
        }
        arrayOperations.movingZerostoEnd(input);
        System.out.println("Post moving the zeros in array");

        for (int i : input) {
            System.out.print(" "+i);
        }
    }

    public void arrayOperation(int num[]){
        for (int i = 0; i < num.length-1; i++) {
            int ival=num[i];
            int iPlusVal=num[i+1];
            if (ival==iPlusVal) {
                num[i]=ival*2;
                num[i+1]=0;
            }
        }
    }

    public void movingZerostoEnd(int num[]){
        int zeroPos=-1;
        boolean psoChangesd=true;
        for (int i = 0; i < num.length; i++) {
            if (num[i]==0&&psoChangesd) {
                zeroPos=i;
                psoChangesd=false;
            } 
            if(num[i]!=0&& zeroPos<i&&zeroPos>-1){
                num[zeroPos]=num[i];
                num[i]=0;
                i=zeroPos;
                psoChangesd=true;
            }
        }
    }

}

