package src;

/**
 * 30. ƒано вещественное число A и целое число N (> 0). 
 * »спользу€ один цикл, найти значение выражени€ 1 Ц A + A2 Ц A3 + Е + (Ц1)NЈAN. 
 * ”словный оператор не использовать.
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
