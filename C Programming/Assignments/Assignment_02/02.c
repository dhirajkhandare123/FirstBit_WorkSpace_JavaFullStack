//  Accept three sides of a triangle from the user and determine whether the triangle is 
// equilateral, isosceles, or scalene.

#include<stdio.h>

void main(){
    int s1,s2,s3;
    printf("Enter three sides of triangle one by one: ");
    scanf("%d", &s1);
    scanf("%d", &s2);
    scanf("%d", &s3);

    if(s1+s2 >= s3 && s3+s2 >= s1 && s1+s3 && s2){
        if(s1==s2 && s2==s3 && s1==s3) printf("Equilateral Triangle.");
        else if(s1==s2 || s2==s3 || s1==s3) printf("Isosceles Triangle.");
        else printf("Scelene Triangle.");
    }
    else printf("This is not a triangle.");
}