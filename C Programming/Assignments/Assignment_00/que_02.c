// Write a C program to find the area of a circle.

#include <stdio.h>
#define PI 3.14159265359

int main() {
    double radius;
    double area;

    printf("Enter the radius of the circle: ");
    scanf("%f", &radius);

    area = PI * radius * radius;

    printf("The area of the circle with radius %.2f is: %.2f\n", radius, area);

    return 0;
}