#include<stdio.h>
int isPrime();
void main()
{
   int result=isPrime();
   if(result==0)
   printf("Number is Not Prime");
   else
   printf("Number is Prime");
}
int isPrime()
{
	int num = 7;   
    int i;

    for (i = 2; i < num; i++)
    {
        if (num % i == 0)
        return 0;
		else
		return 1;   
    }
        
}

