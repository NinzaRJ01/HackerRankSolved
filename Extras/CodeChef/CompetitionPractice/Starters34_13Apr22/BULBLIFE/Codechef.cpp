#include <iostream>
using namespace std;

int main() {
	int t=0;
	cin>>t;
	while(t--){
	    int n,x;
	    cin>>n >>x;
	   // int a[n];
	    int sum = 0;
	    int req = n*x;
	    for(int i=0;i<n-1;i++){
	        int val=0;
	        cin>>val;
	        sum+=val;
	    }
	    int res = req-sum;
	    if(res<0)res=0;
	    cout<<(res)<<endl;
	    
	}
	
	return 0;
}

