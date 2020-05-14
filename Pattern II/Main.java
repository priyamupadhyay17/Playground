#include<iostream>
using namespace std;
int main()
{
  int i,j,k,l=1,N,d,r,count=0;
  cin>>N;
  for(i=1;i<=N;i++)
  {
    k=1;
    d=i%2;
    r=l+i-1;
    for(j=0;j<i;j++)
    {
 if(d==0)
      {
        cout<<r;
        r--;
        if(k<i)
        {
          cout<<"*";
          k=k+1;
        }
        l++;
        continue;
      }
      cout<<l;
      l++;
      if(k<i)
      {
        cout<<"*";
        k=k+1;
      }
    }
    cout<<"\n";
  }
  return 0;
}