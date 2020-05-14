#include<iostream>
using namespace std;
int main()
{
  int n,ecount,ocount,temp;
  cin>>n;
  ecount=0;
  ocount=0;
  while(n>0)
  {
temp=n%10;
    if(temp%2==0)
    {
      ecount+=temp;
    }
    else
    {
      ocount+=temp;
    }
    n=n/10;
  }
  if(ecount==ocount)
    cout<<"Yes";
  else
    cout<<"No";
  //Type your code here.
}