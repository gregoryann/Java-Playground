

/*********************************************************************************************************************
 
Add up the Numbers from a Single Number
Create a method that takes an integer as an argument. Add up all the numbers from 1 to the number you passed to the function. For example, if the input is 4 then your function should return 10 because 1 + 2 + 3 + 4 = 10.

Examples
addUp(4) ➞ 10

addUp(13) ➞ 91

addUp(600) ➞ 180300
Notes
Expect any positive number between 1 and 1000.

**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


import java.util.Arrays;
public class Program {
    public static boolean check(int[] arr, int el) {
			return Arrays.stream(arr).anyMatch(x -> el == x);
    }
}



public class Program {
    public static boolean check(int[] arr, int el) {
			for(int i : arr) {
				if (i == el) {
					return true;
				}
			}
			return false;
    }
}



public class Program {
    public static boolean check(int[] arr, int el) {
			for (int x : arr) {
				if (x == el) { return true; }
			}
			return false;
    }
}