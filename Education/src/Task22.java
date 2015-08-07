package src;

/**
 * 22. ƒан номер мес€ца Ч целое число в диапазоне 1Ц12 (1 Ч €нварь, 2 Ч февраль и т. д.).
 *  ¬ывести название соответствующего времени года и мес€ца, например, Умарт - веснаФ, 
 *  Уавгуст - летоФ и т.п.
 * @author dev
 *
 */
public class Task22 {
	void DoSomething(int monthnum) {
		
		if ((monthnum < 1 || monthnum > 12)) {

			System.out.println("Invalid month number");
			return;
		}		
		
		
		String Months[] = new String[] {"январь",  "‘евраль", "ћарт", 
									    "јпрель", "ћай", "»юнь", "»юль",
									    "јвгуст","—ент€брь", "ќкт€брь", "Ќо€брь","ƒекабрь"
									    };  
		
		String Seasons[] = new String[] {"зима", "весна", "лето",  "осень" }; 
		int idx = monthnum / 3;
		if (idx >3)
			idx = 0;
	
		System.out.println("Season is :"  + Seasons[idx] + " , Month is : " + Months[monthnum-1] );
	}

}
