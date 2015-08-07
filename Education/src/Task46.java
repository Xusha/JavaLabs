package src;

/**
 * 46. Write a subroutine with three parameters of type int. 
 * The subroutine should determine which of its parameters is smallest. 
 * The value of the smallest parameter should be returned as the value of the subroutine.
 * @author dev
 *
 */

public class Task46 {
	
	public int getMinValue(int a, int b, int c) {
		int minValue = 999999999;
		int[] ar = {a,b,c};
		for (int i=0; i<3; i++) {
			if (ar[i]<minValue)
				minValue = ar[i];
		}
		return minValue;
	}
	

}
