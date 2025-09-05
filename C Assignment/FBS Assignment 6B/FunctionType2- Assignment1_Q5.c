#include <stdio.h>
int checkCase();
void main()
{
	checkCase();
	if(checkCase==100)
	printf("Character is in Uppercase");
	else
	printf("Character is in Lowercase");
}

int checkCase()
{
    char temp='k';
    if(temp>='A' && temp<='Z')
	return 100;
	else
	return 200;
}

