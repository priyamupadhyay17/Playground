#include<iostream>
using namespace std;

 int main()
  {
  int i,n,no,pos;
   cout<<"Enter the number of elements in the array\n";
   cin>>n;
   int a[n];
  cout<<"Enter the elements in the array\n";
  for(i=0;i<n;i++)
  {
  cin>>a[i];
  }
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>pos;
  if(pos>5)
  {
  cout<<"Invalid Input";
  }
  else
  {
  cout<<"Enter the value to insert\n";
  cin>>no;
  --pos;
  for(i=n;i>=pos;i--)
  {
  a[i+1]=a[i];
  }
  a[pos]=no;
  cout<<"Array after insertion is\n";
  for(i=0;i<=n;i++)
  {
  cout<<a[i]<<"\n";
  }
  }
  return 0;
  }