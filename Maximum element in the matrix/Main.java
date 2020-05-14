#include <bits/stdc++.h> 
using namespace std;  
int main() 
{ 
  int N,M;
  cin>>N>>M;
    int mat[N][M]; 
    for(int i=0;i<N;i++){
      for(int j=0;j<M;j++){
        cin>>mat[i][j];}
      }
  int maxElement; 
    for (int i = 0; i < N; i++) { 
        for (int j = 0; j < M; j++) { 
            if (mat[i][j] > maxElement) { 
                maxElement = mat[i][j]; 
            } 
        } 
    } 
  cout<<"The maximum element is "<<maxElement;
    return 0; 
} 