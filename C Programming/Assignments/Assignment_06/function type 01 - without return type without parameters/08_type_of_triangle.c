//  Accept three sides of a triangle from the user and determine whether the triangle is 
// equilateral, isosceles, or scalene.

#include<stdio.h>

void equilateral(){
    printf("Equilateral Triangle.");
}

void isosceles(){
    printf("Isosceles Triangle.");
}

void scelene(){
    printf("Scelene Triangle.");
}

void main(){
    int s1,s2,s3;
    printf("Enter three sides of triangle one by one: ");
    scanf("%d", &s1);
    scanf("%d", &s2);
    scanf("%d", &s3);

    if(s1+s2 >= s3 && s3+s2 >= s1 && s1+s3 && s2){
        if(s1==s2 && s2==s3 && s1==s3) equilateral();
        else if(s1==s2 || s2==s3 || s1==s3) isosceles();
        else scelene();
    }
    else printf("This is not a triangle.");
}