#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b;
  cin>>a>>b;
  cout<<"Enter the value of a"<<"\n";
  cout<<"Enter the value of n\n";
  int temp=1;
  for(int i=1;i<=b;i++)
    temp*=a;
  cout<<"The value of "<<a<<" power "<<b<<" is "<<temp;
}