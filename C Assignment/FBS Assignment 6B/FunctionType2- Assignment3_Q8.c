#include<stdio.h>

int strongNum();                             // function declaration
void main()
{
	
    int result= strongNum();
    if (result==1)                             
    printf("Strong Number");
    else
    printf("Not Strong Number");

}

int strongNum()                                  // function definition
{
    int num=145;      
    int p,fact=1,sum=0;
    int i=1;
    int temp=num;

    for(num; num>0; )     
    {
        p=num%10;
        fact=1;

        for(i=1; i<=p; i++)
        {
            fact=fact*i;
        }

        sum=sum+fact;
        num=num/10;
    }

    if(sum==temp)
        return 1;                             // return to main
    else
        return 0;
}

