#include <iostream>
using namespace std;
//Problem :  Romantic Reversals 
//Problem Code : RMNTREV
int main() {
	int t;
	cin>>t;
	while(t--){
		    
		    int n;
		    int k;
		    cin>>n;cin>>k;
		    char str[n+1];
		    char res[n+1];
		    str[n]='\0';
		    res[n]='\0';
		    //Reading String
		    for(int i=0;i<n;i++){
		        cin>>str[i];
		    }
		    if(k==1){
		        cout<<str<<endl;
		        continue;
		    }
		    if(k%2==0){
		        for(int i=k/2;i<k;i++){
		            int indAtRes = (i-(k/2))*2;
		            res[indAtRes]= str[i];
		        }
		        for(int i=(k/2)-1;i>=0;i--){
		            int indAtRes = (((k/2)-i-1)*2)+1;
		            res[indAtRes]= str[i];
		        }
		    }
		    if(k%2==1){
		        for(int i=k/2;i>=0;i--){
		            int indAtRes = (((k/2)-i)*2);
		            res[indAtRes]= str[i];
		        }
		        for(int i=(k/2)+1;i<k;i++){
		            int indAtRes = ((i-(k/2)-1)*2)+1;
		            res[indAtRes]= str[i];
		        }
		    }
		    for(int i=k;i<n;i++){
		        res[i]=str[i];
		    }
		        cout<<res<<endl;
		  //  delete str;
		  //  delete res;
		    
		    
		}
	return 0;
}

