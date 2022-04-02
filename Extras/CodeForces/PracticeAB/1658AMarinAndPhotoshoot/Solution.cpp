#include <iostream>
using namespace std;
int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int s[n];
        for(int i=0;i<n;i++){
            char c;
            cin>>c;
            s[i] =c-'0';
        }
        // cin>>s[i];
        // 0 -> Male
        // 1 -> Female
        if(n==1){
            cout<<(0)<<endl;
            continue;
        }
        int res = 0;
        int itr = 0;
        while(itr<n){
            if(s[itr]==0){
                if(itr+1<n&&s[itr+1]==0)res += 2;
                else if(itr+1 < n && s[itr+1] == 1){
                    if(itr+2 < n && s[itr+2] == 0)res += 1;
                }
            }
            itr+=1;
        }
        cout<<res<<endl;
    }
}
