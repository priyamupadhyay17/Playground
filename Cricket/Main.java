#include<iostream>
#include<cmath>
#include<stdio.h>
using namespace std;
int main()
{
  //Type your code here.
  int n,r,rs,nbb;
  float over,tnof,crr,trr;
  cin>>n;
  cin>>r;
  cin>>rs;
  cin>>nbb;
  over=n/6;
  cout<<over<<"\n";
  if(nbb%6!=0){
  
    float g=(nbb%6)*0.1;
  float k=(nbb/6)+g;
    tnof=k;
  }
 
  cout<<tnof<<"\n";
  
  crr=rs/tnof;
  printf("%.1f\n",crr);
  trr=r/over;
  printf("%.1f\n",trr);
 if(crr<5)
   cout<<"Not Eligible to Win";
  else
    cout<<"Eligible to Win";
}