package src;

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
