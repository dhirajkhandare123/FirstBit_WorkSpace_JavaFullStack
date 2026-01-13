// Write a program to check whether a given character is uppercase or lowercase.

#include<stdio.h>

int checkCharacterType(){
    char s;
    printf("Enter character: ");
    scanf("%c",&s);

    if(s>=65 && s<=90) return 1;
    if(s>=97 && s<=122) return 0;
}

void main(){
    
    int flag=checkCharacterType();
    
    if(flag==1) printf("Uppercase");
    else printf("Lowercase");
}