#include <iostream>
#include <cmath>
#define ll long long int
//Problem Code : BITBLEND
using namespace std;
int getCount(ll a[], int n){
    int countEvenA =0;
    int countEvenB =0;
    int countOddA =0;
    int countOddB= 0;
    for(int i=0;i<n;i+=2){
        if(a[i]%2==0)countEvenA++;
        if(a[i]%2==1)countOddA++;
    }
    for(int i=1;i<n;i+=2){
        if(a[i]%2==0)countEvenB++;
        if(a[i]%2==1)countOddB++;
    }
    return min(countOddB+countEvenA,countOddA+countEvenB);
}
int getIndexOfOddNum(ll a[],int n){
    for(int i=0;i<n;i++){
        if(a[i]%2==1)return i;
    }
}
int getIndexOfEvenNum(ll a[],int n){
    for(int i=0;i<n;i++){
        if(a[i]%2==0)return i;
    }
}
int main() {
	int t;
	cin>>t;
	while(t--){
	    int n;
	    cin>>n;
	    ll a[n];
	    int countEven = 0;
	    int countOdd = 0;
	    for(int i=0;i<n;i++){
	        cin>>a[i];
	        if(a[i]%2==0)countEven++;
	        if(a[i]%2==1)countOdd++;
	    }
	    if(countEven==n){//xor of any two even number is even;
	        cout<<-1<<endl;
	        continue;
	    }
	    if(countOdd==n){
	        string res = "2 1\n";
	        a[1] =  a[1]^a[0];
	        //convert mid to even;
	        int oddNumInd = 0;
	        long count =1;
	        //convert mid  indexes to even
	        for(int i=1;i<n;i+=2){//odd+ odd-> even
	            if(a[i]%2==1){
	                res = res +to_string(i+1)+" "+to_string(oddNumInd+1)+"\n";
	                a[i] = a[i]&a[oddNumInd];
	                count++;
	            }
	        }
	        cout<<count<<endl;
	        cout<<res;
	        continue;
	    }
	   long count=0;
	   int countEvenA =0;
       int countEvenB =0;
       int countOddA =0;
       int countOddB= 0;
       for(int i=0;i<n;i+=2){
         if(a[i]%2==0)countEvenA++;
            if(a[i]%2==1)countOddA++;
        }
        for(int i=1;i<n;i+=2){
            if(a[i]%2==0)countEvenB++;
            if(a[i]%2==1)countOddB++;
            }
        count = min(countOddB+countEvenA,countOddA+countEvenB);
	   cout<<count<<endl;
	    if(count==0){
	        continue;
	    }
	    if(count==countOddA+countEvenB){//here even is majortity at  0 2 4 -- indexes
	        string res = "";
	        int oddNumInd = getIndexOfOddNum(a,n);
	        long count=0;
	        //convert mid  indexes to odd
	        for(int i=1;i<n;i+=2){//even + odd-> odd
	            if(a[i]%2==0){
	                res = res +to_string(i+1)+" "+to_string(oddNumInd+1)+"\n";
	                a[i] = a[i]^a[oddNumInd];
	                count++;
	            }
	        }
	        oddNumInd = 1;
	        //convert remaining to even 
	        for(int i=0;i<n;i+=2){
	            if(a[i]%2==1){//convert odd+odd -> even
	                res = res +to_string(i+1)+" "+to_string(oddNumInd+1)+"\n";
	                a[i]= a[i]^a[oddNumInd];
	                count++;
	            }
	        }
	        
	        cout<<res;
	    }
	    else {
	        string res = "";
	        int oddNumInd = getIndexOfOddNum(a,n);
	       // cout<<"teo"<<endl;
	        
	        //convert remaining to odd
	        for(int i=0;i<n;i+=2){
	            if(a[i]%2==0){//convert even+odd -> odd
	                res = res +to_string(i+1)+" "+to_string(oddNumInd+1)+"\n";
	                a[i]= a[i]^a[oddNumInd];
	                count++;
	            }
	        }
	        oddNumInd =0;
	        //convert mid  indexes to even
	        for(int i=1;i<n;i+=2){//odd + odd-> even
	            if(a[i]%2==1){
	                res = res +to_string(i+1)+" "+to_string(oddNumInd+1)+"\n";
	                a[i] = a[i]^a[oddNumInd];
	                count++;
	            }
	        }
	        oddNumInd = 1;
	        
	        cout<<res;
	    }
	}
	return 0;
}

