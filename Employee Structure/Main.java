#include<iostream>
using namespace std;
struct employee{
  char desig[100],name[100];
  int age,id,salary;
};
int main()
{
  struct employee ob;
  cout<<"Enter name:";
  cin>>ob.name;
  cout<<"\n";
  cout<<"Enter ID:";
  cin>>ob.id;
  cout<<"\n";
  cout<<"Enter age:";
  cin>>ob.age;
  cout<<"\n";
  cout<<"Enter designation:";
  cin>>ob.desig;
  cout<<"\n";
  cout<<"Enter Salary:";
  cin>>ob.salary;
  cout<<"\n";
  cout<<"Employee Details\n";
  cout<<"Name of the Employee : "<<ob.name<<endl;
  cout<<"ID of the Employee : "<<ob.id<<endl;
  cout<<"Age of the Employee : "<<ob.age<<endl;
  cout<<"Designation of the Employee : "<<ob.desig<<endl;
  cout<<"Salary of the Employee : "<<ob.salary<<endl;
}

