#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
struct student S1;
cin.get(S1.name,50);
cin>>S1.roll>>S1.marks;
cout<<"\nStudent Details\n"<<"Name: "<<S1.name<<"\n"<<"Roll: "<<S1.roll<<"\n"<<"Marks: "<<S1.marks;
return 0;

}