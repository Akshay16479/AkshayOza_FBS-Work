#include <stdio.h>

void main()
{
	int Num1,Num2,sum,sub,multi,div,mod;
	
	printf("Enter Two Numbers for Addition");
	scanf("%d%d",&Num1,&Num2);
	sum=(Num1+Num2);
	printf("%d",sum);
	
	printf("\nEnter Two Numbers for Subtraction");
	scanf("%d%d",&Num1,&Num2);
	sub=(Num1-Num2);
	printf("%d",sub);
	
	printf("\nEnter Two Numbers for multiplication");
	scanf("%d%d",&Num1,&Num2);
	multi=(Num1*Num2);
	printf("%d",multi);
	
	printf("\nEnter Two Numbers for Division");
	scanf("%d%d",&Num1,&Num2);
	div=(Num1/Num2);
	printf("%d",div);
					
	printf("\nEnter Two Numbers for Mod");
	scanf("%d%d",&Num1,&Num2);			
	mod=(Num1%Num2);
	printf("%d",mod);
	

	
}
