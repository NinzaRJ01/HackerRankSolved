#include <bits/stdc++.h>
// ll long long int;
using namespace std;

int main() {
	int t=0;
	cin>>t;
	while(t--){
	    int n=0;
	    cin>>n;
	    int a[n];
	    int mmap[101]={0};
	    for(int i=0;i<n;i++){
	        cin>>a[i];
	        mmap[a[i]]+=1;
	    }
	    //using hashmap and count;
	    int ans=0;
	    for(int i=0;i<101;i++){
	        if(mmap[i]%2==1)ans+=1;
	    }
	    if(ans+n % 4!=0)ans+=(ans+n)%4;
	    cout<<ans<<endl;
	    
	}
	return 0;
}

