package com.sks.array;

import java.util.HashSet;

public class PairSUm {



    public static void main(String[] args) {
        int intArray[]={1,2,3,4,5};
        int target= 5;
        findPairs(intArray,target);
    }

    private static void findPairs(int[] intArray, int target) {

        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<intArray.length;i++){
            int localVar=target-intArray[i];

            if(hs.contains(localVar)){
                System.out.println("pairs: :::"+ intArray[i]+","+ localVar );
            }

            hs.add(intArray[i]);

        }

    }
}
