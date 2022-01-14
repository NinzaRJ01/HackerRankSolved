#include <iostream>
#include <cmath>
#define ll long long int
//Problem : Skash And Grid
//Problem Code : CHEFGRD
using namespace std;
ll getPositive(ll a){
    if(a<0)return -1*a;
    return a;
}
int main() {
	ll t;//no of testcases 
	cin>>t;
	while(t--){
	    ll n;//length of matrix or no of rows and columns
	    cin>>n;
	    ll centerVal = ceil(n/2);
	    ll cur_x,cur_y;
	    cin>>cur_x>>cur_y;
	    if(cur_y%2==1&&cur_x%2==1){
	        cout<<0<<endl;
	    }
	    else if(cur_y%2==0&&cur_x%2==0){
	        cout<<0<<endl;
	    }
	    else cout<<1<<endl;
	    
	    
	}
	return 0;
}

