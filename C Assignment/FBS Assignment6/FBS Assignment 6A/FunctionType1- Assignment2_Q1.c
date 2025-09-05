#include <stdio.h>
void Sum(),Sub(),Multi(),Div(),Mod();
void main()
{
	Sum();
	Sub();
	Multi();
	Div();
	Mod();
}
void Sum()
{
    int Num1,Num2,sum,sub,multi,div,mod;
	printf("\nEnter Two Numbers for Addition");
	scanf("%d%d",&Num1,&Num2);
	sum=(Num1+Num2);
	printf("%d",sum);
}
void Sub()
{
	int Num1,Num2,sum,sub,multi,div,mod;
	printf("\nEnter Two Numbers for Subtraction");
	scanf("%d%d",&Num1,&Num2);
	sub=(Num1-Num2);
	printf("%d",sub);
}
void Multi()
{
	int Num1,Num2,sum,sub,multi,div,mod;
	printf("\nEnter Two Numbers for multiplication");
	scanf("%d%d",&Num1,&Num2);
	multi=(Num1*Num2);
	printf("%d",multi);
}
void Div()
{
	int Num1,Num2,sum,sub,multi,div,mod;
	printf("\nEnter Two Numbers for Division");
	scanf("%d%d",&Num1,&Num2);
	div=(Num1/Num2);
	printf("%d",div);
}
void Mod()
{
	int Num1,Num2,sum,sub,multi,div,mod;
	printf("\nEnter Two Numbers for Mod");
	scanf("%d%d",&Num1,&Num2);			
	mod=(Num1%Num2);
	printf("%d",mod);
}

