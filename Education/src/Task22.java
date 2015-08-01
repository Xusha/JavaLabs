package src;

public class Task22 {
	void DoSomething(int monthnum) {
		
		if ((monthnum < 1 || monthnum > 12)) {

			System.out.println("Invalid month number");
			return;
		}		
		
		
		String Months[] = new String[] {"Январь",  "Февраль", "Март", 
									    "Апрель", "Май", "Июнь", "Июль",
									    "Август","Сентябрь", "Октябрь", "Ноябрь","Декабрь"
									    };  
		
		String Seasons[] = new String[] {"зима", "весна", "лето",  "осень" }; 
		int idx = monthnum / 3;
		if (idx >3)
			idx = 0;
	
		System.out.println("Season is :"  + Seasons[idx] + " , Month is : " + Months[monthnum-1] );
	}

}
