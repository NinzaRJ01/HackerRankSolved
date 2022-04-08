#include <iostream>
#define ll long long int
using namespace std;

int main() {
	ll t=0;
	cin>>t;
	while(t--){
	    ll n=0;
	    cin>>n;
	    ll countE = 0;//count of even
	    ll countO = 0;//count of odd
	    while(n--){
	        ll val = 0;
	        cin>>val;
	        if(val%2==0)countE+=1;
	        else countO+=1;
	    }
	    if(countO==0||countE==0){
	        cout<<0<<endl;
	        continue;
	    }
	    if(countO%2==1){//means making all even array is not possible
	        cout<<countE<<endl;
	    }else {
	        countO/=2;
	        cout<<(countE<countO?countE:countO) <<endl;
	    }
	    
	}
	
	
	return 0;
}

