#include <iostream>
using namespace std;
//Problem Code : BINBASBASIC
int main() {
	int t;
	cin>>t;
	while(t--){
	    int n,k;
	    cin>>n>>k;
	    string s;
	    cin>>s;
	    string res = "NO";
	   // if(k>(n/2))res="YES";
	    if(n==1){
	        cout<<"YES"<<endl;
	        continue;
	    }
	    for(int i=0;i<n/2;i++){
	        int fromEnd = n-i-1;
	        if(s[i]!=s[fromEnd])k--;
	    }
	    if(k>-1){
	        if(n%2==1){
	            res ="YES";
	        }
	        else 
	            res = k%2==0?"YES":"NO";
	    }
	        
	        
	    cout<<res<<endl;
	}
	return 0;
}

