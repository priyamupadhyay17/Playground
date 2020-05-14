#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,na,nc;
  cin>>w;
  cin>>na;
  cin>>nc;
  int adult=na*75;
  int child=nc*30;
  int total=adult+child;
  if(w>=total)
  cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}