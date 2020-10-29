/* What is DataTypes
-->datatypes define and restrict what type values can be stored in a variable
-->as well as define what operation can be done on it.
Primitive Datatypes in c++:
int,char,bool,float,void
Derived :
array,pointer,referenece,function
UserDefined :
Class,Structure,Union,Enum,Typedef

Other Remarks -->>
To consume the whitespace or newline between the end of a token and beginnning of the next line:

getline(cin>>ws,s2)
where s2 is a string.
 */
/* To Do Task :
    variable i,d,s are already declared and  intialized
    --> declare 3 variables (int,double,string)
    -->read 3 lines from stdin and initialize your variables.
    -->print sumof int variables.
    -->print sumof float variables.
    -->print concatenate strings
    Note : getline takes intput a char 
    and by default stop reading at whitespace
    Solve use getline(cin>>ws,string)
 */
#include <iostream>
#include <string>
using namespace std;
int main(){
    int i=20;
    double d = 20.43;
    string s = "Hacker Rank";
    
    int myInt;double myDouble;string myString;
    cout<<endl<<"Int : ";
    cin >> myInt;
    cout<<endl<<"Double: ";
    cin >> myDouble;
    cout<<endl<<"String : ";
    getline(cin>>ws,myString);
    cout<< myInt+i<<endl<<myDouble+d<<endl<<s+myString<<endl;
}
