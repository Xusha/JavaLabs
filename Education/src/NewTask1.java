package src;

import java.util.Arrays;
import java.util.*;
import java.sql.Time;
import java.io.*;

/**
 * 1) ≈сть офис, в который в течение дн€ приход€т и уход€т посетители.
¬ журнале регистрации отмечаетс€ врем€ прихода и врем€ ухода каждого посетител€.
Ќеобходимо написать метод, который принимает журнал регистрации 
и возвращает максимальное количество посетителей, одновременно находившихс€
в офисе в течение дн€.

ƒл€ этого задани€ нельз€ использовать сторонние классы из JDK(только свои классы, примитивные
типы и массивы)

 * @author dev
 *
 */
public class NewTask1 {
	
	public static void main(String[] args) {
		
		getArrayOfTime(10);
		
	
}
	
	static void getArrayOfTime(int n) {
				
		Time[][] arTime = new Time[n][2];
		Random random = new Random();
		int millisInDay = 17*60*60*1000;
		int workStarts = 7*60*60*1000;
		for (int i = 0; i<n; i++) {
			Time time1 = new Time((long)(random.nextInt(millisInDay - workStarts)+workStarts));
			Time time2 = new Time((long)(random.nextInt(millisInDay - workStarts)+workStarts));
			if (time1.before(time2)){
				arTime[i][0] = time1;
				arTime[i][1] = time2;
			} else {
				arTime[i][0] = time2;
				arTime[i][1] = time1;
			}
		}
		
		System.out.println("Time of arrival and leaving " + Arrays.deepToString(arTime));
		
		int[] counter = new int [n];
		for (int i = 0; i<n; i++) {
			counter[i] = 0;
			for (int k = 0; k<n; k++) {
				boolean b1 = arTime[k][0].before(arTime[i][1]);
				boolean b2 = arTime[k][0].after(arTime[i][0]);

				boolean b3 = arTime[k][1].after(arTime[i][0]);
				boolean b4 =arTime[k][1].before(arTime[i][1]);
				
				if ( (b1 && b2) || (b3 && b4))
					++counter[i];
			}
		}
		
		int max = 0;
		for (int i = 0; i<n; i++) {
			if (counter[i] > max) 
				max = counter[i];
		}
		System.out.println("Number of visitors for each logged time " + Arrays.toString(counter));
		System.out.println("Max number of persons " + max);
	}
	
	

}