#include <iostream>
using namespace std;
int main(){
   int n,big;
   int arr[50];
   cin>>n;
 for(int i=0;i<n;i++) {
      cin>>arr[i];
   }
   big=arr[0];
   for(int i = 1;i < n; i++) {
     
      if(big<arr[i])
         big=arr[i];
   } 
   cout<<big;
   return 0;
}