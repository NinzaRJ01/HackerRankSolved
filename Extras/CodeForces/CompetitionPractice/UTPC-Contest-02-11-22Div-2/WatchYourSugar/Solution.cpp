#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int main(){
    int n,m,count=0;//number of chocolates, maximum grams, maxmimum number of chocolate
    cin>>n;
    cin>>m;
    int a[n];
    for(int i=0;i<n;i++)
        cin>>a[i];
    sort(a,a+n);
    long int crntSum =0;
    for(int i=0;i<n;i++){
        crntSum+=a[i];
        if(crntSum>m)break;
        count++;
    }
    cout<<count<<endl;
    
}