#include<iostream>
using namespace std;
int main()
{
    int arr[2][2],sum=0;
    cout<< "Enter 4 numbers for matrix :";
    for(int i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        {
            cin>>arr[i][j];
        }

    }
    for(int i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        {
            cout<<arr[i][j]<< " ";
            sum=sum+arr[i][j];
        }
        cout<<endl;
    }
    cout<< " sum of matrix : "<<sum<<endl;
}
