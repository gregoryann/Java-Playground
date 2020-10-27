/*********************************************************************************************************************
 Array Multiplier
Create a function that takes an array as an argument and returns a new nested array for each element in the original array. The nested array must be filled with the corresponding element (string or number) in the original array and each nested array has the same amount of elements as the original array.

Examples
multiply([4, 5]) ➞ [[4, 4], [5, 5]]

multiply(["*", "%", "$"]) ➞ [["*", "*", "*"], ["%", "%", "%"], ["$", "$", "$"]]

multiply(["A", "B", "C", "D", "E"]) ➞ [["A", "A", "A", "A", "A"], ["B", "B", "B", "B", "B"], ["C", "C", "C", "C", "C"], ["D", "D", "D", "D", "D"], ["E", "E", "E", "E", "E"]]

Notes
The given array contains numbers or strings.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   


import java.util.Arrays;

public class ArrayMultiplier {
	public static Object[][] multiply(Object[] items) {
		Object[][] r = new Object[items.length][];
		for (int i=0; i < items.length; i++) {
			r[i] = new Object[items.length];
			Arrays.fill(r[i], 0, items.length, items[i]);
		}
		return r;
	}
}

