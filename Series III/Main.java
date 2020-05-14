#include<iostream>
using namespace std;
int main()
{
  int num,out;
  cin>>num;
  out=6;
  for(int i=1;i<=num;i++)
  {
    cout<<out<<" ";
    out+=5*i;
  }
}