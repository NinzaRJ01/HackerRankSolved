#include <iostream>
#define ll long long int 
using namespace std;
//Problem : Maximum Trio
//Problem Code : MXMTRIO
int main() {
	int tests;
	cin>>tests;
	while(tests--){
	    int n;
	    cin>>n;
	    ll arr[n];
	    for(int i=0;i<n;i++){
	        cin >> arr[i];
	    }
	    //find max ind and min ind 
	    int maxInd = 0;
	    int minInd = 0;
	    for(int i=1;i<n;i++){
	        if(arr[i]>arr[maxInd])maxInd=i;
	        if(arr[i]<arr[minInd])minInd=i;
	    }
	    int secondMaxInd = minInd;
	    for(int i=0;i<n;i++){
	        if(i!=maxInd&&arr[i]>arr[secondMaxInd])secondMaxInd=i;
	    }
	    // subtract max, min
	    cout<< (arr[maxInd]-arr[minInd])*arr[secondMaxInd]<<endl;
	}
	return 0;
}

