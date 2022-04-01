#include <iostream>
#define ll long long int
using namespace std;
int main(){
    ll t;ll mod = 998244353;
    cin>>t;
    while(t--){
        ll n;
        cin>>n;
        if(n%2==1){
            cout<<0<<endl;
            continue;
        }
        ll res = 1;
        for(ll i=2;i<=n/2;i++){
            res*=i*i;
            res%=mod;
        }
        
        cout<<res<<endl;
    }
}