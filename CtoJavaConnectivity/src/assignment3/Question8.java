package assignment3;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7;
		int i=2;
		int flag=1;
		
		while(i<num)
		{
			if(num%i==0)
			flag=0;
		i++;
		}
		if(flag==0)
		System.out.printf("not prime");
		else
		System.out.printf("prime");
	}

}
