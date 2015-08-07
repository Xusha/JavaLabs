package src;

import java.sql.Time;
import java.util.Arrays;
import java.util.Random;

/**
 * ���� ������, ������� ����� ��������� ����� �������, � ��� ����� � ������: {}, [], ()
������ ����� ���� ����������. 
���������� �������� �����, ������� ��������� ������ � ���������� true, ���� ������������ ������
����������.

���������� ������: abc, {}, [a()]
������������ ������: a[, []))), ab[{]}
 * @author dev
 *
 */

public class NewTask2 {
	
	public static void main(String[] args) {
			
		System.out.println(isCorrect("abc, {},{a()]"));
			
		
	}
	static boolean isCorrect(String abc) {
		String[] test = abc.split("");
		int counter1 = 0;
		int counter2 = 0;
		int counter3 = 0;
		for ( int i = 0;  i < test.length; i++ ) {
			if (test[i].equals("{")) 
				counter1++;
			if (test[i].equals("(")) 
				counter2++;
			if (test[i].equals("[")) 
				counter3++;
			if (test[i].equals("}")) 
				counter1--;
			if (test[i].equals(")")) 
				counter2--;
			if (test[i].equals("]")) 
				counter3--;
		}
		if (counter1 == 0 && counter2 == 0 && counter3 == 0) 
			return true;
		else
			return false;
				
	}


}
