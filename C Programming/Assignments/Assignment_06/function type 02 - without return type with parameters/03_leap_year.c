#include<stdio.h>

void leapYear(int n){
    if(n % 4 == 0 && n % 100 != 0 || n % 400 == 0){
        printf("Leap year!");
    }
    else{
        printf("Not a Leap year !");
    }
}

void main(){
    int year;
    printf("Enter year: ");
    scanf("%d",&year);

    leapYear(year);
}