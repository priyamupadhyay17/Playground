#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  if(a%a==0 && b%a==0 && c%a==0 && d==a)
    cout<<"Answer is correct.";
  else if(a%b==0 && b%b==0 && c%b==0 && d==b)
    cout<<"Answer is correct.";
  else if(a%c==0 && b%c==0 && c%c==0 && d==c)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}