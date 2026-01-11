// Ask the user to enter marks. 
// Then show the result based on these rules: 
// If marks are more than 75 → show "Distinction" 
// If marks are more than 65 → show "First Class" 
// If marks are more than 55 → show "Second Class" 
// If marks are 40 or more → show "Pass Class" 
// If marks are less than 40 → show "Fail"

#include<stdio.h>

void distinction(){
    printf("Distinction");
}
void firstClass(){
    printf("First Class");
} 
void secondClass(){
    printf("Secand Class");
} 
void passClass(){
    printf("Pass Class");
} 
void fail(){
    printf("Fail");
} 

void main(){
    printf("Enter marks: ");
    int marks;
    scanf("%d", &marks);

    if(marks > 75) distinction();
    else if(marks > 65) firstClass();
    else if(marks > 55) secondClass();
    else if(marks >= 40) passClass();
    else if(marks < 40) fail();
}