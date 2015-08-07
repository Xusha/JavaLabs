package src;

/**
 * 30. ���� ������������ ����� A � ����� ����� N (> 0). 
 * ��������� ���� ����, ����� �������� ��������� 1 � A + A2 � A3 + � + (�1)N�AN. 
 * �������� �������� �� ������������.
 * @author dev
 *
 */

public class Task30 {

	public double getValue(float a, int n) {

		double value = 0.0;

		for (int i = 1; i <= n + 1; i++){
			value += Math.pow(-1, i - 1) * Math.pow(a, i - 1);
		}

		return value;
	}
}
