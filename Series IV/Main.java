#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num,out;
  cin>>num;
  out=0;
  for(int i=1;i<=num;i++)
  {
    if(i%2!=0)
      out=(i*i)-1;
     else
      out=(i*i)-2;
    cout<<out<<" ";
    
}}