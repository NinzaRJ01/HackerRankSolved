#include <bits/stdc++.h>
#define ll long long int
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--){
	    ll x;
	    cin>>x;
	    ll a[3];
	    for(int i=0;i<3;i++){
	        cin>>a[i];
	    }
	    sort(a,a+3);
	    
	    ll val = (a[0]*(x-1)) + a[1];
	    cout<<val<<endl;
	}
	return 0;
}

