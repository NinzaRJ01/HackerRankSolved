#include <iostream>
#include <algorithm>
//Problem : Crying Colours 
//Problem Code : CRYCOLR
using namespace std;

int main() {
	int t;//number of test cases 
	cin>>t;
	while(t--){
	    int n;
	    cin>>n;
	    int bucketsRGB[3][3];
	   
	    for(int i=0;i<3;i++){
	        int r,g,b;
	        cin>>r>>g>>b;
	        bucketsRGB[i][0]=r;
	        bucketsRGB[i][1]=g;
	        bucketsRGB[i][2]=b;
	    }
	    long int count =0;
	    
	    //fill Buckets 
	    if(bucketsRGB[1][0]!=0){
	        int countOfRedB1 = bucketsRGB[1][0];
	        count+=countOfRedB1;
	        bucketsRGB[0][0]+=countOfRedB1;
	        bucketsRGB[1][0]-=countOfRedB1;
	        
	        //For swap green
	        if(bucketsRGB[0][1]!=0&&countOfRedB1!=0){
	            int countOfGreenB0 = bucketsRGB[0][1];
	            int toReduceAmt = min(countOfRedB1,countOfGreenB0);
	            bucketsRGB[0][1]-=toReduceAmt;
	            bucketsRGB[1][1]+=toReduceAmt;
	            countOfRedB1-=toReduceAmt;
	        }
	        //For swap blue
	        if(bucketsRGB[0][2]!=0&&countOfRedB1!=0){
	            int countOfBlueB0 = bucketsRGB[0][2];
	            int toReduceAmt = min(countOfRedB1,countOfBlueB0);
	            bucketsRGB[0][2]-=toReduceAmt;
	            bucketsRGB[1][2]+=toReduceAmt;
	            countOfRedB1-=toReduceAmt;
	        }
	    }
	    //sorry for repetitive code
	    if(bucketsRGB[2][0]!=0){
	 
	        int countOfRedB2 = bucketsRGB[2][0];
	        count+=countOfRedB2;
	        bucketsRGB[0][0]+=countOfRedB2;
	        bucketsRGB[2][0]-=countOfRedB2;
	        
	        //For swap blue
	        if(bucketsRGB[0][2]!=0&&countOfRedB2!=0){
	            int countOfBlueB0 = bucketsRGB[0][2];
	            int toReduceAmt = min(countOfRedB2,countOfBlueB0);
	            bucketsRGB[0][2]-=toReduceAmt;
	            bucketsRGB[2][2]+=toReduceAmt;
	            countOfRedB2-=toReduceAmt;
	        }
	        //For swap green
	        if(bucketsRGB[0][1]!=0&&countOfRedB2!=0){
	            int countOfGreenB0 = bucketsRGB[0][1];
	            int toReduceAmt = min(countOfRedB2,countOfGreenB0);
	            bucketsRGB[0][1]-=toReduceAmt;
	            bucketsRGB[2][1]+=toReduceAmt;
	            countOfRedB2-=toReduceAmt;
	        }
	    }    
	        count+=bucketsRGB[1][2];
	        cout<<count<<endl;
	    
	}
	return 0;
}

