#include <stdio.h>
void chkChar();
void main()
{
  chkChar();
}

void chkChar() 
{
	char temp='p';
	
	if(temp == 'a'|| temp=='e'||temp == 'i'|| temp=='o'||temp == 'u'||
	   temp== 'A'||temp == 'E'|| temp=='I'||temp=='O'||temp=='U')
	printf("Character is Vowel");
	else
	printf("Character is Consonant ");	
}

