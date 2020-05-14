#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,r,y;
  std::cin>>p;
  std::cin>>r;
  std::cin>>y;
  float si=(p*r*y)/100;
  std::cout<<si<<"\n";
  float a=p+si;
  std::cout<<a<<"\n";
float d=(2*si)/100;
  std::cout<<d<<"\n";
  float fs=p+(si-d);
  std::cout<<fs;


}