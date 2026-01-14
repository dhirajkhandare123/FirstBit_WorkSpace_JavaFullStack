// Write a program to check whether a given character is uppercase or lowercase.

#include<stdio.h>

int checkCharacterType(char s){
    
    if(s>=65 && s<=90) return 1;
    if(s>=97 && s<=122) return 0;
}

void main(){
    char s;
    printf("Enter character: ");
    scanf("%c",&s);
    
    int flag=checkCharacterType(s);
    
    if(flag==1) printf("Uppercase");
    else printf("Lowercase");
}