// Write a C program to convert given minutes into hours and remaining minutes.

#include<stdio.h>
void main(){
    int totalMinutes = 135;
    int hours, minutes;

    hours = totalMinutes / 60;
    minutes = totalMinutes % 60;

    printf("%d minutes is equal to %d hours and %d minutes\n", totalMinutes, hours, minutes);
    

}