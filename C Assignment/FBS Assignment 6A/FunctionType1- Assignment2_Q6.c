#include<stdio.h>
void checkDiv();
void main()
{
checkDiv();		 
}

void checkDiv()
{
	int num;
	printf("Enter Number: ");
	scanf("%d",&num);
	
	if(num%3==0 && num%5==0)
	printf("Number is Divisible by 3 and 5");
    else if (num%3==0)
	printf("Number is Divisible by 3");
	else if(num%5==0)
	printf("Number is Divisible by 5");
    else
	printf("Number is Not Divisible "); 
}
	
	

