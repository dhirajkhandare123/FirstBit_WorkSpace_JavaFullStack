#include<stdio.h>

int leapYear(){
    int n;
    printf("Enter year: ");
    scanf("%d",&n);

    if(n % 4 == 0 && n % 100 != 0 || n % 400 == 0){
        return 1;
    }
    else{
        return 0;
    }
}

void main(){
    
    printf("Leap year program\n");
    int flag=leapYear();
    if(flag==1) printf("Leap year");
    else printf("Not Leap year");

}