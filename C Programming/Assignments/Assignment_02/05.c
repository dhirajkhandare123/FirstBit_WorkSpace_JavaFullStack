// Accept the price from user. Ask the user if he is a student (user may say y or n). If he 
// is a student and he has purchased more than 500 than discount is 20% otherwise 
// discount is 10%.But if he is not a student then if he has purchased more than 600 
// discount is 15% otherwise there is not discount. 

#include<stdio.h>

void main(){
    int isStudent = 1;
    int purchase;

    printf("Are you student? ");
    scanf("%d", &isStudent);

    printf("Enter purchased amount: ");
    scanf("%d", &purchase);

    if(isStudent==1){
       
        if(purchase > 500){
            printf("You won 20 percent discount");
        }
        else{
            printf("You won 10 percent discount");
        }
    }
    else{
        
        if(purchase > 600){
            printf("You won 15 percent discount");
        }
        else{
            printf("No discount.");
        }
    }
}