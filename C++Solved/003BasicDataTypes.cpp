#include <iostream>
using namespace std;
int main(){
/*
	Input Format

Input consists of the following space-separated values: int, long, char, float, and double, respectively.

Output Format

Print each element on a new line in the same order it was received as input. Note that the floating point value should be correct up to 3 decimal places and the double to 9 decimal places.
*/
	int myInt;
	cin>>myInt;
	long int myLong;
	cin>> myLong;
	char myChar;
	cin>> myChar;
	float myFloat;
	cin >> myFloat;
	double myDouble;
	cin>>myDouble;
	printf("%d\n%ld\n%c\n%0.3f\n%0.9lf",myInt,myLong,myChar,myFloat,myDouble);}
