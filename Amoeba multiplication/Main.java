#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int cm,as,a=0,b=1,c=1;
  cin>>cm;
  if(cm<=1)
    cout<<"0";
  while(c<cm) 
    { for(int i=2;i<cm;i++){
        c=a+b; 
        a=b; 
        b=c; }
    } 
  as=c;
  cout<<as;
}