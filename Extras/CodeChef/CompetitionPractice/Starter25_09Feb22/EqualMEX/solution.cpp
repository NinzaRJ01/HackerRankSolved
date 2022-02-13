#include <iostream>
#include <bits/stdc++.h>
//Problem Code : EQUALMEX
using namespace std;
int main() {
	int t;
	cin>>t;
	while(t--){
	    int n;
	    cin>>n;
	    int b[n+1]={0};
	    for(long i=0;i<2*n;i++){
	        int el;
	        cin>>el;
	        b[el]+=1;
	    }
	    bool flag = true;
	    for(int i=0;i<n+1;i++){
	        if(b[i]==0)break;
	        if(b[i]==1)flag=false;
	    }
	    cout<<(flag?"YES":"NO")<<endl;
	}
	
	return 0;
}

