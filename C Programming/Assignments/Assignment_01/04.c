// Write a program to check whether a given character is a vowel or consonant.

#include<stdio.h>

void main(){
    printf("Enter: ");
    char ch;
    scanf("%c",&ch);

    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') printf("vowel");
    else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') printf("vowel");
    else printf("consonant");
}