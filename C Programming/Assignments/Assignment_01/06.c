// Write a program to check whether a given character is uppercase or lowercase. 

#include<stdio.h>

void main(){
    printf("Enter: ");
    char ch;
    scanf("%c", &ch);

    int ascii = (int) ch;

    if(ascii >= 65 && ascii <= 90) printf("Uppercase");
    else if(ascii >= 97 && ascii <= 122) printf("Lowercase");
    else printf("Invalid");
}