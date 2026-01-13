// Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the 
// desired operations. 

#include<stdio.h>


int sum(){
    printf("Enter num1: ");
    int n1;
    scanf("%d",&n1);

    printf("Enter num2: ");
    int n2;
    scanf("%d",&n2);

    return n1+n2;
}

int substraction(){
    printf("Enter num1: ");
    int n1;
    scanf("%d",&n1);

    printf("Enter num2: ");
    int n2;
    scanf("%d",&n2);

    return n1-n2;
}

int multiplication(){
    printf("Enter num1: ");
    int n1;
    scanf("%d",&n1);

    printf("Enter num2: ");
    int n2;
    scanf("%d",&n2);

    return n1*n2;
}

int division(){
    printf("Enter num1: ");
    int n1;
    scanf("%d",&n1);

    printf("Enter num2: ");
    int n2;
    scanf("%d",&n2);

    return n1/n2;
}

int modulous(){
    printf("Enter num1: ");
    int n1;
    scanf("%d",&n1);

    printf("Enter num2: ");
    int n2;
    scanf("%d",&n2);

    return n1%n2;
}

int calculator(){
    printf("Enter operator: ");
    char op;
    scanf("%c",&op);
    
    switch(op){
        case '+':
            return sum();
            break;
        case '-':
            return substraction();
            break;
        case '*':
            return multiplication();
            break;
        case '/':
            return division();
            break;
        case '%':
            return modulous();
            break;
        
    }
}

void main(){
    
    int ans = calculator();
    printf("Ans = %d",ans);
    

}