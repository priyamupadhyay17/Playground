#include<iostream>
using namespace std;
int main()
{
  int i, n,vol,sum=0;

   
  cin>>n;
   cin>>vol;
 int a[n];

  for(i=1;i<=n;i++)
  {
  cin>>a[i];
     }
  for(i=1;i<=n;i++){
  sum=sum+a[i];
  }
  
  if(sum==n)
  {
  cout<<"YES";
  }
  else{
  cout<<"NO";
  }
}