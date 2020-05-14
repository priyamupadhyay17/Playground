#include<iostream>
using namespace std;
int main()
{    
  int n;
  cin>>n;
    int arr[n];
  for(int i=0;i<n;i++)
    cin>>arr[i];   
    int i,oddSum=0,evenSum=0;
    for(i=0; i<n; i++){
        if(arr[i]%2==0){
        evenSum=evenSum+arr[i];
        }
    else{
             oddSum=oddSum+arr[i];
        }
    }
    cout<<"The sum of the even numbers in the array is "<<evenSum;
    cout<<"\nThe sum of the odd numbers in the array is "<<oddSum;
    return 0;
}