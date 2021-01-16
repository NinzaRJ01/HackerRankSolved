#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>
#include <cstdlib>
using namespace std;


int main(){
    string S;
    cin >> S;
    int num;
    try{
         num = stoi(S);
    } catch(...){
        cout<<"Bad String";
        return 1;
    }
    cout<<num;
    return 0;
}
