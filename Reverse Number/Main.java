#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  int num,rem,reverse;
  cin>>num;
  while(num!=0)
  {
    rem=num%10;
    reverse=(reverse*10)+rem;
    num/=10;
  }
  cout<<reverse;
	return 0;
}