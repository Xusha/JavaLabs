package src;

import java.util.Arrays;

/**
 * 42. ƒано целое число K и массив из дес€ти целых ненулевых чисел.
 *  ¬ывести номер последнего числа в массиве, большего K. ≈сли таких чисел нет, то вывести 0.
 * @author dev
 *
 */
public class Task42 {
	public int getLastNumber(int k) {
		int[] ar = new int[10];
		int greaterThenK = 0;
		for( int i = 0; i<10; i++){
			ar[i] = (int) (Math.random()*100+1);
			if (ar[i]>k)
				greaterThenK = i;
		}
	System.out.println("Random array is " + Arrays.toString(ar));
	return 	greaterThenK;
	}

}
