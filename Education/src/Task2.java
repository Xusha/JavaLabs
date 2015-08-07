package src;

/**
 * 2. Даны переменные A, B, C. Изменить их значения, переместив содержимое 
 * A в B, B — в C, C — в A, и вывести новые значения переменных A, B, C.
 * @author dev
 *
 */

public class Task2 {

	void DoSomething()

	{

		int a = 5;
		int b = 6;
		int c = 7;
		a = a + b + c;
		b = a - b - c;
		c = a - b - c;
		a = a - b - c;
		System.out.println("Task2:  a=" + a + ", "+"b=" + b + ", "+"c=" + c);
		
	}

}
