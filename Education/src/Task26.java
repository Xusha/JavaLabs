package src;



public class Task26 {
	
	public class CZod
	{
		CZod(int _day, String _name)
		{
			name = _name;
			day = _day;
		}
		
		String name ;
		int    day ;
	};


	
	
	void getZodiac(int day, int month) {
		
		if (   (day > 31 || day <=0) || (month < 1 || month > 12)
			)
		{
			System.out.println("Please enter valid value of the days");
		}
		
		
		CZod[]Signs  = new CZod[]{ 
						    new CZod(18, "�������"),
						    new CZod(20, "����"),
						    new CZod(19, "����"),
						    new CZod(20, "�����"),
						    new CZod(21, "��������"),
						    new CZod(22, "���"),
						    new CZod(22, "���"),
						    new CZod(22, "����"),
						    new CZod(22, "����"),
						    new CZod(22, "��������"),
						    new CZod(21, "�������"),
						    new CZod(21, "�������"),
						};
		
		
		String sMonthName = "";
		
		if (day <= Signs[month-1].day) {
			if (month == 1)
				sMonthName = Signs[11].name;
			else
				sMonthName = Signs[month-1-1].name;
		}else{
			if (month == 12)
				sMonthName = Signs[0].name;
			else
				sMonthName = Signs[month-1].name;
		}
		

		System.out.print(sMonthName);
	
		
	}

}
