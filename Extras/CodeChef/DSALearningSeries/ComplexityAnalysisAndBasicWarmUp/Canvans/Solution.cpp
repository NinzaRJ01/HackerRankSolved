#include <iostream>
using namespace std;
#define ll long long int
//Problem : CARVANS
//Problem Code : CARVANS
int main() {
    int t = 0;
    cin>>t;
    while(t--){
        
        ll n=0;
        cin>>n;
        
        ll curn;
        cin>>curn;
        
        ll count = 1;
        ll maxSpeedUptoMe = curn;
        
        for(ll i=1;i<n;i++){
            cin>>curn;
            // cout<<"c: "<<curn <<" m : "<<maxSpeedUptoMe;
            if(curn<=maxSpeedUptoMe){
                // cout<<"<-";
                maxSpeedUptoMe=curn;
                count++;
            }
            // cout<<endl;
        }
        
        cout<<count<<endl;
        
    }
	return 0;
}

