#include <iostream>
#include <cmath>
//Problem : Covid And Theatre Ticket
//Problem Code : COVID_19
using namespace std;

int main() {
	int t;//no of testcases 
	cin>>t;
	while(t--){
	    double m,n;
	    cin>>m>>n;
	    int res = ceil(m/2) * ceil(n/2);
	    cout<<res<<endl;
	}
	return 0;
}

