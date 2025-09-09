#include <stdio.h>

void main() {
char ch;

    printf("Enter a character: ");
    scanf("%c", &ch);

    // Check if character is a digit
    if(ch >= '0' && ch <= '9') {
        printf("'%c' is a digit.\n", ch);
    }
    // Check if character is a letter
    else if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
        // Check for vowels
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ||
           ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
            printf("'%c' is a vowel.\n", ch);
        } else {
            printf("'%c' is a consonant.\n", ch);
        }
    }
            //  special symbol
    else {
        printf("'%c' is a special symbol.\n", ch);
    }

 
}

