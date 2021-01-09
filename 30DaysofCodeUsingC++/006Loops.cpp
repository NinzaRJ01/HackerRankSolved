#include <bits/stdc++.h>

using namespace std;



int main()
{
    int n;
    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    for(int i=1;i<11;i++){
        int product =  n*i;
        printf("%d x %d = %d \n",n,i,product);
    }
    return 0;
}
