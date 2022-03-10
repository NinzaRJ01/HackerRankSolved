#include <bits/stdc++.h>
#define ll long long int
using namespace std;

int main() {
	ll t;
	cin>>t;
	while(t--){
	    ll n;
	    cin>>n;
	    ll z=0,one=0;
	    for(int i=0;i<n;i++){
	        ll val = 0;
	        cin>>val;
	        if(val==0){
	            one+=1;
	        }else z++;
	    }
	    cout<<max(z,one)<<endl;
	}
	return 0;
}

