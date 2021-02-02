package exam;
/*
 10.Given an array nums, write a function to move all 0's to the end of it while maintaining the 
relative order of the non-zero elements.
                Example:Input: [0,1,0,3,12]
               Output: [1,3,12,0,0]

 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Arrays;

 public class Ex10
{
    // Function to move all zeros present in the array to the end
    public static void reorder(int[] A)
    {
        // k stores index of next available position
        int k = 0;
 
        // do for each element
        for (int i: A)
        {
            // if current element is non-zero, put the element at
            // next free position in the array
            if (i != 0) {
                A[k++] = i;
            }
        }
 
        // move all 0's to the end of the array (remaining indices)
        for (int i = k; i < A.length; i++) {
            A[i] = 0;
        }
    }
 
    // Move all zeros present in the array to the end
    public static void main(String[] args)
    {
        int[] A = { 0,1,0,3,12 };
 
        reorder(A);
        System.out.println(Arrays.toString(A));
    }
}




