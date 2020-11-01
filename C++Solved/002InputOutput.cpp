#include <iostream>
#include <string>
using namespace std;
int main(){
//In this challenge, we practice reading input from stdin and printing output to stdout. 
//Task :
// Red 3 numbers from stdin and print their sum to stdout.
int a[3];
int result=0;
	for (int i=0;i<3;i++){
		cin>>a[i];
		result+=a[i];
	}
	cout<<result;
return 0;
}
