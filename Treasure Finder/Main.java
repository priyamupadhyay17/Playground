#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  cin>>a;
  cin>>b;
  cin>>c;
  if(a>=b && a>=c)
    {
        if(b>=c)
            cout<<"The treasure is in box which has number "<<b;
        else
            cout<<"The treasure is in box which has number "<<c;
    }
    else if(b>=a && b>=c)
    {
        if(a>=c)
            cout<<"The treasure is in box which has number "<<a;
        else
            cout<<"The treasure is in box which has number "<<c;
    }
  
    else if(a>=b)
        cout<<"The treasure is in box which has number "<<a;
    else
    cout<<"The treasure is in box which has number "<<b;
    

  if(b%a==0 && c%a==0)
    cout<<"\nThe code to open the box is "<<a;
  else if(a%b==0 && c%b==0)
     cout<<"\nThe code to open the box is "<<b;
  else if(a%c==0 && b%c==0)
     cout<<"\nThe code to open the box is "<<c;
  else
     cout<<"\nThe code to open the box is "<<"1";
}