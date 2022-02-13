#include <iostream>
#include <bits/stdc++.h>
#define ll long long int
using namespace std;
//Problem Code : TOWERTOP
int main() {
	int t;
	cin>>t;
	while(t--){
	    ll x,m;
	    cin>>x>>m;
	    
	    ll n = ceil(log2(x))+1;
	    if(m<n)
	        cout<<0<<endl;
	    else
	        cout<<m-n+1<<endl;
	    
	    
	    
	}
	return 0;
}

