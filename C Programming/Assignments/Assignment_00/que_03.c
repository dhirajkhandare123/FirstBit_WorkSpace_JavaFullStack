// Write a C program to convert temperature from Celsius to Fahrenheit using the 
// formula:
// F = (C *9/5) + 32

#include <stdio.h>

int main() {
    float celsius;
    float fahrenheit;

    printf("Enter the temperature in Celsius (C): ");
    scanf("%f", &celsius);

    fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

    printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit.\n", celsius, fahrenheit);

    return 0;
}