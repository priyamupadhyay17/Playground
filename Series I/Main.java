#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
  int n,i;
    float num=1.0;
  cin>>n;
  float num1=n;
   if(n==1)
      cout<<num1/2;
  else if(n!=1){
    float v=0.5;
   cout<<v<<" ";
  for(i=0;i<n-1;i++)
  {
    
    num=num*3;
    cout<<num/2<<" ";
  }}
}