#include <iostream>
#define ll long long int
using namespace std;
int main(){
    ll t;//number of testcases
    cin>>t;

    while(t--){//test loops
        ll n,B,x,y;
        cin>>n>>B>>x>>y;
        ll crnt = 0;
        ll res = 0;
        for(int i=1;i<=n;i++){
            if(crnt+x>B)crnt-=y;
            else crnt+=x;
            res+=crnt;
        }
        cout<<res<<endl;
    }
}
