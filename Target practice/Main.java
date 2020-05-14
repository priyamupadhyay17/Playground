#include<iostream>
using namespace std;
int main()
{
  int n,tas,count,s;
  cin>>n;
  tas=0;
  count=0;
  while(tas<n)
  {
    cin>>s;
    count++;
    tas+=s;
  }
  cout<<"The number of turns is "<<count;
  
  //Type your code here.
}