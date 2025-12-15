// Accept a number and check if it is divisible by 3, 5, or both. 
// (Print "Divisible by 3 but not by 5" or "Divisible by 5 but not by 3" or "Divisible by 
// both" or” Divisible by None”) 

#include<stdio.h>

void main(){
    int n;
    printf("Enter: ");
    scanf("%d", &n);

    if(n%3==0){
        if(n%5==0) printf("Divisible by both");
        else printf("Divisible by 3 but not by 5");
    }
    else if(n%5==0){
        if(n%3==0) printf("Divisible by both");
        else printf("Divisible by 5 but not by 3");
    }
    else{
        printf("Divisible by None");
    }
}