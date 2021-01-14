#include <bits/stdc++.h>

using namespace std;



int main()
{
    int n;
    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
     int maxConsX = 0;//maximum consecutive x's
        int consX =0;//count consecutive x's
        int pre;
        while(n>0){//Time Complexity O(no. of digit in binary value of(n))=>O(i)
            int currentBin = n%2;
            n/=2;
            if(currentBin==1){
                consX++;
                if(maxConsX<consX){
                    maxConsX=consX;
                }    
            }
            if(currentBin==0){//if there happens to be zero in binaries conX should be revert to 0
                consX=0;
            }
            
        }
        cout<<maxConsX<<endl;
    return 0;
}
