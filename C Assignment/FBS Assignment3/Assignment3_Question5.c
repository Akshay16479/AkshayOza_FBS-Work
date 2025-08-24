//Check the given number is Palindrome number or not.Input: n = 121

#include <stdio.h>

void main()
{
  int num=121,rev=0,p;
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



