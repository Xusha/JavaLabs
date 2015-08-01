package src;

import java.util.Arrays;

public class Task38 {
	void getSum(){
		int sum = 0;
		int[] ar = new int[10];
		for (int i = 0; i < 10 ; i ++){
			ar[i] = (int)(Math.random()*10) + 1;
			sum += ar[i];
		}	
		System.out.println("Random array is " + Arrays.toString(ar) + 
							" and sum of it's elements is " + sum);
	}
}
