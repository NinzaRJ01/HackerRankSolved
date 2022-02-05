#include <iostream>
using namespace std;
//Problem Code : AVOIDCONTACT
int main() {
	int t;
	cin>>t;
	while(t--){
	    int x,y;//total people,infected;
	    
	    cin>>x;
	    cin>>y;
	    x=x-y;
	    int res=0;
	    if(x==0)res = (y*2)-1;
	    else res = x+(y*2);
	    cout<<res<<endl;
	}
	return 0;
}

