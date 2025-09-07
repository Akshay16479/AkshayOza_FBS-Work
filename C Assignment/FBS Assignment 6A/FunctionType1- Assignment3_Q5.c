
#include <stdio.h>
void isPalin();
void main()
{
  isPalin();
}

void isPalin()
{
  int num=12121,rev=0,p;
  int temp=num;
  while(num>0)
  {
    p=num%10;
    rev=rev*10+p;
	num=num/10;
  }
  
if(temp==rev)
printf("No is Palindrome");
else
printf("Not Palindrome");
   
}



