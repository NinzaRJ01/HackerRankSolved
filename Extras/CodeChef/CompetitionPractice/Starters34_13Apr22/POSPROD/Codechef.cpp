#include <iostream>
#include <cmath>
#define ll long long int
using namespace std;
ll funx(ll n){
    
    return (n*(n-1))/2;
}
int main() {
	// your code goes here
	ll t=0;
	cin>>t;
	while(t--){
	    ll n;
	    cin>>n;
	    ll countPos = 0;
	    ll countNeg = 0;
	    for(ll i=0;i<n;i++){
	        ll val=0;
	        cin>>val;
	        if(val==0)continue;
	        if(val<0)countNeg+=1;
	        if(val>0)countPos+=1;
	    }
	    ll res = funx(countNeg) + funx(countPos);
	    cout<<res<<endl;
	    
	}
	return 0;
}

