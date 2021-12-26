#include <iostream>
#define ll long long int
using namespace std;
//Problem : Chef And Vacation Transportation
//Problem Code : CHEFTRANS
int main() {
    int test;
    cin>>test;
    ll X=0,Y=0,Z=0;
    while(test--){
    	cin>>X>>Y>>Z;
	    string res = "";
	    if((X+Y)>Z)res="TRAIN";
	    else if((X+Y)<Z)res="PLANEBUS";
	    else res ="EQUAL";
	    cout<<res<<endl;
    }
	return 0;
}

