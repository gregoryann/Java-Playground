// Source : https://leetcode.com/problems/flipping-an-image/
// Author : Julian Ghoncharenko
// Date   : 20-07-2020

/***************************************************************************************************************************************************
 * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.                                *
 *                                                                                                                                                 *
 * To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1]. *
 *                                                                                                                                                 *
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].      *
 *                                                                                                                                                 *
 * Example 1:                                                                                                                                      *
 *                                                                                                                                                 *
 * Input: [[1,1,0],[1,0,1],[0,0,0]]                                                                                                                *
 * Output: [[1,0,0],[0,1,0],[1,1,1]]                                                                                                               *
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].                                                                                 *
 * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]                                                                                               *
 * Example 2:                                                                                                                                      *
 *                                                                                                                                                 *
 * Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]                                                                                                *
 * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]                                                                                               *
 * Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].                                                                 *
 * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]                                                                                *
 * Notes:                                                                                                                                          *
 *                                                                                                                                                 *
 * 1 <= A.length = A[0].length <= 20                                                                                                               *
 * 0 <= A[i][j] <= 1>3->4->5                                                                                                                       *
 **************************************************************************************************************************************************/
package com.leet_code.easy.q832_flipping_an_image.solution1;

/***************************************************************************************************************************************************
 * @author Julian Ghoncharenko                                                                                                                     *
 * Thoughts on implementation:                                                                                                                     *
 * I iterate on the matrix from bottom to top,                                                                                                     *
 * then I take each row and iterate half the way.                                                                                                  *
 * On every element in the row I perform swap of 1 to 0 and vice versa.                                                                            *
 * This solution is faster than 41.81%                                                                                                             *
 * Time complexity is O(nm)                                                                                                                        *
 * ************************************************************************************************************************************************/
public class Solution {
	public static int[][] flipAndInvertImage(int[][] A) {
		for (int i = A.length - 1; i >= 0; --i) {
			for (int j = 0; j < A[i].length / 2; ++j) {
				if (A[i].length % 2 == 0 && j == A[i].length / 2)
					break;
				A[i][j] ^= 1;
				A[i][j] = A[i][A[i].length - 1 - j] - A[i][j] + (A[i][A[i].length - 1 - j] = A[i][j]);
				if (j != A[i].length - 1 - j)
					A[i][j] ^= 1;
			}

		}
		return A;
	}
}