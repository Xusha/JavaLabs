package src;

/**
 * ���� 3 �����. �������� �������, ������� ��������� ����� ��������� ���� ������� �� ���� ���� �����.
 * @author dev
 *
 */

public class Task50 {
	public double getSumOfSquars(double a, double b, double c) {
		double sumOfSquars = 0;
		double[] ar = {a*a, b*b, c*c};
		double min = 999999999;
		for (int i = 0; i<3; i++){
			if (ar[i]<min) {
				min = ar[i];
			}
			sumOfSquars += ar[i]; 	
		}
		return sumOfSquars - min;
	}

}
