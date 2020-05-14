#include<iostream>
using namespace std; 
const int MAX = 100; 
void largestInColumn(int mat[][MAX], int rows, int cols) 
{ 
    for (int i = 0; i < cols; i++) { 
      
        int maxm = mat[0][i]; 
  
        
        for (int j = 1; j < rows; j++) { 
            
            if (mat[j][i] > maxm) 
                maxm = mat[j][i]; 
        } 
  
       
        cout << maxm << endl; 
    } 
} 
 
int main() 
{ 
    int n , m ,i,j;
  cin>>n;
  cin>>m;
    int mat[90][MAX] ;
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
    cin>>mat[i][j];
    }
  }
  
    largestInColumn(mat, n, m); 
  
    return 0; 
} 
