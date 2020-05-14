#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num,fact=1;
  cin>>num;
  for(int i=1;i<=num;i++){
    fact=fact*i;
  }
  cout<<"The factorial of "<<num<<" is "<<fact;
}