#include <iostream>
#include <string>
using namespace std;
int main(){
	/*
	Task :
	Given a positive integer

, do the following:

    	If 1<=n<=9, print the lowercase English word corresponding 
    	to the number (e.g., one for , two for, etc.).
	If n>9, print Greater than 9.
	*/
	int n;scanf("%d",&n);
	string result;
	if(n==1) result = "one";
	else if(n==2)result ="two";
	else if(n==3)result ="three";
	else if(n==4)result ="four";
	else if(n==5)result ="five";
	else if(n==6)result ="six";
	else if(n==7)result ="seven";
	else if(n==8)result ="eight";
	else if(n==9)result ="nine";
	else result = "Greater than 9";
	/*
	Easy way :
	
	string oneToNine[9] = {"one","two","three","four","five","six","seven","eight","nine"};
	if(n>0&&n<10)cout<<oneTwoNine[n-1];
	else cout<<"Greater than 9";
	
	/*
	*/
	
	return 0;
}
