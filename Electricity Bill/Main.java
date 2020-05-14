#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int units;
  int cost;
  cin>>units;
  if(units<=200)
    cost=units*0.5;
  else if(units<=400)
    cost=(units*0.65)+100;
  else if(units<=600)
    cost=(units*0.80)+200;
  else if(units>600)
    cost=(units*1.25)+425;
  cout<<"Rs."<<cost;
}