#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float f1,f2,f3,s1,s2,s3,a1,a2,a3;
  cin>>f1;
    cin>>f2;
    cin>>f3;
    cin>>s1;
    cin>>s2;
    cin>>s3;
    cin>>a1;
    cin>>a2;
  cin>>a3;
  float fl1=(f1*f2)/100;
  float flip=(f1-fl1)+f3;
  float sn1=(s1*s2)/100;
  float snap=(s1-sn1)+s3;
  float am1=(a1*a2)/100;
  float amaz=(a1-am1)+a3;
  cout<<"In Flipkart Rs."<<flip<<"\n"<<"In Snapdeal Rs."<<snap<<"\n"<<"In Amazon Rs."<<amaz;
  if(flip<=snap && flip<amaz)
     cout<<"\n"<<"He will prefer Flipkart";
    if(snap<flip && snap<amaz)
     cout<<"\n"<<"He will prefer Snapdeal";
    if(amaz<flip && amaz<snap)
     cout<<"\nHe will prefer Amazon";
}