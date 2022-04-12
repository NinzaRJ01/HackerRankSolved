#include <iostream>
#include <bits/stdc++.h>
#define ll long long int
using namespace std;
bool isPrime(ll n)
{
    // Corner case
    if (n <= 1)
        return false;
 
    // Check from 2 to square root of n
    for (ll i = 2; i <= sqrt(n); i++)
        if (n % i == 0)
            return false;
 
    return true;
}
 
int main() {
	ll t=0;
	cin>>t;
	while(t--){
	    ll a=0,b=0;
	    cin>>a >> b;
	    ll res = 0;
	    if(a==1||b==1){
	        cout<<-1<<endl;
	        continue;
	    }
	    
	    bool aflags[2]={0};
	    bool bflags[2]={0};
	   /*
	    0 ->  factor of 2 
	    1 -> factor of 3 
	    2-> sum using 2 & 3
	   */
	   if(a%2!=0&&a%3!=0)res = 1;
	   if(b%2!=0&&b%3!=0)res = 1;
	   //if(res==1)
	   ////{    cout<<res<<endl;
	   //    //continue;}
	   
	   if(__gcd(a,b)==1)cout<<1<<endl;
	   else cout<<0<<endl;
	   
	   
	   
	    
	   // cout<<res<<endl;
	    
	}
	return 0;
}

