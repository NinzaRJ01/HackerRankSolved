#include <iostream>
#define ll long long int
using namespace std;

int main() {
	ll t =0;
	cin>>t;
	while(t--){
	    ll n = 0;
	    cin>>n;
	    ll res = 0;
	    if(n%2==0){
	        if((n-2)%4==0)res = n ^ n-1;
	        else res = n ^ 3;
	    }
	    else {
	        ll k = n-1;
	        if((k-2)%4==0)res = k ^ k- 1;
	        else res = k ^ 3;
	        
	        res = n&res;
	    }
	    cout<<res<<endl;
	}
	return 0;
}

