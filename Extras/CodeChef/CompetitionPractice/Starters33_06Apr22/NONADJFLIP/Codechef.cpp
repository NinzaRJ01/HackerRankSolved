#include <iostream>
using namespace std;

int main() {
	int t = 0;
	cin>>t;
	while(t--){
	    int n =0;
	    cin>>n;
	    bool fflag = false;
	    int opr = 0;
	    int prev = -1;
	    for(int i=0;i<n;i++){
	        char val;
	        cin>>val;
	        int x = val-'0';
	        if(x==1&&prev==1){
	            opr = 2;
	        }
	        if(x==1&&opr==0)opr=1;
	        prev = x;
	    }
	    cout<<opr<<endl;
	    
	}
	return 0;
}

