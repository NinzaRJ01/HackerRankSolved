#include <iostream>
#define ll long long int
using namespace std;

int main() {
	ll t = 0;
	cin>>t;
	while(t--){
	    ll n = 0;
	    cin>>n;
	   
	    ll sum =0;
	    
	    for(int i=0;i<n;i++){
	        ll val =0;
	        cin>>val;
	        sum+=val;
	    }
	    ll i=1;ll ans =0;
	    
	    while(sum>=0){
	        ans += 1;
	        sum-= i;
	         i += 1;
	    }
	    ans-=1;
	    cout<<ans<<endl;
	}
	return 0;
}

