
public class Task18 {
	void DoSomethig() {
		int[] a = {5,7};
		int[] b = {3,6};
		if (a[0]%2 == b[1]%2 && b[0]%2 == a[1]%2 ) {
			System.out.println("Данные поля ДЕЙСТВИТЕЛЬНО имеют одинаковый цвет");
		}
		else{
			System.out.println("Данные поля имеют разный цвет");
		}
	}
	
}
