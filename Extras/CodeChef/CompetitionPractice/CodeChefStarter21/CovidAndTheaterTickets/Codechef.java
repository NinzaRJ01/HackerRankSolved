#include <iostream>
#include <cmath>
using namespace std;
//Problem Code : COVID_19
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

