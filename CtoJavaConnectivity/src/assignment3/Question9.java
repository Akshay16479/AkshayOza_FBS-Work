package assignment3;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=28;
		int i=1;
		int sum=0;


		while(i<num)
		{
			if(num%i==0)
			sum=sum+i;
			
			i++;
		}
		if(num==sum)
		System.out.printf("No is Perfect Number");
		else
		System.out.printf("No is Not Perfect Number");

	}

}
