// Write a C program to input five numbers and find their average.

#include <stdio.h>

int main() {
    float num1, num2, num3, num4, num5;
    float sum, average;

    printf("Enter five numbers:\n");
    
    printf("Number 1: ");
    scanf("%f", &num1);
    
    printf("Number 2: ");
    scanf("%f", &num2);
    
    printf("Number 3: ");
    scanf("%f", &num3);
    
    printf("Number 4: ");
    scanf("%f", &num4);
    
    printf("Number 5: ");
    scanf("%f", &num5);

    sum = num1 + num2 + num3 + num4 + num5;
    
    average = sum / 5.0;

    printf("\nSum of the five numbers is: %.2f\n", sum);
    printf("The average of the five numbers is: %.2f\n", average);

    return 0;
}