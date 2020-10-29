#include <bits/stdc++.h>
using namespace std;
/*
Obj--> Pair the socks by color and tell total no. of pairs 
Given --> an array and no. of element in array

*/
void sockMerchant(int n,vector<int> ar){
	
	sort(ar.begin(),ar.end());
	int pairs =0,pre;
	bool pair_count = false;
	
	for(auto i= ar.begin();i!=ar.end();++i){
	int j = *i;
	if(i!=ar.begin()){
		if(j==pre && !pair_count){
			pairs++;
			pair_count = true;
		}
		else if(j!=pre){
			pair_count = true;
		}
	}
	pre =j;
	}
	cout << pairs;
}
int main(){
	vector<int> v1={10,20,20,10,10,30,50,10,20};
	int n=9;
	sockMerchant(9,v1);
	return 0;
}
