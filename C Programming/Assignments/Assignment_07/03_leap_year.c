#include<stdio.h>

void leapYear(int* n){
    int year = (*n);
    if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
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

    leapYear(&year);
}