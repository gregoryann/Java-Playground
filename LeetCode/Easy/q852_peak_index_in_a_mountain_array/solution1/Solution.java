// Source : https://leetcode.com/problems/peak-index-in-a-mountain-array/

/******************************************************************************************************************************************
 * Let's call an array A a mountain if the following properties hold:                                                                     *
 *                                                                                                                                        *
 * A.length >= 3                                                                                                                          *
 * There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]                      *
 * Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]. *
 *                                                                                                                                        *
 * Example 1:                                                                                                                             *
 *                                                                                                                                        *
 * Input: [0,1,0]                                                                                                                         *
 * Output: 1                                                                                                                              *
 * Example 2:                                                                                                                             *
 *                                                                                                                                        *
 * Input: [0,2,1,0]                                                                                                                       *
 * Output: 1                                                                                                                              *
 * Note:                                                                                                                                  *
 *                                                                                                                                        *
 * 3 <= A.length <= 10000                                                                                                                 *
 * 0 <= A[i] <= 10^6                                                                                                                      *
 * A is a mountain, as defined above.                                                                                                     *
 *****************************************************************************************************************************************/
package com.leet_code.easy.q852_peak_index_in_a_mountain_array.solution1;

/******************************************************************************************************************************************
 * Thoughts on implementation:                                                                                                            *
 * I iterate through the array until I find the peak inside the array.                                                                    *
 * This solution is faster than 16.53%                                                                                                    *
 * Time complexity is O(n)                                                                                                                *
 * ***************************************************************************************************************************************/

 public class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int max = A[0], index = 0;
        for(int i = 1; i < A.length && A[i] >= max; ++i) {
            max = A[i];
            index = i;
        }
        return index;
    }
}