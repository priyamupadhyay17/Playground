#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num,count=0,i;
  cin>>num;
  cout<<num<<"\n";
 while(num!=1){
  if(num%2==0){
    num=num/2;
    cout<<num<<"\n";
    count++;
  }
    else{
    num=(3*num)+1;
    cout<<num<<"\n";
    count++;
  }
 }
  cout<<count;
}