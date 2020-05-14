#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fd,fc,sd,sc,sc1,out;
  cin>>fd>>fc>>sd>>sc;
  sc1=fc+sc;
  out=(fd+sd);
  if(sc1>100){
    out++;
    sc1-=100;
    }
    cout<<out<<"\n"<<sc1;
    

}