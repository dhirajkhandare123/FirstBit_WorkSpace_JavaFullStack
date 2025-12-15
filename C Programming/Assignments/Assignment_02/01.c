// Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the 
// desired operations.

#include<stdio.h>

void main(){
    int n1, n2;
    char op=0;

    printf("Enter n1: ");
    scanf("%d", &n1);
    printf("Enter n2: ");
    scanf("%d", &n2);

    printf("Enter operator: ");
    scanf(" %c", &op);

    int ans;

    if(op == '+'){
        ans = n1 + n2;
    }
    else if(op == '-'){
        ans = n1 - n2;
    }
    else if(op == '/'){
        ans = n1 / n2;
    }
    else if(op == '*'){
        ans = n1 * n2;
    }
    else if(op == '%'){
        ans = n1 % n2;
    }

    printf("Ans = %d",ans);
}