#include <iostream>
using namespace std;
//Problem Code : EVMHACK
int main() {
	long int t;
	cin>>t;
	while(t--){
	    int abc[3];
	    int pqr[3];
	    int totalMyVotes = 0;
	    for(int i=0;i<3;i++){
	        cin>>abc[i];
	        totalMyVotes+=abc[i];
	    }
	           
	    int totalVotes= 0;
	    for(int i=0;i<3;i++){
	        cin>>pqr[i];
	        totalVotes+=pqr[i];
	    }
	           
	   int maxDif = 0;
	   for(int i=0;i<3;i++){
	        abc[i]=pqr[i]-abc[i];
	        if(abc[i]>maxDif)
	            maxDif=abc[i];
	   }
	   cout<<((totalMyVotes+maxDif)>totalVotes/2?"YES":"NO")<<endl;
	}
	return 0;
}

