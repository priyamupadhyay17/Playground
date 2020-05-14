#include<iostream>
using namespace std;
void pattern(int);
int main()
{
        int n;
       cin>>n;
       pattern(n);
       return 0;
}
void pattern(int n)
{       
       int i, j, k, s, a = 1,b = n*n + 1;
       for (i = n; i >= 1; i--) {           
               for (s = 0; s < n-i; s++)
                      cout<<"--";
               for (j = 0; j < i; j++)
                      cout<<a++<<"*";
               for (k = 0; k < i - 1; k++)
                      cout<<b++<<"*";
               cout<<b<<"\n";       
               b -= 2*(i - 1);
       }       
}
