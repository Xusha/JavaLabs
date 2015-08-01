package src;

import java.util.Arrays;

public class Task34 {
	void getNumbers(int n) {
		String nString = Integer.toString(n);
		
		int z = (int) Math.pow(10,   nString.length());
		
		for (int i = 10; i <= z; i = i * 10)

		{
			int n1 = 10 * (n % i) / i;

			n = n - n % i;

			System.out.print(n1);

		}

	}

}
