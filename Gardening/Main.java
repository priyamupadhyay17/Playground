#include<iostream>
using namespace std;
int main()
{
 //Type your code here.
 int r,c,tn;
 cin>>r;
 cin>>c;
 cin>>tn;
 if((tn>5 && tn<11) || tn%5==0 || tn==22)
   cout<<"It is a mango tree";
 else
   cout<<"It is not a mango tree";
}