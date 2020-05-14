#include<iostream>
using namespace std;
int main()
{
  int m,n,req,temp=1;
  cin>>m>>n>>req;
  
  while (n!= 0) {
        temp*=m;
        --n;
    }
  if(temp>=req)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}