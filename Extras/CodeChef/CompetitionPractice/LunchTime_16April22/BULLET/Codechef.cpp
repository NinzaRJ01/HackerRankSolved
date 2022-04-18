#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int t=0;
	cin>>t;
	while(t--){
	    int a[3]={0};
	    for(int i=0;i<3;i++)cin>>a[i];
	    
	    /*
	        a[0] - speed of bullet
	        a[1] - distance bet pixels
	        a[2] - after time 
	    */
	    
	    int ttime = 0;//travel time
	    ttime = ceil(a[1]/a[0]);
	    int res = a[2]-ttime;
	    if(res<0)res = 0;
	    cout<<res<<endl;
	    
	}
	
	return 0;
}

