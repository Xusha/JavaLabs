package src;

/**
 * 22. ��� ����� ������ � ����� ����� � ��������� 1�12 (1 � ������, 2 � ������� � �. �.).
 *  ������� �������� ���������������� ������� ���� � ������, ��������, ����� - ������, 
 *  ������� - ���� � �.�.
 * @author dev
 *
 */
public class Task22 {
	void DoSomething(int monthnum) {
		
		if ((monthnum < 1 || monthnum > 12)) {

			System.out.println("Invalid month number");
			return;
		}		
		
		
		String Months[] = new String[] {"������",  "�������", "����", 
									    "������", "���", "����", "����",
									    "������","��������", "�������", "������","�������"
									    };  
		
		String Seasons[] = new String[] {"����", "�����", "����",  "�����" }; 
		int idx = monthnum / 3;
		if (idx >3)
			idx = 0;
	
		System.out.println("Season is :"  + Seasons[idx] + " , Month is : " + Months[monthnum-1] );
	}

}
