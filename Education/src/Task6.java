package src;
/**
 * 6. Дано значение температуры T в градусах Фаренгейта. Определить значение этой же температуры 
 * в градусах Цельсия. Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим 
 * соотношеним: TC=(TF–32)·5/9.
 * @author dev
 *
 */

public class Task6 {
	
		void DoSomething() {
		
		float tf = 77.8f;
		float tc = ((tf - 32)*5)/9;
		
		System.out.println("Task6:  TC="+String.format("%.1f", tc));
			
	}
	
	

}
