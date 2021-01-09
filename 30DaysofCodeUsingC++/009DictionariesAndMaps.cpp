#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <map>
#include <string>
using namespace std;


int main() {
    /* Given question the way of describing how to take input(as line) vs how it really     is(lines but seperated for key and value) also confused me too. */   
    map<string,string> myMap;
    int n;
    cin>>n;
    for(int i=0;i<n;i++){
        string key ;
        cin >>key;
        string val ;
        cin >> val;
        myMap[key] = val;
    }
    string str;
    while(cin>>str){
        if(myMap[str].empty())cout<<"Not found"<<endl;
        else cout<<str<<"="<<myMap[str]<<endl;
    }
    return 0;
}
