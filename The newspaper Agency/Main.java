#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,x,y;
  std::cin>>w;
    std::cin>>x;
    std::cin>>y;
  int profit=(w*(x-y))-100;
  std::cout<<profit;
}