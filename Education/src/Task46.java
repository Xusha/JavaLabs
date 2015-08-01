package src;

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
