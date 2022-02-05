#include <iostream>
#include <math.h>
#define ll  long long int
//Problem Code :ORANDCON
using namespace std;
ll power(ll a,ll b){
    ll total=1;
    for(int i=1;i<=b;i++)
        total*=a;
    return total;
}
int main() {
	int t;
	cin>>t;
	while(t--){
	    ll n;
	    cin>>n;
	    cout<<0<<" ";
	    cout<<n<<" ";
	    cout<<
	        power(
	                2,int(log2(n+1)+1)
	            )-1<<endl;
	}
	return 0;
}

