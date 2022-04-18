#include <iostream>
#define ll long long int
using namespace std;

int main() {
	ll t= 0;
	cin>>t;
	while(t--){
	    ll n=0;
	    cin>>n;
	    ll pairs = 0;
	    ll nTwos = 0;
	    ll nOnes = 0;
	    ll rem = 0;
	    
	    for(ll i=0;i<n;i++){
	        ll val = 0;
	        cin>>val;
	        if(val==1)nOnes+=1;
	        if(val==2)nTwos+=1;
	        
	    }
	    rem = n - nOnes;
	   // cout<<"rem "<<rem<<endl;
	    if(nOnes>1){
	        pairs+= (nOnes*(nOnes-1))/2;
	    }
	    if(nTwos>1){
	        pairs += (nTwos*(nTwos-1))/2;
	    }
	    
	    pairs += (rem)*nOnes;
	    
	    cout<<pairs<<endl;
	}
	return 0;
}

