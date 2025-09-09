#include<stdio.h>
void main ()
{   int age,salary;
	
	printf("enter age :");
	scanf("%d",&age);
	printf("enter salary :");
	scanf("%d",&salary);
	
	
	if(age>=21&&salary>=25000)
	printf("Eligible for Loan ");
	else
	printf("Not Eligible for Loan");
}
