#include <bits/stdc++.h>

using namespace std;



int main()
{
    vector<vector<int>> arr(6);
    for (int i = 0; i < 6; i++) {
        arr[i].resize(6);

        for (int j = 0; j < 6; j++) {
            cin >> arr[i][j];
        }

        cin.ignore(numeric_limits<streamsize>::max(), '\n');
    }
    int max =-10000;
            for(int i=0;i<6;i++){
                for(int j=0;j<6;j++){
                    if(6-i<3||6-j<3);//SOMFF
                    //if(arr[i][j]==0)continue;
                    else{int temp = 0;
                    
                    //System.out.println("->"+arr[i][0]);
                        for(int k=j;k<j+3;k++)temp+=arr[i][k];
                        for(int k=i+1;k<i+3;k++)temp+=arr[k][j+1];
                        for(int k=j;k<j+3;k++)temp+=arr[i+2][k];//arr[i+2][j+1] 
                        //addedtwo times
                        temp-=arr[i+2][j+1];
                        if(temp>max)max=temp;
                    }
                }
            }
        cout<<max<<endl;

    return 0;
}
