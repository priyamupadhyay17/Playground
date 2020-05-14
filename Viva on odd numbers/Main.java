#include<iostream>
using namespace std;
int main()
{
  int n,num;
  float count;
  count=0;
  n=3;
  for(int i=0;i<n;i++)
  {
cin>>num;
    if(num%2!=0&&num>0)
    {
      count+=1;
    }
    else if(num%2==0&&num>0)
    {
      count-=0.5;
      n+=1;
    }
    else
    {
      count-=1.0;
      break;
    }
  }
  cout<<count;
      
    
  //Type your code here.
}