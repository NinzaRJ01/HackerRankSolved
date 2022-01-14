#include <iostream>
#define ll long long int
// Problem : Devandra and Water Sports 
// Problem Code : DEVSPORTS
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--){
	    ll z,y,a,b,c;// Rs at the start of the trip,Rs Already Spent, price of a,b,c;
	    ll totalPrice = 0;
	    ll remain =0;
	    cin>>z;
	    cin>>y;
	    remain = z-y;
	    cin>>a>>b>>c;
	    totalPrice = a+b+c;
	    if(remain>=totalPrice)cout<<"YES"<<endl;
	    else cout<<"NO"<<endl;
	    
	}
	return 0;
}

