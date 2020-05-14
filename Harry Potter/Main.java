#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  int num;
  std::cin>>num;
  int last=num%10;
  int first= num;
  for(int i=0;i<3;i++)
  {
    
    
        num = num /10;
   
  }
  first=num;
  int sum=last+first;
  std::cout<<sum;
  
}