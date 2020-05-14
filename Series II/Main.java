#include<iostream>
using namespace std;
int main()
{
  int num,out;
  cin>>num;
  out=121;
  for(int i=0;i<num;i++)
  {
    cout<<out<<" ";
    out+=104+(32*i);
  }
}