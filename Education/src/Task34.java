package src;

/**
 * 34. Дано целое число N (> 0). Используя операции деления нацело и взятия остатка от деления, 
 * вывести все его цифры, начиная с самой правой (разряда единиц).
 */
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
