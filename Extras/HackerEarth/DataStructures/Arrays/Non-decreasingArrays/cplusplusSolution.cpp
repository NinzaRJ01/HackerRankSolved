#include <iostream>
#include <stdio.h>
#include <cmath>
using namespace std;
int main(){
    int t=0;//testcases
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        long B[n];//Resultant Array;
        for(int i=0;i<n;i++){
            long key;
            cin>>key;
            if(i==0){
                B[i]=key;
            }else{
                B[i] = ceil(double(B[i-1])/key)*key;
            }
        }
        for(int i=0;i<n;i++){
            cout<<B[i]<<" ";
        }
        cout<<"\n";
    }
    return 0;

}

