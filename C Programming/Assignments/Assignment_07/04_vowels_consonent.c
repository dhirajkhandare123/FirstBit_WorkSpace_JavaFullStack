// Write a program to check whether a given character is a vowel or consonant. 

#include<stdio.h>

void checkChar(char* ptr){
    char s = *ptr;
    if(s=='a' || s=='A' || s=='e' || s=='E' || s=='i' || s=='I' || s=='o' || s=='O' || s=='u' || s=='U'){
        printf("vowel");
    }
    else{
        printf("consonant");
    }
}

void main(){
    char s;
    printf("Enter charcter: ");
    scanf("%c", &s);

    checkChar(&s);
}