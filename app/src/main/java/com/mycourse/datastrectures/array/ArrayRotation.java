package com.mycourse.datastrectures.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayRotation {
    public static void main(String[] args) {
int[] array = {1,2,3,4,5};
ArrayRotation arrayRotation = new ArrayRotation();
int[] rotateArray = arrayRotation.rotateArray(array,2,5);
        List<int[]> arrayList= Arrays.asList(rotateArray);
//        List<Integer> al =
//                new ArrayList<Integer>(Arrays.toString(rotateArray);
//        ArrayList<Integer> arrayList = new ArrayList<Integer>(rotateArray);
System.out.println("Rotated Array "+Arrays.toString(rotateArray));
    }

    private int[] rotateArray(int[] givenArray, int d, int n) {
        d = d % n;
        int i, j, k, temp;
        int gcd = gcd(d, n);

        for (i = 0; i < gcd; i++) {
            temp = givenArray[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n) {
                    k = k - n;
                }
                if (k == i) {
                    break;
                }
                givenArray[j] = givenArray[k];
                j = k;
            }
            givenArray[j] = temp;
        }

        return givenArray;
    }


    private int gcd(int d, int n){
        if (n==0){
            return d;
        }

        return gcd(n,d%n);
    }
}
