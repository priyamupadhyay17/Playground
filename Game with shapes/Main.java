#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,ls;
  cin>>r;
  cin>>ls;
  if(r!=ls/2)
    cout<<"circle cannot be inside a square";
  else
    cout<<"circle can be inside a square";
}