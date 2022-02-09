#include <iostream>
#include<bits/stdc++.h>
#define ld double
//Problem Code - EUREKA
using namespace std;
ld power(ld n, int p){
    ld product=1;
    while(p--){
        product*=n;
        // cout<<p<<" "<<product<<endl;
    }
    return product;
}
int main() {
	int t;
	cin>>t;
	while(t--){
	    ld n;
	    cin>>n;
	    int p = int(n);
	    
	    n = 0.143*n;
	    cout<<(int(round(power(n,p))))<<endl;
	    
	}
	return 0;
}

