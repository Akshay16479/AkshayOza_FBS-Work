#include <stdio.h>

void main()
{
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
printf("No is Perfect Number");
else
printf("No is Not Perfect Number");

}
