#include <iostream>
using namespace std;

int main() {
	
	int t ;
	cin>>t;
	while(t--){
	    int n,s;
	    cin>>n>>s;
	     n+=s;
	    if(n%2==0){
	        cout<<"Janmansh"<<endl;
	    }else cout<<"Jay"<<endl;
	}
	
	return 0;
}

