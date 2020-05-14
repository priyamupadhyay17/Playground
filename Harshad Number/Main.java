#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  int num,temp,i,sum=0;
  cin>>temp;
  num=temp;
  while(num>0)
  {
    int rem=num%10;
      sum+=rem;
    num/=10;
  }
  if(temp%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}