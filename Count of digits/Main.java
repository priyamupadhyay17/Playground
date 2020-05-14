#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int num,temp,count=0;
  cin>>num;
  temp=num;
  do
  {
    count++;
    temp/=10;
  }while(temp!=0);
  cout<<count;
}