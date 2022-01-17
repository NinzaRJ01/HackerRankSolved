#include <iostream>
#include <bits/stdc++.h>
#define ll long long int
//Problem code: POWSUM
//Problem : Power Sum
using namespace std;
struct indEl{
    ll data;
    int index;
};
bool compareIndEl(indEl a,indEl b){
    return a.data<b.data;
}
bool isPowOf2(int power,ll sum){
    return sum-pow(2,power)==0;
}
int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        ll sum=0;
        ll min =0;
        cin>>n;
        indEl a[n];
        for(int i=0;i<n;i++){
            ll val;
            cin>>val;
            a[i].data = val;a[i].index = i;
            sum+=val;
        }
        
        sort(a,a+n,compareIndEl);
        min = a[0].data;
        // cout<<a[0].data;
        // Debug
        // for(int i=1;i<n;i++)cout<<" "<<a[i].data;cout<<endl;
        int powr = log2(sum);
        if(!isPowOf2(powr,sum))
            powr++;
        sum-=min;
        ll neg = pow(2,powr)-sum;
        neg/=min;
        if(neg==1){
            cout<<0<<endl;
            continue;
        }
        cout<<1<<endl;
        cout<<1<<" "<<neg<<endl;
        cout<<a[0].index+1<<endl;
        
    }
}
