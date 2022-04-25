#include <iostream>
using namespace std;

int main() {
	int t=0;
	cin>>t;
	while(t--){
	    int a[2];
	    cin>>a[0]>>a[1];
	    int b[2];
	    cin>>b[0]>>b[1];
	    if(b[0]<a[0] || b[1]<a[1])cout<<"IMPOSSIBLE"<<endl;
	    else cout<<"POSSIBLE"<<endl;
	}
	
	return 0;
}

