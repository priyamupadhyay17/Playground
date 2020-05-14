#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int age;
  float time;
  cin>>age;
  cin>>time;
  if(age>13)
  {
    if(time<13.30)
      cout<<"$8.00";
    else
      cout<<"$5.00";
  }
  if(age<13){
    if(time<13.30)
      cout<<"$4.00";
    else
      cout<<"$2.00";
  }
}