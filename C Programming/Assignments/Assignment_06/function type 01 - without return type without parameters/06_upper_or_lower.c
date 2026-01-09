// Write a program to check whether a given character is uppercase or lowercase.

#include<stdio.h>

void checkCharacterType(int n){
    if(n>=65 && n<=90) printf("Uppercase");
    if(n>=97 && n<=122) printf("Lowercase");
}

void main(){
    char s;
    printf("Enter character: ");
    scanf("%c",&s);

    checkCharacterType(s);
}