#include <iostream>
using namespace std;
 
int main()
{
  int m,n,c,d,mat1[10][10],mat2[10][10],sum[10][10];
  cin>>m>>n;
  for(c=0;c<m;c++)
    for(d=0;d<n;d++)
      cin>>mat1[c][d];  
  for(c=0;c<m;c++)
    for(d=0;d<n;d++)
        cin>>mat2[c][d];
  for(c=0;c<m;c++)
    for(d=0;d<n;d++)
      sum[c][d]=mat1[c][d]+mat2[c][d]; 
  for(c=0;c<m;c++)
  {
    for(d=0;d<n;d++)
      cout<<sum[c][d]<<" ";
  cout<<endl;
  } 
  return 0;
}