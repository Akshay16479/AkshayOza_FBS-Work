package assignment1;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2025;
		
		if(year%4 == 0 && year%100 != 0 || year%400 == 0)
		{
			System.out.printf("Leap Year");
		}
		else
		{
			System.out.printf("Not Leap Year");
		}
	}

}
