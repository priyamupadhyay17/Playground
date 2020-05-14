#include<iostream>
using namespace std;
int main ()
{  
    int i, num1,num2, div, sum=0;
    cin>>num1;
  cin>>num2;
  int num=num1+num2;
    for(i=1;i<num;i++)
    {
        div=num%i;
        if(div==0)
        sum=sum+i;
    }
    if(sum==num)
        cout<<"They can read the message";
    else
        cout<<"They can't read the message";
    return 0;
}