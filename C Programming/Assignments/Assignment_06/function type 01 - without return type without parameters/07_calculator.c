// Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the 
// desired operations. 

#include<stdio.h>
void sum(){
    printf("Enter num1: ");
    int n1;
    scanf("%d",&n1);

    printf("Enter num2: ");
    int n2;
    scanf("%d",&n2);

    printf("Sum = %d",(n1+n2));
}

void substraction(){
    printf("Enter num1: ");
    int n1;
    scanf("%d",&n1);

    printf("Enter num2: ");
    int n2;
    scanf("%d",&n2);

    printf("Substraction = %d",(n1-n2));
}

void multiplication(){
    printf("Enter num1: ");
    int n1;
    scanf("%d",&n1);

    printf("Enter num2: ");
    int n2;
    scanf("%d",&n2);

    printf("Multiplication = %d",(n1*n2));
}

void division(){
    printf("Enter num1: ");
    int n1;
    scanf("%d",&n1);

    printf("Enter num2: ");
    int n2;
    scanf("%d",&n2);

    printf("Division = %d",(n1/n2));
}

void modulous(){
    printf("Enter num1: ");
    int n1;
    scanf("%d",&n1);

    printf("Enter num2: ");
    int n2;
    scanf("%d",&n2);

    printf("Floor Division = %d",(n1/n2));
}

void main(){
    

    printf("Enter operator: ");
    char op;
    scanf("%c",&op);
    
    switch(op){
        case '+':
            sum();
            break;
        case '-':
            substraction();
            break;
        case '*':
            multiplication();
            break;
        case '/':
            division();
            break;
        case '%':
            modulous();
            break;
        default:
            printf("Sorry operator not available!");
    }

}