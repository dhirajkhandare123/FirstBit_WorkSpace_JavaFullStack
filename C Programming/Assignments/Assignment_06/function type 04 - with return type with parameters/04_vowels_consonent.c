// Write a program to check whether a given character is a vowel or consonant. 

#include<stdio.h>

int checkChar(char s){
    
    if(s=='a' || s=='A' || s=='e' || s=='E' || s=='i' || s=='I' || s=='o' || s=='O' || s=='u' || s=='U'){
        return 1;
    }
    else{
        return 0;
    }
}

void main(){

    char s;
    printf("Enter charcter: ");
    scanf("%c", &s);
    
    int flag=checkChar(s);
    
    if(flag==1) printf("vowel");
    else printf("consonant");
}